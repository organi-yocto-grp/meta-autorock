require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtquickcontrols"

DEPENDS += "qtdeclarative-static"

LICENSE += "| GPL-2.0"
LIC_FILES_CHKSUM += "file://LICENSE.GPLv2;md5=05832301944453ec79e40ba3c3cfceec"

SRC_URI[md5sum] = "24b59d5928092f02e0cba969d9548350"
SRC_URI[sha256sum] = "df616aa6b390797f92f33115510961d1a53a55c349a18ae21f74b4aff478c2ea"

# License files in this module still contain 2014 as year
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv3;md5=c4fe8c6de4eef597feec6e90ed62e962 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"
