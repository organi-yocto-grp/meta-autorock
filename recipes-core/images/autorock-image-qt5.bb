require autorock-image.inc

DESCRIPTION = "Autorock qt5 image"

IMAGE_INSTALL_append += "qtbase-plugins qtdeclarative-qmlplugins qtbase-fonts"
