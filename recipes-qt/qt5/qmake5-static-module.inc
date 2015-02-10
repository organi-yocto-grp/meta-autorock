require qmake5-static.inc

SEPB = "${WORKDIR}/build"
B = "${SEPB}"

DEPENDS += "qtbase-static"

do_configure() {
	${OE_QMAKE_PATH_HOST_BINS}/qmake `ls ${S}/*.pro`
}

# prevent already-stripped QA Issue
INHIBIT_PACKAGE_STRIP = "1"

do_install_append() {
	RMDIRNAME=`ls ${D}`
	mv ${D}${STAGING_DIR_TARGET}${OE_QMAKE_PATH_PREFIX} ${D}
	rm -rf ${D}/${RMDIRNAME}
}

