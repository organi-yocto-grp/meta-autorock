QT_VERSION = "5.5.1"

require qtbase-static.inc
require qmake5-static.inc

SRC_URI[md5sum] = "687e2b122fa2c3390b5e20a166d38038"
SRC_URI[sha256sum] = "dfa4e8a4d7e4c6b69285e7e8833eeecd819987e1bdbe5baa6b6facd4420de916"

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
