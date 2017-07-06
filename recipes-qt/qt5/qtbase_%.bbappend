
# for qtquickcontrol
PACKAGECONFIG_DEFAULT += "accessibility"
PACKAGECONFIG_remove = " \
glib xcb dbus udev alsa pulseaudio tslib icu examples openssl \
"

QT_CONFIG_FLAGS += "-qpa eglfs"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://eglInitialize_later.patch"
SRC_URI[md5sum] = "67a95eec79ffc4a14f516ad6f3d24c96"
SRC_URI[sha256sum] = "9fc4f720b8b5a8b8e4a7d45e13ce4d5b86756ad46fb406386637eb2de5fd5a74"
