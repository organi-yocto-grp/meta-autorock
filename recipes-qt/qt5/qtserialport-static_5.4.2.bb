require qt5-static-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtserialport"

SRC_URI[md5sum] = "546a62eee89722081b7ec13d72469772"
SRC_URI[sha256sum] = "93cd414e809beed424eee018338e84742509fc4bc78e5649fbaf370a562ed7c0"

# text of LGPL_EXCEPTION.txt and LICENSE.FDL is slightly different than what
# other qt* components use :/
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=cff17b12416c896e10ae2c17a64252e7 \
                    file://LICENSE.GPLv2;md5=e782f55badfa137e5e59c330f12cc8ed \
                    file://LICENSE.LGPLv3;md5=c1939be5579666be947371bc8120425f \
                    file://LGPL_EXCEPTION.txt;md5=eb6c371255e1262c55ae9b652a90b528 \
                    file://LICENSE.FDL;md5=3801d7932fdc07fd9efe89f9854a6caa"

