# for qtquickcontrol
PACKAGECONFIG_DEFAULT += "accessibility"
PACKAGECONFIG_remove = " \
glib xcb dbus udev alsa pulseaudio tslib icu examples openssl \
"
#PACKAGECONFIG_remove += "widgets"
QT_CONFIG_FLAGS += "-qpa eglfs"