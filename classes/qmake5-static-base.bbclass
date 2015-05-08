OE_QMAKESPEC = "${STAGING_DATADIR_NATIVE}/${QT_DIR_NAME}/mkspecs/linux-g++"
OE_XQMAKESPEC = "${STAGING_DATADIR_NATIVE}/${QT_DIR_NAME}/mkspecs/devices/linux-oe-g++"

# this one needs to be exported, because qmake reads it from shell env
export QT_CONF_PATH = "${WORKDIR}/qt.conf"

do_generate_qt_config_file() {
    cat > ${QT_CONF_PATH} <<EOF
[Paths]
Prefix = ${STAGING_DIR_TARGET}${OE_QMAKE_PATH_PREFIX}
Headers = ${STAGING_DIR_TARGET}${OE_QMAKE_PATH_HEADERS}
Libraries = ${STAGING_DIR_TARGET}${OE_QMAKE_PATH_LIBS}
ArchData = ${STAGING_DIR_TARGET}${OE_QMAKE_PATH_ARCHDATA}
Data = ${STAGING_DIR_TARGET}${OE_QMAKE_PATH_DATA}
Binaries = ${STAGING_DIR_TARGET}${OE_QMAKE_PATH_BINS}
LibraryExecutables = ${STAGING_DIR_TARGET}${OE_QMAKE_PATH_LIBEXECS}
Plugins = ${STAGING_DIR_TARGET}${OE_QMAKE_PATH_PLUGINS}
Imports = ${STAGING_DIR_TARGET}${OE_QMAKE_PATH_IMPORTS}
Qml2Imports = ${STAGING_DIR_TARGET}${OE_QMAKE_PATH_QML}
Translations = ${STAGING_DIR_TARGET}${OE_QMAKE_PATH_TRANSLATIONS}
Documentation = ${STAGING_DIR_TARGET}${OE_QMAKE_PATH_DOCS}
Settings = ${STAGING_DIR_TARGET}${OE_QMAKE_PATH_SETTINGS}
Examples = ${STAGING_DIR_TARGET}${OE_QMAKE_PATH_EXAMPLES}
Tests = ${STAGING_DIR_TARGET}${OE_QMAKE_PATH_TESTS}
HostBinaries = ${OE_QMAKE_PATH_HOST_BINS}
HostData = ${OE_QMAKE_PATH_HOST_DATA}
HostLibraries = ${OE_QMAKE_PATH_HOST_LIBS}
HostSpec = ${OE_QMAKESPEC}
TartgetSpec = ${OE_XQMAKESPEC}
Sysroot = ${STAGING_DIR_TARGET}
EOF
}

addtask generate_qt_config_file after do_patch before do_configure
