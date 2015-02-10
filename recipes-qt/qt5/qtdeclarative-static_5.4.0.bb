require qt5-static-module-${PV}.inc
require qmake5-static-module.inc

QT_MODULE = "qtdeclarative"

DEPENDS += "qtxmlpatterns-static"

LICENSE += "| GPL-2.0"
LIC_FILES_CHKSUM += "file://LICENSE.GPLv2;md5=e782f55badfa137e5e59c330f12cc8ed"

SRC_URI[md5sum] = "4f928e52e72b5e867b50b4d409d5e99b"
SRC_URI[sha256sum] = "e67c9275b0f6869a7c1e8023ad7c0a23fb19f8a8d2f350371e954ead0cfad7b6"

