QT_VERSION = "5.9.1"

require qtbase-static.inc
require qmake5-static.inc

SRC_URI[md5sum] = "5a74869fc3731bcb8311e62e235d11a7"
SRC_URI[sha256sum] = "bc9a21e9f6fff9629019fdf9f989f064751d5073c3a28dc596def92f4d4275c6"

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
