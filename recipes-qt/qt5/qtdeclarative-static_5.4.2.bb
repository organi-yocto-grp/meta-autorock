require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtdeclarative"

DEPENDS += "qtxmlpatterns-static"

SRC_URI[md5sum] = "5b257cd097c315dab1b3c15e26211823"
SRC_URI[sha256sum] = "b73021d78fffe7894c5fde998a767a866b09811c7e210f8e46f252a32be741ae"

# License files in this module still contain 2014 as year
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=cff17b12416c896e10ae2c17a64252e7 \
                    file://LICENSE.LGPLv3;md5=c1939be5579666be947371bc8120425f \
                    file://LGPL_EXCEPTION.txt;md5=0145c4d1b6f96a661c2c139dfb268fb6 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"

