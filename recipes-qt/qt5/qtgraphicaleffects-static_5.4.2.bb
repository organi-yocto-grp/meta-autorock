require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtgraphicaleffects"

DEPENDS += "qtdeclarative-static"

LICENSE += "| GPL-2.0"
LIC_FILES_CHKSUM += "file://LICENSE.GPLv2;md5=e782f55badfa137e5e59c330f12cc8ed"

SRC_URI[md5sum] = "3145c92da410e880a0124a25176ac9bc"
SRC_URI[sha256sum] = "ba8f477be1b0675ce36f48530db050d2922b2a0d6ff80c46559245a94aede80a"

# License files in this module still contain 2014 as year
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=cff17b12416c896e10ae2c17a64252e7 \
                    file://LICENSE.LGPLv3;md5=c1939be5579666be947371bc8120425f \
                    file://LGPL_EXCEPTION.txt;md5=0145c4d1b6f96a661c2c139dfb268fb6 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"

