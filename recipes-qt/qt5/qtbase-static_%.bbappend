
# for qtquickcontrol
PACKAGECONFIG_DEFAULT += "accessibility"
PACKAGECONFIG_remove = " \
glib xcb dbus udev alsa pulseaudio tslib icu examples openssl \
"

QT_CONFIG_FLAGS += "-qpa eglfs"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://0001-eglInitialize_later.patch"
#SRC_URI[md5sum] = "67a95eec79ffc4a14f516ad6f3d24c96"
#SRC_URI[sha256sum] = "9fc4f720b8b5a8b8e4a7d45e13ce4d5b86756ad46fb406386637eb2de5fd5a74"
SRC_URI[md5sum] = "5a74869fc3731bcb8311e62e235d11a7"
SRC_URI[sha256sum] = "bc9a21e9f6fff9629019fdf9f989f064751d5073c3a28dc596def92f4d4275c6"
