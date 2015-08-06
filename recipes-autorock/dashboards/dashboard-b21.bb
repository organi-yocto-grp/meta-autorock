require dashboard.inc
SUMMARY = "Dashboard application for Project B21"

SRC_URI += "git://git@gitlab.autorock.com/huatai-dashboard/dashboard-b21-scale.git;branch=${SRCBRANCH};protocol=ssh \
		file://0001-enable-initfs-and-qtquickcompiler.patch \
"

SRCBRANCH = "master"
SRCREV = "69dc72cfda2497cb03ec61145933bb395a62c5c7"
PV = "1.0+git${SRCPV}"
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
	install -m 0755 ${B}/bin/huatai-b21 ${D}/startup/run

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
