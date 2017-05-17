require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtdeclarative"

DEPENDS += "qtxmlpatterns-static"

SRC_URI[md5sum] = "b7997c9d8df4ea60945229883f9ce8ed"
SRC_URI[sha256sum] = "5fd14eefb83fff36fb17681693a70868f6aaf6138603d799c16466a094b26791"

# License files in this module still contain 2014 as year
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=58a180e1cf84c756c29f782b3a485c29 \
                    file://LICENSE.LGPLv3;md5=b8c75190712063cde04e1f41b6fdad98 \
                    file://LGPL_EXCEPTION.txt;md5=9625233da42f9e0ce9d63651a9d97654 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"

