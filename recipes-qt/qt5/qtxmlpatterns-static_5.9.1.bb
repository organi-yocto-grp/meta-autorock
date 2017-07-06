require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtxmlpatterns"

SRC_URI[md5sum] = "17c242f370f2c8e0d611fabcffa3ceda"
SRC_URI[sha256sum] = "b584686496ad1b1b3426d642bd705cab3fc02313b067a33d1b826a27aee29c24"

# License files in this module still contain 2014 as year
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=4bfd28363f541b10d9f024181b8df516 \
                    file://LICENSE.LGPLv3;md5=e0459b45c5c4840b353141a8bbed91f0 \
                    file://LGPL_EXCEPTION.txt;md5=9625233da42f9e0ce9d63651a9d97654 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"

