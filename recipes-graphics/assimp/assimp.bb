DESCRIPTION = "Open Asset Import Library"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc4231a2268da8fc55525ad119638a87"

DEPENDS += "zlib"

PV = "3.1.1"

SRC_URI = "http://sourceforge.net/projects/assimp/files/assimp-3.1/assimp-${PV}_no_test_models.zip"
SRC_URI[md5sum] = "ccd4788204509da58a3a53c7aeda7a8b"
SRC_URI[sha256sum] = "da9827876f10a8b447270368753392cfd502e70a2e9d1361554e5dfcb1fede9e"

S = "${WORKDIR}/assimp-${PV}"

inherit cmake

FILES_${PN}-dev += "${libdir}/cmake/assimp-3.1/*.cmake"