QT_VERSION = "5.4.0"

require qtbase-static.inc
require qmake5-static-path.inc

inherit cross

PACKAGECONFIG = "release"

do_install() {
	oe_runmake install INSTALL_ROOT=${D}
	rm -rf ${D}/${STAGING_DIR_TARGET}
}

sysroot_stage_dirs_append() {
    # $to is 2nd parameter passed to sysroot_stage_dir, e.g. ${SYSROOT_DESTDIR} passed from sysroot_stage_all
    cp -ra ${D}/* $to
}
