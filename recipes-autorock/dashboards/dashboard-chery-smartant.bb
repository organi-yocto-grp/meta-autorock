require dashboard.inc
SUMMARY = "Dashboard application for Project Carnation"

SRC_URI += "git://git@zkgit.iask.in/wangyinnian/smartAnt.git;branch=${SRCBRANCH};protocol=ssh \
	file://0001-enable-initfs-and-qtquickcompiler.patch \
"

SRCBRANCH = "master"
SRCREV = "e31747ba9ad55e6cb0d312b95d5b9a05f77cca98"
PV = "1.0+git${SRCPV}"
PR = "r0"

DEPENDS += "qtdeclarative-static qtserialport-static qtquickcontrols-static"

RDEPENDS_${PN} = "qtdeclarative-static-qmlplugins  qtquickcontrols-static-qmlplugins"

do_install() {
	install -d ${D}/startup
	install -m 0755 ${B}/bin/camera ${D}/startup/run

	#install -d ${D}${libdir}
	#cp -a ${S}/fonts ${D}${libdir}
}
