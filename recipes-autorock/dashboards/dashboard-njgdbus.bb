require dashboard.inc
SUMMARY = "NJGDBUS dashboard application"

SRC_URI += "git://git@git.autorock.com/njgdbus-dashboard/dashboard.git;branch=${SRCBRANCH};protocol=ssh \
		file://0001-enable-initfs-and-qtquickcompiler.patch \
"

SRCBRANCH = "master"
SRCREV = "9397b315a6368b3f8659ce4756ce7b03501f0b77"
PV = "1.0+git${SRCPV}"
PR = "r0"

DEPENDS += "qtdeclarative-static qtserialport-static"

RDEPENDS_${PN} = ""

do_install_append() {
	install -m 0755 ${B}/bin/njgdbus ${D}/startup/run

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
