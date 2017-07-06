require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtserialport"

SRC_URI[md5sum] = "0d8449ce45aa4180ba5e92ecac965810"
SRC_URI[sha256sum] = "e1fe85bf292929c3a62cb4d21efaaa4e89f70f48ea10914da07d0670ec617a69"

# text of LGPL_EXCEPTION.txt and LICENSE.FDL is slightly different than what
# other qt* components use :/
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=4bfd28363f541b10d9f024181b8df516 \
                    file://LICENSE.GPLv2;md5=c96076271561b0e3785dad260634eaa8 \
                    file://LICENSE.LGPLv3;md5=e0459b45c5c4840b353141a8bbed91f0 \
                    file://LGPL_EXCEPTION.txt;md5=bb426f3367c4805d1e12fad05bd0b750 \
                    file://LICENSE.FDL;md5=3801d7932fdc07fd9efe89f9854a6caa"

