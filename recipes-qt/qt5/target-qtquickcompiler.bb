SUMMARY = "Postinstall qtquickcompiler stuff"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

QT_VERSION = "5.5.0"

DEPENDS += "qtbase"
inherit qmake5_base

OE_QMAKE_PATH_HOST_MKSPECS = "${OE_QMAKE_PATH_LIBS}/${QT_DIR_NAME}/mkspecs"

S = "${WORKDIR}"

FILESEXTRAPATHS_append := "${THISDIR}/qtquickcompiler:"

SRC_URI += " \
    file://qtquickcompiler.prf \
"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_HOST_MKSPECS}/features/qtquickcompiler.prf \
"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${OE_QMAKE_PATH_HOST_MKSPECS}/features
    install -m 644 ${WORKDIR}/qtquickcompiler.prf ${D}${OE_QMAKE_PATH_HOST_MKSPECS}/features
}
