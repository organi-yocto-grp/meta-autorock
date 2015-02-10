SUMMARY = "dashboard image"
DESCRIPTION = "Autorock dashboard image"
SECTION = "autorock"

inherit image

IMAGE_FSTYPES += "squashfs"

NO_RECOMMENDATIONS = "1"

IMAGE_INSTALL_a20navi = "dashboard-njgdbus sunxi-mali"


