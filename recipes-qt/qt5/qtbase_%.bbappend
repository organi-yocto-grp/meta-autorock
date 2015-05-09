
# for qtquickcontrol
PACKAGECONFIG_DEFAULT += "accessibility"
PACKAGECONFIG_remove = " \
glib xcb dbus udev alsa pulseaudio tslib icu examples openssl \
"
#PACKAGECONFIG_remove += "widgets"
QT_CONFIG_FLAGS += "-qpa eglfs"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://eglInitialize_later.patch"
SRC_URI[md5sum] = "820b0c77ea6d025833de9118842cf405"
SRC_URI[sha256sum] = "d14e3f3cb5e853aefbb9a58764766f85cbc27e2ac9978c70178c1a60b9de39ea"
