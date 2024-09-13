DESCRIPTION = "Application layer recipe"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI = "file://client.c file://server.c"
S = "${WORKDIR}"


FILES_${PN} = "${bindir}/client ${bindir}/server \ "
               
               


do_compile() {
    echo "11111111111111111111111"
    echo ${S}
    echo ${CC}
    ${CC} ${CFLAGS} ${LDFLAGS} ${S}/client.c -o ${S}/client
    ${CC} ${CFLAGS} ${LDFLAGS} ${S}/server.c -o ${S}/server
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/client ${D}${bindir}/
    install -m 0755 ${S}/server ${D}${bindir}/
}
