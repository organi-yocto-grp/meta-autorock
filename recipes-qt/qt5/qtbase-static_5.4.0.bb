QT_VERSION = "5.4.0"

require qtbase-static.inc
require qmake5-static.inc

PACKAGECONFIG = "release libs gles2 widgets gui freetype jpeg libpng"

PACKAGES =. " \
    ${PN}-fonts \
    ${PN}-fonts-ttf-vera \
    ${PN}-fonts-ttf-dejavu \
    ${PN}-fonts-pfa \
    ${PN}-fonts-pfb \
    ${PN}-fonts-qpf \
"

RRECOMMENDS_${PN}-fonts = " \
    ${PN}-fonts-ttf-vera \
    ${PN}-fonts-ttf-dejavu \
    ${PN}-fonts-pfa \
    ${PN}-fonts-pfb \
    ${PN}-fonts-qpf \
"

ALLOW_EMPTY_${PN}-fonts = "1"

FILES_${PN}-fonts-ttf-vera       = "${OE_QMAKE_PATH_LIBS}/fonts/Vera*.ttf"
FILES_${PN}-fonts-ttf-dejavu     = "${OE_QMAKE_PATH_LIBS}/fonts/DejaVu*.ttf"
FILES_${PN}-fonts-pfa            = "${OE_QMAKE_PATH_LIBS}/fonts/*.pfa"
FILES_${PN}-fonts-pfb            = "${OE_QMAKE_PATH_LIBS}/fonts/*.pfb"
FILES_${PN}-fonts-qpf            = "${OE_QMAKE_PATH_LIBS}/fonts/*.qpf*"
FILES_${PN}-fonts                = "${OE_QMAKE_PATH_LIBS}/fonts/README"

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
