
# for qtquickcontrol
PACKAGECONFIG_DEFAULT += "accessibility"
PACKAGECONFIG_remove = " \
glib xcb dbus udev alsa pulseaudio tslib icu examples openssl \
"

QT_CONFIG_FLAGS += "-qpa eglfs"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://eglInitialize_later.patch"
SRC_URI[md5sum] = "252613b5a180c94d7196d10467a4f08b"
SRC_URI[sha256sum] = "893f0691739c00d13ff85bf8d3fd14e1c7a62fbbbcffa44b0491da4d5e570965"
