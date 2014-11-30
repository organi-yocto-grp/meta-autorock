SUMMARY = "init script for dashboard startup"
SECTION = "autorock"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ce5c45ec07856b6907cbfe6feee1d180"

SRC_URI = "file://dashboard \
		   file://MIT.patch \
"

DEFAULT_DASHBOARD ?= "dashboard-bmw"

INITSCRIPT_NAME = "dashboard"
INITSCRIPT_PARAMS = "start 06 S ."

inherit update-rc.d

do_compile () {
}

do_install () {
	install -d ${D}${sysconfdir}/init.d/
	install -m 0755 ${WORKDIR}/dashboard ${D}${sysconfdir}/init.d/
	ln -snf ${datadir}/${DEFAULT_DASHBOARD}/init ${D}${sysconfdir}/dashboard
}

RDEPENDS_${PN} = "${DEFAULT_DASHBOARD}"

