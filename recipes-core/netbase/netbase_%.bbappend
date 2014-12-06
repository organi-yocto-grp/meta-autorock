
do_install_append() {
	echo "172.10.6.1  yocto.autorock.com" >> ${D}${sysconfdir}/hosts
}

