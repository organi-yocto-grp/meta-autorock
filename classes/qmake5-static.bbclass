inherit qmake5-static-path

do_configure() {
	${OE_QMAKE_PATH_HOST_BINS}/qmake `ls ${S}/*.pro`
}

EXTRA_OEMAKE = " \
    MAKEFLAGS='${PARALLEL_MAKE}' \
"
