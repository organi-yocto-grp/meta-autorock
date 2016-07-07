require dashboard.inc
SUMMARY = "Dashboard application for Project Hall"

SRC_URI += "git://git@gitlab.autorock.com/huatai-dashboard/dashboard-a25.git;branch=${SRCBRANCH};protocol=ssh \
		file://0001-enable-initfs-and-qtquickcompiler.patch \
"

SRCBRANCH = "chinese"
SRCREV = "79aeb79d2e36f68da465d341d5a833c4ed149268"
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
