require qmake5-static-module.inc

LICENSE = "GFDL-1.3 & LGPL-2.1 & DIGIA-TPLA-2.4 | GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=4193e7f1d47a858f6b7c0f1ee66161de \
                    file://LGPL_EXCEPTION.txt;md5=0145c4d1b6f96a661c2c139dfb268fb6 \
                    file://LICENSE.PREVIEW.COMMERCIAL;md5=9d94dadfab8b246782ffea02082ee13a \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e \
                    file://LICENSE.GPL;md5=d32239bcb673463ab874e80d47fae504 \
"

FILES_${PN}-qmlplugins += " \
    ${OE_QMAKE_PATH_QML}/*/*/*.bez \
    ${OE_QMAKE_PATH_QML}/*/*/*.obj \
"

DEPENDS += "qtdeclarative-static"

SRC_URI += " \
	git://code.qt.io/qt/qt3d.git;protocol=http;branch=${SRCBRANCH} \
	file://0001-fix-static-build-fail.patch \
	file://0002-fix-meshcvt-tool-compile-fail.patch \
	file://0003-fix-application-compile-fail-for-qmldir-missing-clas.patch \
"

S = "${WORKDIR}/git"

SRCBRANCH = "dev"

SRCREV = "8a9723d7420829a2ba0141a9f7d8dc8cd11d8331"