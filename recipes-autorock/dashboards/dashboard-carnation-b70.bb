require dashboard.inc
SUMMARY = "Dashboard application for Project Carnation"

SRC_URI += "git://git@gitlab.autorock.com/hongqi-dashboard/hongqi-dashboard-b70-forShow.git;branch=${SRCBRANCH};protocol=ssh \
		file://0001-enable-initfs-and-qtquickcompiler.patch \
"

SRCBRANCH = "master"
SRCREV = "7a23c987128b9faf965a18c2e583b97001a6ca0b"
PV = "1.0+git${SRCPV}"
PR = "r0"

DEPENDS += "qtdeclarative-static qtserialport-static qtquickcontrols-static"

RDEPENDS_${PN} = "qtdeclarative-static-qmlplugins  qtquickcontrols-static-qmlplugins"

do_install() {
	install -d ${D}/startup
	install -m 0755 ${B}/bin/b70 ${D}/startup/run

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
