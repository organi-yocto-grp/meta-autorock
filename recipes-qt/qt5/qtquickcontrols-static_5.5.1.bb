require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtquickcontrols"

DEPENDS += "qtdeclarative-static"

LICENSE += "| GPL-2.0"
LIC_FILES_CHKSUM += "file://LICENSE.GPLv2;md5=e782f55badfa137e5e59c330f12cc8ed"

SRC_URI[md5sum] = "01ace647bda006b61200f61ebe6ef93b"
SRC_URI[sha256sum] = "1b7a8389d656066c629bd2cb520b39a7eb041d184b567dd1b9639b88d841fcf0"

# License files in this module still contain 2014 as year
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv3;md5=b8c75190712063cde04e1f41b6fdad98 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"

INSANE_SKIP_${PN} += "installed-vs-shipped"