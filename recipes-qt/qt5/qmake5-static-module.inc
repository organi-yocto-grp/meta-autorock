require qmake5-static.inc

DEPENDS += "qtbase-static"

do_configure() {
	${OE_QMAKE_PATH_HOST_BINS}/qmake `ls ${S}/*.pro`
}

# prevent already-stripped QA Issue
INHIBIT_PACKAGE_STRIP = "1"
