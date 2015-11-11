DESCRIPTION = "Open Asset Import Library"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b487f61647333d0b8ef3d2233e37ca2"

DEPENDS += "zlib"

PV = "3.2"
PR = "r0"

SRC_URI = "git://github.com/assimp/assimp.git;tag=v${PV};protocol=https"

S = "${WORKDIR}/git"

inherit cmake

FILES_${PN}-dev += "${libdir}/cmake/assimp-3.2/*.cmake"
