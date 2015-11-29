
create_sdk_files_append () {
    (cd ${SDK_OUTPUT}/${SDKPATHNATIVE}; \
         ln -sf ${SDK_OUTPUT}/${SDKPATHNATIVE}/usr/lib ${SDK_OUTPUT}/${SDKPATHNATIVE}/usr/bin/lib;)
}

