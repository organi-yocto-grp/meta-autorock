
create_sdk_files_append () {
    (cd ${SDK_OUTPUT}/${SDKPATHNATIVE}; \
         ln -sf ${SDKPATHNATIVE}${OE_QMAKE_PATH_LIBS} ${SDK_OUTPUT}/${SDKPATHNATIVE}/usr/bin/lib;)
}

