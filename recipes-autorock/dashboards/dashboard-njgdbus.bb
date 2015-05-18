require dashboard.inc
SUMMARY = "NJGDBUS dashboard application"

SRC_URI += "git://git@git.autorock.com/njgdbus-dashboard/dashboard.git;tag=v${PV};protocol=ssh \
		file://0001-enable-initfs-and-qtquickcompiler.patch \
"

PV = "1.0.2"
PR = "r0"

DEPENDS += "qtdeclarative-static qtserialport-static"

RDEPENDS_${PN} = "qtdeclarative-static-qmlplugins"

do_install() {
	install -d ${D}/startup
	install -m 0755 ${B}/bin/njgdbus ${D}/startup/run

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
