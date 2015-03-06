require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtserialport"

# text of LGPL_EXCEPTION.txt and LICENSE.FDL is slightly different than what
# other qt* components use :/
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=cff17b12416c896e10ae2c17a64252e7 \
                    file://LICENSE.GPLv2;md5=e782f55badfa137e5e59c330f12cc8ed \
                    file://LICENSE.LGPLv3;md5=c1939be5579666be947371bc8120425f \
                    file://LGPL_EXCEPTION.txt;md5=eb6c371255e1262c55ae9b652a90b528 \
                    file://LICENSE.FDL;md5=3801d7932fdc07fd9efe89f9854a6caa"

SRC_URI[md5sum] = "2333d25916a74260ce39b8a77c7c4288"
SRC_URI[sha256sum] = "79d99e826bf49e469a651cdc2d499d8b54e52bb8aaa279719a3afa03eba5d0ff"

