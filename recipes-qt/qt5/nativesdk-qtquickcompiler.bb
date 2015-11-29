SUMMARY = "Postinstall qtquickcompiler stuff"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

QT_VERSION = "5.5.0"

DEPENDS += "icu-native nativesdk-qtbase"
inherit nativesdk qmake5_paths

# prevent already-stripped QA Issue
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "installed-vs-shipped arch"
INSANE_SKIP_${PN}-dev += "installed-vs-shipped arch"
INSANE_SKIP_${PN}-dbg += "installed-vs-shipped arch"

FILESEXTRAPATHS_append := "${THISDIR}/qtquickcompiler:"

SRC_URI += " \
	file://qtquickcompiler \
"
S = "${WORKDIR}"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_HOST_BINS}/qtquickcompiler \
"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${OE_QMAKE_PATH_HOST_BINS}
    install -m 755 ${WORKDIR}/qtquickcompiler ${D}${OE_QMAKE_PATH_HOST_BINS}
}

