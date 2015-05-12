require dashboard.inc
SUMMARY = "car3d demo for glitem"

SRC_URI += " \
	git://git@gitlab.autorock.com/dashboards/car3d.git;branch=${SRCBRANCH};protocol=ssh \
"

SRCBRANCH = "master"
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
PR = "r0"

DEPENDS += "glitem-static"

RDEPENDS_${PN} = "qtdeclarative-static-qmlplugins glitem-static-qmlplugins"

do_install() {
	install -d ${D}/startup
	install -m 0755 ${B}/bin/car3d ${D}/startup/run
}
