# Provides the i.MX6 WiseHMI common settings

require conf/machine/include/imx-base.inc
require conf/machine/include/tune-cortexa9.inc

SERIAL_CONSOLE = "115200 ttymxc3"

KERNEL_IMAGETYPE = "uImage"

IMAGE_FSTYPES = "tar.bz2"