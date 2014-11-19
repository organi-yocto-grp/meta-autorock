require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for Autorock boards"

SRC_URI = "git@git.autorock.com:i-mx6/fsl-linux.git;branch=${SRCBRANCH} \
           file://defconfig"

LOCALVERSION = "-1.0.1_ga+yocto"
SRCBRANCH = "imx_3.10.17_1.0.1_ga"
SRCREV = "45add5da5831d3f6ddd1db0160797080a8adf9a5"
DEPENDS += "lzop-native bc-native u-boot-mkimage-native"
COMPATIBLE_MACHINE = "(wisehmi)"
