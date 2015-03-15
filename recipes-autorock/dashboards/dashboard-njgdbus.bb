require dashboard.inc
SUMMARY = "NJGDBUS dashboard application"

SRC_URI += "git://git@git.autorock.com/njgdbus-dashboard/dashboard.git;branch=${SRCBRANCH};protocol=ssh \
		file://0001-enable-initfs-and-qtquickcompiler.patch \
"

SRCBRANCH = "master"
SRCREV = "e98ad369c35c6c18140b338601c71f8c77e9e57a"
PV = "1.2+git${SRCPV}"
PR = "r0"

DEPENDS += "qtdeclarative-static qtserialport-static"

RDEPENDS_${PN} = ""

do_install_append() {
	install -m 0755 ${B}/bin/njgdbus ${D}/startup/run

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
