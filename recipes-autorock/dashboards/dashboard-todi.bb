require dashboard.inc
SUMMARY = "Dashboard application for Project Todi"

SRC_URI += "git://git@gitlab.autorock.com/Todi/05software-core.git;branch=${SRCBRANCH};protocol=ssh \
		file://0001-enable-initfs-and-qtquickcompiler.patch \
"

SRCBRANCH = "master"
SRCREV = "ea31cc5bee82912a06791dc7b939542e391067fa"
PV = "1.0+git${SRCPV}"
PR = "r0"

DEPENDS += "qtdeclarative-static qtserialport-static"

RDEPENDS_${PN} = "qtdeclarative-static-qmlplugins"

do_install() {
	install -d ${D}/startup
	install -m 0755 ${B}/bin/todi ${D}/startup/run

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
