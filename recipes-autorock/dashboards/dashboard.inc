SECTION = "autorock"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

#PROVIDES = "virtual/dashboard"

S = "${WORKDIR}/git"

inherit qmake5-static

FILES_${PN}-dbg += "${datadir}/${PN}/.debug"
FILES_${PN} += "${bindir} ${libdir}"
