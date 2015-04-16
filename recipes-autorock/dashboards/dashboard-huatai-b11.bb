require dashboard.inc
SUMMARY = "Huatai B11 dashboard application"

SRC_URI += " \
	git://git@git.autorock.com/huatai-dashboard/dashboard-b11.git;branch=${SRCBRANCH};protocol=ssh \
	file://0001-enable-initfs-and-qtquickcompiler.patch \
"

SRCBRANCH = "master"
SRCREV = "2b274220679d7e0cfdbd0a9093dd517c7b41c700"
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
	install -m 0755 ${B}/bin/huatai-b11 ${D}/startup/run
	cp -a ${S}/3ds ${D}/startup

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
