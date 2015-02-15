require qt5-static-${QT_VERSION}.inc

SRC_URI += "git://git@git.autorock.com/qt/qtbase.git;branch=${SRCBRANCH};protocol=ssh \
	file://qtquickcompiler \
	file://qtquickcompiler.prf \
	file://libQt5Core.so.${QT_VERSION} \
"

SRCBRANCH = "v${QT_VERSION}"
SRCREV = "${AUTOREV}"
PV = "${QT_VERSION}+git${SRCPV}"

S = "${WORKDIR}/git"

PACKAGECONFIG[release] = "-release,-debug"
PACKAGECONFIG[developer] = "-developer-build"
PACKAGECONFIG[tests] = "-make tests,-nomake tests"
PACKAGECONFIG[examples] = "-make examples -compile-examples,-nomake examples"
PACKAGECONFIG[tools] = "-make tools,-nomake tools"
PACKAGECONFIG[qml-debug] = "-qml-debug,-no-qml-debug"
PACKAGECONFIG[libs] = "-make libs,-nomake libs"
PACKAGECONFIG[gui] = "-gui,-no-gui"
PACKAGECONFIG[accessibility] = "-accessibility,-no-accessibility"
PACKAGECONFIG[glib] = "-glib,-no-glib,glib-2.0"
PACKAGECONFIG[gif] = ",-no-gif"
PACKAGECONFIG[freetype] = "-qt-freetype,-no-freetype"
PACKAGECONFIG[jpeg] = "-qt-libjpeg,-no-libjpeg"
PACKAGECONFIG[libpng] = "-qt-libpng,-no-libpng"
PACKAGECONFIG[harfbuzz] = "-qt-harfbuzz,-no-harfbuzz"
PACKAGECONFIG[zlib] = "-system-zlib,-qt-zlib,zlib"
PACKAGECONFIG[pcre] = "-system-pcre,-qt-pcre,pcre"
PACKAGECONFIG[gles2] = "-opengl es2 -eglfs,-no-opengl -no-eglfs,virtual/libgles2 virtual/egl"
PACKAGECONFIG[tslib] = "-tslib,-no-tslib,tslib"
PACKAGECONFIG[cups] = "-cups,-no-cups,cups"
PACKAGECONFIG[dbus] = "-dbus,-no-dbus,dbus"
PACKAGECONFIG[xcb] = "-xcb -xcb-xlib -system-xcb,-no-xcb,libxcb xcb-util-wm xcb-util-image xcb-util-keysyms xcb-util-renderutil"
PACKAGECONFIG[sql-ibase] = "-sql-ibase,-no-sql-ibase"
PACKAGECONFIG[sql-mysql] = "-sql-mysql,-no-sql-mysql,mysql"
PACKAGECONFIG[sql-psql] = "-sql-psql,-no-sql-psql,postgresql"
PACKAGECONFIG[sql-odbc] = "-sql-odbc,-no-sql-odbc"
PACKAGECONFIG[sql-oci] = "-sql-oci,-no-sql-oci"
PACKAGECONFIG[sql-tds] = "-sql-tds,-no-sql-tds"
PACKAGECONFIG[sql-db2] = "-sql-db2,-no-sql-db2"
PACKAGECONFIG[sql-sqlite2] = "-sql-sqlite2,-no-sql-sqlite2,sqlite"
PACKAGECONFIG[sql-sqlite] = "-sql-sqlite,-no-sql-sqlite,sqlite3"
PACKAGECONFIG[xcursor] = "-xcursor,-no-xcursor,libxcursor"
PACKAGECONFIG[xinerama] = "-xinerama,-no-xinerama,libxinerama"
PACKAGECONFIG[xinput] = "-xinput,-no-xinput"
PACKAGECONFIG[xinput2] = "-xinput2,-no-xinput2,libxi"
PACKAGECONFIG[xfixes] = "-xfixes,-no-xfixes,libxfixes"
PACKAGECONFIG[xrandr] = "-xrandr,-no-xrandr,libxrandr"
PACKAGECONFIG[xrender] = "-xrender,-no-xrender,libxrender"
PACKAGECONFIG[xshape] = "-xshape,-no-xshape"
PACKAGECONFIG[xsync] = "-xsync,-no-xsync"
PACKAGECONFIG[xvideo] = "-xvideo,-no-xvideo"
PACKAGECONFIG[openvg] = "-openvg,-no-openvg"
PACKAGECONFIG[iconv] = "-iconv,-no-iconv,virtual/libiconv"
PACKAGECONFIG[xkb] = "-xkb,-no-xkb -no-xkbcommon,libxkbcommon"
PACKAGECONFIG[evdev] = "-evdev,-no-evdev"
PACKAGECONFIG[mtdev] = "-mtdev,-no-mtdev,mtdev"
PACKAGECONFIG[fontconfig] = "-fontconfig,-no-fontconfig,fontconfig"
PACKAGECONFIG[gtkstyle] = "-gtkstyle,-no-gtkstyle,gtk+"
PACKAGECONFIG[directfb] = "-directfb,-no-directfb,directfb"
PACKAGECONFIG[linuxfb] = "-linuxfb,-no-linuxfb"
PACKAGECONFIG[kms] = "-kms,-no-kms,virtual/mesa virtual/egl"
PACKAGECONFIG[icu] = "-icu,-no-icu,icu"
PACKAGECONFIG[udev] = "-libudev,-no-libudev,udev"
PACKAGECONFIG[openssl] = "-openssl-linked,-no-openssl,openssl"
PACKAGECONFIG[alsa] = "-alsa,-no-alsa,alsa-lib"
PACKAGECONFIG[pulseaudio] = "-pulseaudio,-no-pulseaudio,pulseaudio"
PACKAGECONFIG[nis] = "-nis,-no-nis"
PACKAGECONFIG[widgets] = "-widgets,-no-widgets"

QT_CONFIG_FLAGS += " \
    -static \
    -silent \
    -no-pch \
    -no-rpath \
    -pkg-config \
	-optimized-qmake \
    ${EXTRA_OECONF} \
"

EGLFS_SOURCE_mx6 = "${S}/mkspecs/devices/linux-imx6-g++/qeglfshooks_imx6.cpp"
EGLFS_SOURCE_a20navi = "${S}/mkspecs/devices/linux-sunxi-g++/qeglfshooks_sunxi.cpp"

EXTRA_COMPILER_FLAGS ?= ""

do_configure() {
	${S}/configure  -v \
        -opensource -confirm-license \
        -sysroot ${STAGING_DIR_TARGET} \
		-prefix ${OE_QMAKE_PATH_PREFIX} \
        -bindir ${OE_QMAKE_PATH_BINS} \
        -libdir ${OE_QMAKE_PATH_LIBS} \
        -datadir ${OE_QMAKE_PATH_DATA} \
        -sysconfdir ${OE_QMAKE_PATH_SETTINGS} \
        -docdir ${OE_QMAKE_PATH_DOCS} \
        -headerdir ${OE_QMAKE_PATH_HEADERS} \
        -archdatadir ${OE_QMAKE_PATH_ARCHDATA} \
        -libexecdir ${OE_QMAKE_PATH_LIBEXECS} \
        -plugindir ${OE_QMAKE_PATH_PLUGINS} \
        -importdir ${OE_QMAKE_PATH_IMPORTS} \
        -qmldir ${OE_QMAKE_PATH_QML} \
        -translationdir ${OE_QMAKE_PATH_TRANSLATIONS} \
		-testsdir ${OE_QMAKE_PATH_TESTS} \
        -examplesdir ${OE_QMAKE_PATH_EXAMPLES} \
		-hostprefix ${OE_QMAKE_PATH_HOST_PREFIX} \
		-hostbindir ${OE_QMAKE_PATH_HOST_BINS} \
		-hostlibdir ${OE_QMAKE_PATH_HOST_LIBS} \
		-hostdatadir ${OE_QMAKE_PATH_HOST_DATA} \
		-extprefix ${STAGING_DIR_TARGET}/${OE_QMAKE_PATH_PREFIX} \
		-device oe \
		-device-option CROSS_COMPILE=${TARGET_PREFIX} \
		-device-option COMPILER_FLAGS="${TARGET_CC_ARCH} ${EXTRA_COMPILER_FLAGS}" \
		-device-option OE_QMAKE_CFLAGS="" \
		-device-option OE_QMAKE_CXXFLAGS="" \
		-device-option OE_QMAKE_LFLAGS="${TARGET_CC_ARCH}" \
		-device-option EGLFS_PLATFORM_HOOKS_SOURCES="${EGLFS_SOURCE}" \
		${QT_CONFIG_FLAGS}
}

do_install_append() {
	install -m 755 ${WORKDIR}/qtquickcompiler ${D}${OE_QMAKE_PATH_HOST_BINS}
	install -m 644 ${WORKDIR}/qtquickcompiler.prf ${D}${OE_QMAKE_PATH_HOST_DATA}/mkspecs/features
	install -m 755 ${WORKDIR}/libQt5Core.so.${QT_VERSION} ${D}${OE_QMAKE_PATH_HOST_LIBS}
	QTVERSION=${QT_VERSION}
	ln -snf libQt5Core.so.${QT_VERSION} ${D}${OE_QMAKE_PATH_HOST_LIBS}/libQt5Core.so.${QTVERSION%.*}
	ln -snf libQt5Core.so.${QT_VERSION} ${D}${OE_QMAKE_PATH_HOST_LIBS}/libQt5Core.so.${QTVERSION%%.*}
	ln -snf libQt5Core.so.${QT_VERSION} ${D}${OE_QMAKE_PATH_HOST_LIBS}/libQt5Core.so
}
