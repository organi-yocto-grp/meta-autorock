# Copyright (C) 2012 O.S. Systems Software LTDA.
# Copyright (C) 2013 Martin Jansa <martin.jansa@gmail.com>

QT_VERSION ?= "${PV}"

# it's different for RC versions
QT_VERSION_DIR ?= "5.5"

SRC_URI += " \
    http://download.qt.io/official_releases/qt/${QT_VERSION_DIR}/${QT_VERSION}/submodules/${QT_MODULE}-opensource-src-${QT_VERSION}.tar.xz \
"

S = "${WORKDIR}/${QT_MODULE}-opensource-src-${QT_VERSION}"

LICENSE = "GFDL-1.3 & LGPL-2.1 | LGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=58a180e1cf84c756c29f782b3a485c29 \
                    file://LICENSE.LGPLv3;md5=c4fe8c6de4eef597feec6e90ed62e962 \
                    file://LGPL_EXCEPTION.txt;md5=9625233da42f9e0ce9d63651a9d97654 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"