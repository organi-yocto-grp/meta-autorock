require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtdeclarative"

DEPENDS += "qtxmlpatterns-static"

SRC_URI[md5sum] = "be6a54875ffdc396e99dfb6690f0772c"
SRC_URI[sha256sum] = "d2fe6c9c1a9f19af6e96553c6d75366ab8f397bc232acd67d31476955fee94ff"

# License files in this module still contain 2014 as year
LIC_FILES_CHKSUM = "file://LICENSE.GPL2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://LICENSE.LGPL3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
                    file://LICENSE.GPL3-EXCEPT;md5=763d8c535a234d9a3fb682c7ecb6c073 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"

