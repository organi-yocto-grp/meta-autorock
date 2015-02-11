require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "Autorock core image"

IMAGE_FEATURES += "ssh-server-dropbear package-management"

NO_RECOMMENDATIONS = "1"
