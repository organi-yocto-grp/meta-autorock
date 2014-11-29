SUMMARY = "BMW dashboard application"
SECTION = "autorock"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ce5c45ec07856b6907cbfe6feee1d180"

SRC_URI = "git://git@git.autorock.com/dashboards/bmw.git;branch=${SRCBRANCH};protocol=ssh \
           file://init \
		   file://MIT.patch \
"

#PROVIDES = "virtual/dashboard"

SRCBRANCH = "master"
SRCREV = "${AUTOREV}"
LOCALVERSION = "-${SRCBRANCH}+git${SRCREV}"

PV = "0+git${SRCPV}"

S = "${WORKDIR}/git"

require recipes-qt/qt5/qt5.inc

do_install() {
	install -d ${D}${datadir}/${PN}
	install -m 0644 ${WORKDIR}/init ${D}${datadir}/${PN}
	install -m 0755 ${B}/bin/bmw ${D}${datadir}/${PN}
	cp -a ${S}/3ds ${D}${datadir}/${PN}

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}

FILES_${PN}-dbg += "${datadir}/${PN}/.debug"
FILES_${PN} += "${datadir} ${libdir}"

DEPENDS = "qtdeclarative qtgraphicaleffects"

RDEPENDS_${PN} = "qtdeclarative qtgraphicaleffects-qmlplugins"

