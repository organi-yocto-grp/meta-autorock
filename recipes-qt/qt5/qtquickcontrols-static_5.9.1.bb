require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtquickcontrols2"

DEPENDS += "qtdeclarative-static"

LICENSE += "| GPL-2.0"
LIC_FILES_CHKSUM += "file://LICENSE.GPLv2;md5=e782f55badfa137e5e59c330f12cc8ed"

SRC_URI[md5sum] = "79c7618394149ab205ee0a2a3e0480da"
SRC_URI[sha256sum] = "203be0321112d1513b722fce463f9e30d7d00befb33349901d9517f4f13408ff"

# License files in this module still contain 2014 as year
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv3;md5=382747d0119037529ec2b98b24038eb0 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"

INSANE_SKIP_${PN} += "installed-vs-shipped"