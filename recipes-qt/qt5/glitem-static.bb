DESCRIPTION = "EMUTILS"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

require qmake5-static-module.inc

DEPENDS += "qtdeclarative-static assimp-static"

SRCREV = "${AUTOREV}"
SRCBRANCH = "master"
PV = "1.1+git${SRCPV}"
PR = "r0"

SRC_URI = "git://git@gitlab.autorock.com/qt/glitem.git;branch=${SRCBRANCH};protocol=ssh"

S = "${WORKDIR}/git"
