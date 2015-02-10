require qt5-static-module-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtgraphicaleffects"

DEPENDS += "qtdeclarative-static"

LICENSE += "| GPL-2.0"
LIC_FILES_CHKSUM += "file://LICENSE.GPLv2;md5=e782f55badfa137e5e59c330f12cc8ed"

SRC_URI[md5sum] = "4d26d56c55b0117c37d96e85755da6a4"
SRC_URI[sha256sum] = "a43f10e532180eb8400fec65752b36c1adaa9aaf672146035ef630d324a38b19"


