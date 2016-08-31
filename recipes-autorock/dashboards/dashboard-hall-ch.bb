require dashboard.inc
SUMMARY = "Dashboard application for Project Hall"

SRC_URI += "git://git@gitlab.autorock.com/huatai-dashboard/dashboard-a25.git;branch=${SRCBRANCH};protocol=ssh \
		file://0001-enable-initfs-and-qtquickcompiler.patch \
"

SRCBRANCH = "chinese"
SRCREV = "5c07ddf5f82bfd34dd03b6b2b880006e86e97f8a"
PV = "1.0+git${SRCPV}"
PR = "r0"

DEPENDS += "qtdeclarative-static qtserialport-static qtquickcontrols-static"

RDEPENDS_${PN} = "qtdeclarative-static-qmlplugins  qtquickcontrols-static-qmlplugins"

do_install() {
	install -d ${D}/startup
	install -m 0755 ${B}/bin/huatai-a25 ${D}/startup/run

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}