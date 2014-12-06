FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI += "file://startall \
            file://stopall \
"

do_install_append() {
	install -m 0755    ${WORKDIR}/startall		${D}${sysconfdir}/init.d
	install -m 0755    ${WORKDIR}/stopall		${D}${sysconfdir}/init.d

	update-rc.d -r ${D} -f rmnologin.sh remove
	#update-rc.d -r ${D} -f sendsigs remove
	update-rc.d -r ${D} -f urandom remove
	update-rc.d -r ${D} -f umountnfs.sh remove
	update-rc.d -r ${D} -f umountfs remove
	#update-rc.d -r ${D} -f reboot remove
	#update-rc.d -r ${D} -f halt remove
	update-rc.d -r ${D} -f save-rtc.sh remove
	update-rc.d -r ${D} -f banner.sh remove
	update-rc.d -r ${D} -f checkroot.sh remove
	update-rc.d -r ${D} -f mountall.sh remove
	update-rc.d -r ${D} -f hostname.sh remove
	update-rc.d -r ${D} -f mountnfs.sh remove
	update-rc.d -r ${D} -f bootmisc.sh remove
	update-rc.d -r ${D} -f sysfs.sh remove
	#update-rc.d -r ${D} -f populate-volatile.sh remove
	update-rc.d -r ${D} -f read-only-rootfs-hook.sh remove
	update-rc.d -r ${D} -f devpts.sh remove
	if [ "${TARGET_ARCH}" = "arm" ]; then
	        update-rc.d -r ${D} -f alignment.sh remove
	fi
	update-rc.d -r ${D} -f dmesg.sh remove

	update-rc.d -r ${D} startall start 02 S .
	update-rc.d -r ${D} stopall start 85 0 6 .
}
