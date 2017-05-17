require dashboard.inc
SUMMARY = "Dashboard application for Project Carnation"

SRC_URI += "git://git@gitlab.autorock.com/yangmengkui/final_meter_show.git;branch=${SRCBRANCH};protocol=ssh \
"

SRCBRANCH = "master"
SRCREV = "18e208243334fc730b4fb29ed0df961126d4e63f"
PV = "1.0+git${SRCPV}"
PR = "r0"

DEPENDS += "qtdeclarative-static qtserialport-static"

RDEPENDS_${PN} = "qtdeclarative-static-qmlplugins"

do_install() {
	install -d ${D}/startup
	install -m 0755 ${B}/bin/showMeter ${D}/startup/run

	install -d ${D}${libdir}
	#cp -a ${S}/fonts ${D}${libdir}
}
