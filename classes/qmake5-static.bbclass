inherit qmake5-static-base

# for fast boot lib
DEPENDS += "icu-native emutils"

do_configure_prepend() {
	# for binary qtquickcompiler to find libQt5Core.so.5
	export LD_LIBRARY_PATH=${OE_QMAKE_PATH_HOST_LIBS}
}

do_configure() {
	${OE_QMAKE_PATH_HOST_BINS}/qmake `ls ${S}/*.pro`
}

do_compile_prepend() {
	# for binary qtquickcompiler to find libQt5Core.so.5
	export LD_LIBRARY_PATH=${OE_QMAKE_PATH_HOST_LIBS}
}
