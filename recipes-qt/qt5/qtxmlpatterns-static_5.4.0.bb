require recipes-qt/qt5/qt5-${PV}.inc
require qmake5-static.inc

QT_MODULE = "qtxmlpatterns"

SEPB = "${WORKDIR}/build"
B = "${SEPB}"

DEPENDS += "qtbase-static qtbase-static-cross"

LICENSE += "| GPL-2.0"
LIC_FILES_CHKSUM += "file://LICENSE.GPLv2;md5=e782f55badfa137e5e59c330f12cc8ed"

SRC_URI[md5sum] = "5ad30d6b478d4e5d71e9c5bef3f3fbf7"
SRC_URI[sha256sum] = "791c697b9bc7a5384e3d0dbec56af7f2194fe7dc91f8b1e0fd502089135e5425"

do_configure() {
	qmake `ls ${S}/*.pro`
}

do_install() {
	oe_runmake install INSTALL_ROOT=${D}
}

