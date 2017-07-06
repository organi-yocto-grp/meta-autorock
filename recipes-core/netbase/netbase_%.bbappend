
do_install_append() {
	echo "172.10.6.4  yocto.autorock.com" >> ${D}${sysconfdir}/hosts
}

