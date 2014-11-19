require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=025bf9f768cbcb1a165dbe1a110babfb"
COMPATIBLE_MACHINE = "(wisehmi)"

PROVIDES = "u-boot"

PV = "v2014.10+git${SRCPV}"

SRCREV = "63866b019a6a8a2dde47fa2c87b08ef2e69c2297"
SRCBRANCH = "v2014.10"
SRC_URI = "git@git.autorock.com:i-mx6/das-uboot.git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
