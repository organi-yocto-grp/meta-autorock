require dashboard.inc
SUMMARY = "BMW dashboard application"

SRC_URI = "git://git@git.autorock.com/dashboards/bmw.git;branch=${SRCBRANCH};protocol=ssh \
"

SRCBRANCH = "master"
SRCREV = "${AUTOREV}"
LOCALVERSION = "-${SRCBRANCH}+git${SRCREV}"

PV = "0+git${SRCPV}"

DEPENDS += "qtgraphicaleffects-static"

RDEPENDS_${PN} = ""

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${B}/bin/bmw ${D}${bindir}

	install -d ${D}${datadir}/${PN}
	cp -a ${S}/3ds ${D}${datadir}/${PN}

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
