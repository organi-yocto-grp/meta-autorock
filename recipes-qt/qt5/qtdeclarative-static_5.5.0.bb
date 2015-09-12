require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtdeclarative"

DEPENDS += "qtxmlpatterns-static"

SRC_URI[md5sum] = "1452c92f8c660dc7d23d9e17d89f8716"
SRC_URI[sha256sum] = "858a12c5647764da8f81edec4ed444af77888cf931b739c10168064ae96f6773"

# License files in this module still contain 2014 as year
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=58a180e1cf84c756c29f782b3a485c29 \
                    file://LICENSE.LGPLv3;md5=c4fe8c6de4eef597feec6e90ed62e962 \
                    file://LGPL_EXCEPTION.txt;md5=9625233da42f9e0ce9d63651a9d97654 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"

