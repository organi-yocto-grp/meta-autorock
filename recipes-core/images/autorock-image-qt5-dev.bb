require recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += "ssh-server-openssh package-management"

NO_RECOMMENDATIONS = "1"

IMAGE_INSTALL_append += "qtbase-plugins qtdeclarative-qmlplugins qtgraphicaleffects-qmlplugins qtbase-fonts qtserialport"
IMAGE_INSTALL_append += "packagegroup-qt5-qtcreator-debug"
IMAGE_INSTALL_append += "dosfstools e2fsprogs-mke2fs"
