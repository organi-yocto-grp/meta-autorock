require dashboard.inc
SUMMARY = "car3d demo for glitem"

SRC_URI += "git://git@zkgit.iask.in/dashboards/car3d.git;branch=${SRCBRANCH};protocol=ssh \
	file://0001-enable-initfs-and-qtquickcompiler.patch \
"

SRCBRANCH = "master"
SRCREV = "aeb8a44a04fb794a01deb70533fb52fca6ec6d94"
PV = "1.0+git${SRCPV}"
PR = "r0"

DEPENDS += "qtdeclarative-static qtserialport-static glitem-static"

RDEPENDS_${PN} = "qtdeclarative-static-qmlplugins glitem-static-qmlplugins"

do_install() {
	install -d ${D}/startup
	install -m 0755 ${B}/bin/car3d ${D}/startup/run

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
