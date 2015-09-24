require dashboard.inc
SUMMARY = "Dashboard application for Project Todi"

SRC_URI += "git://git@gitlab.autorock.com/Todi/05software-core.git;branch=${SRCBRANCH};protocol=ssh \
	file://0001-enable-initfs-and-qtquickcompiler.patch \
"

SRCBRANCH = "master"
SRCREV = "922ea0d748e8b10031dee9c05b26933646435b4e"
PV = "1.1+git${SRCPV}"
PR = "r0"

DEPENDS += "qtserialport-static qtdeclarative-static qtquickcontrols-static qtgraphicaleffects-static"

RDEPENDS_${PN} = "qtdeclarative-static-qmlplugins qtquickcontrols-static-qmlplugins qtgraphicaleffects-static-qmlplugins"

do_install() {
	install -d ${D}/startup
	install -m 0755 ${B}/bin/todi ${D}/startup/run

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
