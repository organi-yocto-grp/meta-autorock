require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot for Autorock imx6 boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=025bf9f768cbcb1a165dbe1a110babfb"
COMPATIBLE_MACHINE = "wisehmi"

PROVIDES = "u-boot"

SRCREV = "${AUTOREV}"
SRCBRANCH = "v2014.10"
SRC_URI = "git://git@git.autorock.com/i-mx6/das-uboot.git;branch=${SRCBRANCH};protocol=ssh"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

PV = "2014.10+git${SRCPV}"
