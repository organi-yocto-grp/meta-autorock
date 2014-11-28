require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "Autorock qt5 image"

IMAGE_FEATURES += "ssh-server-dropbear package-management"

IMAGE_INSTALL_append = "qtdeclarative qtbase-plugins qtdeclarative-plugins qtdeclarative-qmlplugins qtbase-fonts gdbserver"

NO_RECOMMENDATIONS = "1"
