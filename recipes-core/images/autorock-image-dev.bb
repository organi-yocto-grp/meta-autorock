require autorock-image.inc

IMAGE_FEATURES += "ssh-server-openssh"
IMAGE_INSTALL += "openssh-keys openssl"

IMAGE_INSTALL += " \
	qtbase-plugins  qtbase-fonts \
	qtdeclarative-qmlplugins \
	qtgraphicaleffects-qmlplugins \
	qtserialport \
	qtquickcontrols-qmlplugins \
"
IMAGE_INSTALL += "packagegroup-qt5-qtcreator-debug"
IMAGE_INSTALL += "dosfstools e2fsprogs e2fsprogs-mke2fs"
IMAGE_INSTALL += "mtd-utils mtd-utils-ubifs"
IMAGE_INSTALL += "glitem-qmlplugins"

IMAGE_ROOTFS_SIZE = "196608"
