require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtquickcontrols"

DEPENDS += "qtdeclarative-static"

LICENSE += "| GPL-2.0"
LIC_FILES_CHKSUM += "file://LICENSE.GPLv2;md5=e782f55badfa137e5e59c330f12cc8ed"

SRC_URI[md5sum] = "146f499a9f7c0009437077675134632d"
SRC_URI[sha256sum] = "e720d6b029078682d788c0e3df14057cab8a3ba0ecfdc35c9b9bf6dc061bff8c"

# License files in this module still contain 2014 as year
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=cff17b12416c896e10ae2c17a64252e7 \
                    file://LICENSE.LGPLv3;md5=c1939be5579666be947371bc8120425f \
                    file://LGPL_EXCEPTION.txt;md5=0145c4d1b6f96a661c2c139dfb268fb6 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"
