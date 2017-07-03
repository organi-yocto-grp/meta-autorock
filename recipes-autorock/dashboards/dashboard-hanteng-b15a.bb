require dashboard.inc
SUMMARY = "Dashboard application for Project Carnation"

#SRC_URI += "git://git@zkgit.iask.in/ZTB15Y/07_Release.git;branch=${SRCBRANCH};protocol=ssh \
#	file://0001-enable-initfs-and-qtquickcompiler.patch \
#"
SRC_URI += "git://git@zkgit.iask.in/yangmengkui/07_Release.git;branch=${SRCBRANCH};protocol=ssh \
	file://0001-enable-initfs-and-qtquickcompiler.patch \
	file://0002-add-qmldir.patch \
"

SRCBRANCH = "B15a_wu"
#SRCREV = "5ab6ab218153c5e4ecaf9c7840c0fbdadde06e5a"
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
PR = "r0"

DEPENDS += "qtdeclarative-static qtserialport-static qtquickcontrols-static"

RDEPENDS_${PN} = "qtdeclarative-static-qmlplugins  qtquickcontrols-static-qmlplugins"

do_install() {
	install -d ${D}/startup
	install -m 0755 ${B}/ZTB15A2  ${D}/startup/run

	install -d ${D}${libdir}
	cp -a ${S}/fonts ${D}${libdir}
}
