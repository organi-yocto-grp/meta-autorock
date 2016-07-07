require dashboard.inc
SUMMARY = "Dashboard application for Project Hall"

SRC_URI += "git://git@gitlab.autorock.com/huatai-dashboard/dashboard-a25.git;branch=${SRCBRANCH};protocol=ssh \
		file://0001-enable-initfs-and-qtquickcompiler.patch \
"

SRCBRANCH = "master"
SRCREV = "44ee87ef08cb167535018c5a573c1c1e2a6fce02"
PV = "1.0+git${SRCPV}"
PR = "r0"

DEPENDS += "qtdeclarative-static qtserialport-static qtquickcontrols-static"

RDEPENDS_${PN} = "qtdeclarative-static-qmlplugins  qtquickcontrols-static-qmlplugins"

do_install() {
	install -d ${D}/startup
	install -m 0755 ${B}/bin/huatai-a25 ${D}/startup/run

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
