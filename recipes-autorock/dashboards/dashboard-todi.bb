require dashboard.inc
SUMMARY = "Dashboard application for Project Todi"

SRC_URI += "git://git@gitlab.autorock.com/Todi/05software-core.git;branch=${SRCBRANCH};protocol=ssh \
		file://0001-enable-initfs-and-qtquickcompiler.patch \
"

SRCBRANCH = "master"
SRCREV = "6876754abdb5c1fc2192af6a419f1b7dcf76ebb9"
PV = "1.1+git${SRCPV}"
PR = "r0"

DEPENDS += "qtdeclarative-static qtserialport-static qtquickcontrols-static qtgraphicaleffects-static"

RDEPENDS_${PN} = "qtdeclarative-static-qmlplugins qtquickcontrols-static-qmlplugins qtgraphicaleffects-static-qmlplugins"

do_install() {
	install -d ${D}/startup
	install -m 0755 ${B}/bin/todi ${D}/startup/run

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
