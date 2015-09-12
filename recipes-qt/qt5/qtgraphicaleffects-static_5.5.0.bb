require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtgraphicaleffects"

DEPENDS += "qtdeclarative-static"

LICENSE += "| GPL-2.0"
LIC_FILES_CHKSUM += "file://LICENSE.GPLv2;md5=05832301944453ec79e40ba3c3cfceec"

SRC_URI[md5sum] = "2fb95cecb2ab0542cb0b5847c65600c3"
SRC_URI[sha256sum] = "f143514e7414797f264fea6348635e1db3e15d13e326af4a6b355fecf0a147ee"

# License files in this module still contain 2014 as year
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=58a180e1cf84c756c29f782b3a485c29 \
                    file://LICENSE.LGPLv3;md5=c4fe8c6de4eef597feec6e90ed62e962 \
                    file://LGPL_EXCEPTION.txt;md5=9625233da42f9e0ce9d63651a9d97654 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"

