inherit qmake5-static-path

PACKAGE_ARCH = "${MACHINE_ARCH}"

EXTRA_OEMAKE = " \
    MAKEFLAGS='${PARALLEL_MAKE}' \
"

