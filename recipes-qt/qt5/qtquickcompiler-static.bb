QT_VERSION = "5.5.0"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit qmake5-static-path

PACKAGE_ARCH = "${MACHINE_ARCH}"

FILESEXTRAPATHS_append := "${FILE_DIRNAME}/qtquickcompiler:"

SRC_URI += " \
	file://qtquickcompiler \
	file://qtquickcompiler.prf \
	file://libQt5Core.so.${QT_VERSION} \
"

S = "${WORKDIR}"

do_install_append () {
    install -d ${D}${OE_QMAKE_PATH_HOST_BINS}
    install -d ${D}${OE_QMAKE_PATH_HOST_DATA}/mkspecs/features/
    install -d ${D}${OE_QMAKE_PATH_HOST_LIBS}

    install -m 755 ${WORKDIR}/qtquickcompiler ${D}${OE_QMAKE_PATH_HOST_BINS}
    install -m 644 ${WORKDIR}/qtquickcompiler.prf ${D}${OE_QMAKE_PATH_HOST_DATA}/mkspecs/features/
    install -m 755 ${WORKDIR}/libQt5Core.so.${QT_VERSION} ${D}${OE_QMAKE_PATH_HOST_LIBS}

    QTVERSION=${QT_VERSION}
    ln -snf libQt5Core.so.${QT_VERSION} ${D}${OE_QMAKE_PATH_HOST_LIBS}/libQt5Core.so.${QTVERSION%.*}
    ln -snf libQt5Core.so.${QT_VERSION} ${D}${OE_QMAKE_PATH_HOST_LIBS}/libQt5Core.so.${QTVERSION%%.*}
    ln -snf libQt5Core.so.${QT_VERSION} ${D}${OE_QMAKE_PATH_HOST_LIBS}/libQt5Core.so
}


do_populate_sysroot[sstate-outputdirs] = "${STAGING_DIR}"
sysroot_stage_dirs_append() {
    # $to is 2nd parameter passed to sysroot_stage_dir, e.g. ${SYSROOT_DESTDIR} passed from sysroot_stage_all
    cp -ra ${D}/${STAGING_DIR}/* $to
    rm -rf $to/${MACHINE}/${OE_QMAKE_PATH_LIBS}/fonts
}

do_package[noexec] = "1"
do_packagedata[noexec] = "1"
do_package_write[noexec] = "1"
do_package_write_ipk[noexec] = "1"
do_package_write_rpm[noexec] = "1"
do_package_write_deb[noexec] = "1"
