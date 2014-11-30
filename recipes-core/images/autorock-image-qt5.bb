require autorock-image.inc

DESCRIPTION = "Autorock qt5 image"

IMAGE_INSTALL_append += "qtdeclarative qtbase-plugins qtdeclarative-plugins qtdeclarative-qmlplugins qtbase-fonts gdbserver"
