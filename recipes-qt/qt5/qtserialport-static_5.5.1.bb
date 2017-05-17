require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtserialport"

SRC_URI[md5sum] = "1065424ad9be54f7635a9a50f35bc187"
SRC_URI[sha256sum] = "a034dbfb023db1b9b9de54390f7e76a48c1d1eb12533b0ffd574505c99968f7a"

# text of LGPL_EXCEPTION.txt and LICENSE.FDL is slightly different than what
# other qt* components use :/
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=58a180e1cf84c756c29f782b3a485c29 \
                    file://LICENSE.GPLv2;md5=05832301944453ec79e40ba3c3cfceec \
                    file://LICENSE.LGPLv3;md5=b8c75190712063cde04e1f41b6fdad98 \
                    file://LGPL_EXCEPTION.txt;md5=bb426f3367c4805d1e12fad05bd0b750 \
                    file://LICENSE.FDL;md5=3801d7932fdc07fd9efe89f9854a6caa"

