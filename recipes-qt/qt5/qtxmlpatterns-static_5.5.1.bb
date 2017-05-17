require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtxmlpatterns"

SRC_URI[md5sum] = "17b9ee5031262b5b875ce0e1045e6bdc"
SRC_URI[sha256sum] = "b537eb0252988e3805a32a16c65038973371d647baf246fdf703bde725d0e8ec"

# License files in this module still contain 2014 as year
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=58a180e1cf84c756c29f782b3a485c29 \
                    file://LICENSE.LGPLv3;md5=b8c75190712063cde04e1f41b6fdad98 \
                    file://LGPL_EXCEPTION.txt;md5=9625233da42f9e0ce9d63651a9d97654 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"

