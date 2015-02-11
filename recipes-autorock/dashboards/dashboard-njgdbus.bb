require dashboard.inc
SUMMARY = "NJGDBUS dashboard application"

SRC_URI = "git://git@git.autorock.com/njgdbus-dashboard/dashboard.git;branch=${SRCBRANCH};protocol=ssh \
"

SRCBRANCH = "master"
SRCREV = "${AUTOREV}"
LOCALVERSION = "-${SRCBRANCH}+git${SRCREV}"

PV = "0+git${SRCPV}"

DEPENDS += "qtdeclarative-static qtserialport-static"

RDEPENDS_${PN} = ""

do_patch() {
	sed -i 's/#CONFIG += qtquickcompiler/CONFIG += qtquickcompiler/' ${S}/njgdbus.pro
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${B}/bin/njgdbus ${D}${bindir}

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
