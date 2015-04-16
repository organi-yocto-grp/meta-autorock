require dashboard.inc
SUMMARY = "BMW dashboard application"

SRC_URI += "git://git@git.autorock.com/dashboards/bmw.git;branch=${SRCBRANCH};protocol=ssh \
"

SRCBRANCH = "master"
SRCREV = "${AUTOREV}"
LOCALVERSION = "-${SRCBRANCH}+git${SRCREV}"

PV = "0+git${SRCPV}"

DEPENDS += "qtgraphicaleffects-static"

RDEPENDS_${PN} = "qtdeclarative-static-qmlplugins qtgraphicaleffects-static-qmlplugins"

do_install() {
	install -d ${D}/startup
	install -m 0755 ${B}/bin/bmw ${D}/startup/run
	cp -a ${S}/3ds ${D}/

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
