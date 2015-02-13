SECTION = "autorock"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

#PROVIDES = "virtual/dashboard"

S = "${WORKDIR}/git"

inherit qmake5-static

SRC_URI += "file://qmldir"

do_install() {
	# for static linked app fail to find qtquick
	install -d ${D}/startup/QtQuick.2
	install -m 644 ${WORKDIR}/qmldir ${D}/startup/QtQuick.2
}

FILES_${PN}-dbg += "/startup/.debug"
FILES_${PN} += "/startup ${libdir} ${datadir}"
