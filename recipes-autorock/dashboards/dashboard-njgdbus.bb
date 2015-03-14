require dashboard.inc
SUMMARY = "NJGDBUS dashboard application"

SRC_URI += "git://git@git.autorock.com/njgdbus-dashboard/dashboard.git;branch=${SRCBRANCH};protocol=ssh \
		file://0001-enable-initfs-and-qtquickcompiler.patch \
"

SRCBRANCH = "master"
SRCREV = "743d5fdf0f404798b75b7f415b47913d1e491b94"
PV = "1.1+git${SRCPV}"
PR = "r0"

DEPENDS += "qtdeclarative-static qtserialport-static"

RDEPENDS_${PN} = ""

do_install_append() {
	install -m 0755 ${B}/bin/njgdbus ${D}/startup/run

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
