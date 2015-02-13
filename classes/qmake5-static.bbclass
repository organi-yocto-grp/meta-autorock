inherit qmake5-static-path

# for binary qtquickcompiler to find icu libs
DEPENDS += "icu-native emutils"

do_configure() {
	${OE_QMAKE_PATH_HOST_BINS}/qmake `ls ${S}/*.pro`
}

EXTRA_OEMAKE = " \
    MAKEFLAGS='${PARALLEL_MAKE}' \
"

do_compile_prepend() {
	# for binary qtquickcompiler to find libQt5Core.so.5
	#export ORIGIN=${OE_QMAKE_PATH_HOST_LIBS}
	export LD_LIBRARY_PATH=${OE_QMAKE_PATH_HOST_LIBS}
}
