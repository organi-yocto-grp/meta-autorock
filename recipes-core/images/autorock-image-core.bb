require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "Autorock core image"

IMAGE_FEATURES += "ssh-server-dropbear package-management"

NO_RECOMMENDATIONS = "1"

IMAGE_FSTYPES_a20navi += "ubifs"

IMAGE_INSTALL_a20navi += "emconfig mksplash packimg"
