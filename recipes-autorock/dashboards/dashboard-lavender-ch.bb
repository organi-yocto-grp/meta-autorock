require dashboard.inc
SUMMARY = "Dashboard application for Project Lavender"

SRC_URI += "git://git@gitlab.autorock.com/huatai-dashboard/dashboard-b21-scale.git;branch=${SRCBRANCH};protocol=ssh \
		file://0001-enable-initfs-and-qtquickcompiler.patch \
"

SRCBRANCH = "chinese"
SRCREV = "5b92ec66dc099defe1e3bbd4640a8db821a05b28"
PV = "1.0+git${SRCPV}"
PR = "r0"

DEPENDS += " \
        qtdeclarative-static qtserialport-static qtgraphicaleffects-static \
        qt3d-static \
        qtquickcontrols-static \
"

RDEPENDS_${PN} = " \
        qtdeclarative-static-qmlplugins qtgraphicaleffects-static-qmlplugins \
        qt3d-static-qmlplugins \
        qtquickcontrols-static-qmlplugins \
"

do_install() {
	install -d ${D}/startup
	install -m 0755 ${B}/bin/huatai-b21 ${D}/startup/run

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}