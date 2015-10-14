require autorock-image.inc

IMAGE_FEATURES += "ssh-server-openssh"
IMAGE_INSTALL += "openssh-keys"

IMAGE_INSTALL += " \
	qtbase-plugins  qtbase-fonts \
	qtdeclarative-qmlplugins \
	qtgraphicaleffects-qmlplugins \
	qtserialport \
	qtquickcontrols-qmlplugins \
	qt3d qt3d-qmlplugins \
"

IMAGE_INSTALL += "packagegroup-qt5-qtcreator-debug"
IMAGE_INSTALL += "dosfstools e2fsprogs e2fsprogs-mke2fs"
IMAGE_INSTALL += "mtd-utils mtd-utils-ubifs"
IMAGE_INSTALL += "glitem-qmlplugins"
