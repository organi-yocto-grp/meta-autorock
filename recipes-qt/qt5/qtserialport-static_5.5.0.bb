require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtserialport"

SRC_URI[md5sum] = "8a76f051ed28a9c925d32f5864d33e78"
SRC_URI[sha256sum] = "a60e2d2113c1c3895b71c901921f83b81e9b3c59e3620cf94bd8647730efa866"

# text of LGPL_EXCEPTION.txt and LICENSE.FDL is slightly different than what
# other qt* components use :/
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=58a180e1cf84c756c29f782b3a485c29 \
                    file://LICENSE.GPLv2;md5=05832301944453ec79e40ba3c3cfceec \
                    file://LICENSE.LGPLv3;md5=c4fe8c6de4eef597feec6e90ed62e962 \
                    file://LGPL_EXCEPTION.txt;md5=bb426f3367c4805d1e12fad05bd0b750 \
                    file://LICENSE.FDL;md5=3801d7932fdc07fd9efe89f9854a6caa"

