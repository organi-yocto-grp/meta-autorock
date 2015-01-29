require recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += "ssh-server-dropbear package-management"

NO_RECOMMENDATIONS = "1"

# should be added as qtbase-plugins dependance
IMAGE_INSTALL_append_a20navi += "sunxi-mali kernel-module-mali"
IMAGE_INSTALL_append_a20navi += "emconfig mksplash packimg"
