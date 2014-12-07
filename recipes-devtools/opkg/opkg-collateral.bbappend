OPKG_BUILD_MACHINE ?= "${MACHINE}"
OPKG_BUILD_MACHINE_wisehmi = "wisehmi"

OPKG_BUILD_FEATURE ?= "base"

OPKG_DOWNLOAD_SERVER ?= "yocto.autorock.com"

OPKG_DOWNLOAD_URL ?= "http://${OPKG_DOWNLOAD_SERVER}/${DISTRO}/${OPKG_BUILD_MACHINE}/${OPKG_BUILD_FEATURE}/ipk"

do_compile_append() {
	ipkgarchs="${ALL_MULTILIB_PACKAGE_ARCHS}"
	for arch in $ipkgarchs; do 
		echo "src ${arch} ${OPKG_DOWNLOAD_URL}/${arch}" >> ${WORKDIR}/opkg.conf
	done
}

