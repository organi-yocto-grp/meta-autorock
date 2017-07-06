require dashboard.inc
SUMMARY = "Huatai B11 dashboard application"

SRC_URI += "git://git@zkgit.iask.in/huatai-dashboard/dashboard-b11.git;branch=${SRCBRANCH};protocol=ssh \
	file://0001-enable-initfs-and-qtquickcompiler.patch \
"

SRCBRANCH = "master"
SRCREV = "0454dde145d4244e7cefdfb067adf7278a4b7d80"
PV = "1.1+git${SRCPV}"
PR = "r0"

DEPENDS += " \
	qtdeclarative-static qtserialport-static qtgraphicaleffects-static \
	qt3d-static \
"

RDEPENDS_${PN} = " \
	qtdeclarative-static-qmlplugins qtgraphicaleffects-static-qmlplugins \
	qt3d-static-qmlplugins \
"

do_install() {
	install -d ${D}/startup
	install -m 0755 ${B}/bin/huatai-b11 ${D}/startup/run

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
