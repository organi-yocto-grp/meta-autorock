require autorock-image.inc

DESCRIPTION = "Autorock core image"

IMAGE_FEATURES += "ssh-server-dropbear"
IMAGE_INSTALL += "dropbear-keys"

IMAGE_OVERHEAD_FACTOR = "1.1"
