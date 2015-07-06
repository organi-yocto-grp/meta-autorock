require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtxmlpatterns"

SRC_URI[md5sum] = "162c72d1398261bc15b8411705ca05e2"
SRC_URI[sha256sum] = "aa7fd8aae6f53f74a69048756197746a3e0ac7fc53f8678b8202c470b1fd272b"

# License files in this module still contain 2014 as year
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=cff17b12416c896e10ae2c17a64252e7 \
                    file://LICENSE.LGPLv3;md5=c1939be5579666be947371bc8120425f \
                    file://LGPL_EXCEPTION.txt;md5=0145c4d1b6f96a661c2c139dfb268fb6 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"

