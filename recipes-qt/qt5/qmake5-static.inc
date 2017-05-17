inherit qmake5-static-base

do_install() {
	oe_runmake install INSTALL_ROOT=${D}
}

SEPB = "${WORKDIR}/build"
B = "${SEPB}"

do_populate_sysroot[sstate-outputdirs] = "${STAGING_DIR}"

sysroot_stage_dirs_append() {
    # $to is 2nd parameter passed to sysroot_stage_dir, e.g. ${SYSROOT_DESTDIR} passed from sysroot_stage_all
	cp -ra ${D}/${STAGING_DIR}/* $to
    rm -rf $to/${MACHINE}/${OE_QMAKE_PATH_LIBS}/fonts
}

python perform_packagecopy_append () {
    pkgdest = d.getVar('PKGD', True)
    staging_dir_target = d.getVar('STAGING_DIR_TARGET', True)
    prefix = d.getVar('prefix', True)
    rmpaths = os.listdir(pkgdest)
    # move out target files
    os.rename(pkgdest + staging_dir_target + prefix, pkgdest + prefix)
    # remove host files
    for path in rmpaths:
        rmpath = os.path.join(pkgdest, path)
        if os.path.isdir(rmpath):
            bb.utils.prunedir(rmpath)
        else:
            os.remove(rmpath)
}

PACKAGES =. "${PN}-qmlplugins-dbg ${PN}-tools-dbg ${PN}-plugins-dbg ${PN}-qmlplugins ${PN}-tools ${PN}-plugins ${PN}-mkspecs ${PN}-examples-dev ${PN}-examples-staticdev ${PN}-examples-dbg ${PN}-examples "

SOLIBS = ".so.*"
SOLIBSDEV = ".so"

# extra -dbg packages
FILES_${PN}-qmlplugins-dbg = " \
    ${OE_QMAKE_PATH_QML}/*/.debug \
    ${OE_QMAKE_PATH_QML}/*/*/.debug \
    ${OE_QMAKE_PATH_QML}/*/*/*/.debug \
    ${OE_QMAKE_PATH_IMPORTS}/*/.debug \
    ${OE_QMAKE_PATH_IMPORTS}/*/*/.debug \
    ${OE_QMAKE_PATH_IMPORTS}/*/*/*/.debug \
"
FILES_${PN}-tools-dbg = " \
    ${OE_QMAKE_PATH_BINS}/.debug \
"
FILES_${PN}-plugins-dbg = " \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug/* \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/.debug/* \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/*/.debug/* \
"

# extra packages
# qmlplugins 1-4 levels of subdirs qmldir + *{.so,*.qmltypes,*.qml,*js}
FILES_${PN}-qmlplugins = " \
    ${OE_QMAKE_PATH_QML}/*/*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_QML}/*/qmldir \
    ${OE_QMAKE_PATH_QML}/*/*.qmltypes \
    ${OE_QMAKE_PATH_QML}/*/*.qml \
    ${OE_QMAKE_PATH_QML}/*/*.js \
    ${OE_QMAKE_PATH_QML}/*/*/*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_QML}/*/*/qmldir \
    ${OE_QMAKE_PATH_QML}/*/*/*.qmltypes \
    ${OE_QMAKE_PATH_QML}/*/*/*.qml \
    ${OE_QMAKE_PATH_QML}/*/*/*.js \
    ${OE_QMAKE_PATH_QML}/*/*/*/*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_QML}/*/*/*/qmldir \
    ${OE_QMAKE_PATH_QML}/*/*/*/*.qmltypes \
    ${OE_QMAKE_PATH_QML}/*/*/*/*.qml \
    ${OE_QMAKE_PATH_QML}/*/*/*/*.js \
    ${OE_QMAKE_PATH_QML}/*/*/*/*.png \
    ${OE_QMAKE_PATH_QML}/*/*/*/*/*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_QML}/*/*/*/*/qmldir \
    ${OE_QMAKE_PATH_QML}/*/*/*/*/*.qmltypes \
    ${OE_QMAKE_PATH_QML}/*/*/*/*/*.qml \
    ${OE_QMAKE_PATH_QML}/*/*/*/*/*.js \
    ${OE_QMAKE_PATH_QML}/*/*/*/*/*/*.png \
    ${OE_QMAKE_PATH_IMPORTS}/*.qmltypes \
    ${OE_QMAKE_PATH_IMPORTS}/*/*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_IMPORTS}/*/*.qmltypes \
    ${OE_QMAKE_PATH_IMPORTS}/*/qmldir \
    ${OE_QMAKE_PATH_IMPORTS}/*/*/*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_IMPORTS}/*/*/*.qmltypes \
    ${OE_QMAKE_PATH_IMPORTS}/*/*/qmldir \
    ${OE_QMAKE_PATH_IMPORTS}/*/*/*/*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_IMPORTS}/*/*/*/*.qmltypes \
    ${OE_QMAKE_PATH_IMPORTS}/*/*/*/qmldir \
"

FILES_${PN}-tools = " \
    ${OE_QMAKE_PATH_BINS}/* \
"
FILES_${PN}-plugins = " \
    ${OE_QMAKE_PATH_PLUGINS}/*/*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/*/*${SOLIBSDEV} \
"
FILES_${PN}-mkspecs = "\
    ${OE_QMAKE_PATH_ARCHDATA}/mkspecs \
"

# modifications to normal packages
FILES_${PN} += " \
    ${OE_QMAKE_PATH_LIBS}/lib*${SOLIBS} \
    ${OE_QMAKE_PATH_LIBEXECS} \
"
FILES_${PN}-dev += " \
    ${OE_QMAKE_PATH_LIBS}/lib*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_LIBS}/pkgconfig \
    ${OE_QMAKE_PATH_LIBS}/cmake/* \
    ${OE_QMAKE_PATH_LIBS}/*.prl \
    ${OE_QMAKE_PATH_LIBS}/*.la \
    ${OE_QMAKE_PATH_DATA}/* \
    ${OE_QMAKE_PATH_HEADERS}/* \
	${OE_QMAKE_PATH_QML}/*/*.prl \
	${OE_QMAKE_PATH_QML}/*/*/*.prl \
	${OE_QMAKE_PATH_QML}/*/*/*/*.prl \
	${OE_QMAKE_PATH_PLUGINS}/*/*.prl \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/*.prl \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/*/*.prl \
"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_LIBS}/.debug \
    ${OE_QMAKE_PATH_LIBEXECS}/.debug \
"
FILES_${PN}-staticdev += " \
    ${OE_QMAKE_PATH_LIBS}/*.a \
	${OE_QMAKE_PATH_QML}/*/*.a \
	${OE_QMAKE_PATH_QML}/*/*/*.a \
	${OE_QMAKE_PATH_QML}/*/*/*/*.a \
	${OE_QMAKE_PATH_PLUGINS}/*/*.a \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/*.a \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/*/*.a \
"
FILES_${PN}-examples = " \
    ${OE_QMAKE_PATH_EXAMPLES}/*/* \
"
FILES_${PN}-examples-dev = " \
    ${OE_QMAKE_PATH_EXAMPLES}/*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/*/*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/*/*/*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/*/*/*/*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/*/*/*/*/*${SOLIBSDEV} \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/*/*/*/*/*/*${SOLIBSDEV} \
"
FILES_${PN}-examples-dbg = " \
    ${OE_QMAKE_PATH_EXAMPLES}/.debug \
    ${OE_QMAKE_PATH_EXAMPLES}/*/.debug \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/.debug \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/*/.debug \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/*/*/.debug \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/*/*/*/.debug \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/*/*/*/*/.debug \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/*/*/*/*/*/.debug \
"
FILES_${PN}-examples-staticdev = " \
    ${OE_QMAKE_PATH_EXAMPLES}/*.a \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*.a \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/*.a \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/*/*.a \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/*/*/*.a \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/*/*/*/*.a \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/*/*/*/*/*.a \
    ${OE_QMAKE_PATH_EXAMPLES}/*/*/*/*/*/*/*/*.a \
"

