QT_VERSION = "5.4.2"

require qtbase-static.inc
require qmake5-static.inc

SRC_URI[md5sum] = "67a95eec79ffc4a14f516ad6f3d24c96"
SRC_URI[sha256sum] = "9fc4f720b8b5a8b8e4a7d45e13ce4d5b86756ad46fb406386637eb2de5fd5a74"

PACKAGECONFIG = "release libs gles2 widgets gui freetype jpeg libpng zlib accessibility"

PACKAGES =. " \
    ${PN}-fonts \
    ${PN}-fonts-ttf-vera \
    ${PN}-fonts-ttf-dejavu \
    ${PN}-fonts-pfa \
    ${PN}-fonts-pfb \
    ${PN}-fonts-qpf \
"

RRECOMMENDS_${PN}-fonts = " \
    ${PN}-fonts-ttf-vera \
    ${PN}-fonts-ttf-dejavu \
    ${PN}-fonts-pfa \
    ${PN}-fonts-pfb \
    ${PN}-fonts-qpf \
"

ALLOW_EMPTY_${PN}-fonts = "1"

FILES_${PN}-fonts-ttf-vera       = "${OE_QMAKE_PATH_LIBS}/fonts/Vera*.ttf"
FILES_${PN}-fonts-ttf-dejavu     = "${OE_QMAKE_PATH_LIBS}/fonts/DejaVu*.ttf"
FILES_${PN}-fonts-pfa            = "${OE_QMAKE_PATH_LIBS}/fonts/*.pfa"
FILES_${PN}-fonts-pfb            = "${OE_QMAKE_PATH_LIBS}/fonts/*.pfb"
FILES_${PN}-fonts-qpf            = "${OE_QMAKE_PATH_LIBS}/fonts/*.qpf*"
FILES_${PN}-fonts                = "${OE_QMAKE_PATH_LIBS}/fonts/README"
