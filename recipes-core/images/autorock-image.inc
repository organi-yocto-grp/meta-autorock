require recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += "package-management"

#NO_RECOMMENDATIONS = "1"

IMAGE_INSTALL += "memtester"

OPKG_BUILD_MACHINE ?= "${MACHINE_CLASS}"
OPKG_DOWNLOAD_SERVER ?= "yocto.autorock.com"
OPKG_BUILD_FEATURE ?= "dev"

PACKAGE_FEED_URIS += "http://${OPKG_DOWNLOAD_SERVER}/${DISTRO}/${DISTRO_VERSION}/${OPKG_BUILD_MACHINE}/${OPKG_BUILD_FEATURE}"
