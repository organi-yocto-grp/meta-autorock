require dashboard.inc
SUMMARY = "HAVAL-H6 dashboard application for 10 inches"

SRC_URI += "git://git@zkgit.iask.in/Haval-H6/dashboard-haval-h6-10inch.git;branch=${SRCBRANCH};protocol=ssh \
	file://0001-enable-initfs-and-qtquickcompiler.patch \
"

SRCBRANCH = "forshow"
SRCREV = "e98dcc6539adb541b92e1a3b49f22ed9c9e3c979"
PV = "1.0+git${SRCPV}"
PR = "r0"

DEPENDS += "qtdeclarative-static qtserialport-static"

RDEPENDS_${PN} = "qtdeclarative-static-qmlplugins"

do_install() {
	install -d ${D}/startup
	install -m 0755 ${B}/bin/haval ${D}/startup/run

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
