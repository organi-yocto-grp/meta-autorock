SUMMARY = "BMW dashboard application"
SECTION = "autorock"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://git@git.autorock.com/dashboards/bmw.git;branch=${SRCBRANCH};protocol=ssh \
"

#PROVIDES = "virtual/dashboard"

SRCBRANCH = "master"
SRCREV = "${AUTOREV}"
LOCALVERSION = "-${SRCBRANCH}+git${SRCREV}"

PV = "0+git${SRCPV}"

S = "${WORKDIR}/git"

DEPENDS = "qtgraphicaleffects-static"

RDEPENDS_${PN} = ""

inherit qmake5-static

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${B}/bin/bmw ${D}${bindir}

	install -d ${D}${datadir}/${PN}
	cp -a ${S}/3ds ${D}${datadir}/${PN}

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}

FILES_${PN}-dbg += "${datadir}/${PN}/.debug"
FILES_${PN} += "${bindir} ${datadir} ${libdir}"
