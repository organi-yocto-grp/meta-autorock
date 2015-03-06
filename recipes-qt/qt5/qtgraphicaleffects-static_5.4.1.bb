require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtgraphicaleffects"

DEPENDS += "qtdeclarative-static"

LICENSE += "| GPL-2.0"
LIC_FILES_CHKSUM += "file://LICENSE.GPLv2;md5=e782f55badfa137e5e59c330f12cc8ed"

SRC_URI[md5sum] = "02bec01c2af9a7d08582fbffbfa4976a"
SRC_URI[sha256sum] = "bae2f0e8120f0b4e6e1b56a486713821615d0af7c69fb4ecdcbabc22b8f8351c"

# License files in this module still contain 2014 as year
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=cff17b12416c896e10ae2c17a64252e7 \
                    file://LICENSE.LGPLv3;md5=c1939be5579666be947371bc8120425f \
                    file://LGPL_EXCEPTION.txt;md5=0145c4d1b6f96a661c2c139dfb268fb6 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"


