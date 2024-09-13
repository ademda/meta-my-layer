DESCRIPTION = "sensor driver recipe"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI = "file://heat_sens_dev.c \
           file://Makefile \
           file://heat-sens-driver-load.sh \
           file://heat-sens-driver-unload.sh"

S = "${WORKDIR}"
FILES:${PN} += "/lib/modules/heat_sens_dev.ko \
               ${bindir}/heat-sens-driver-load.sh ${bindir}/heat-sens-driver-unload.sh"
#FILES_${PN}-dbg = "${libdir}/debug"
KERNEL_SRC = "${STAGING_KERNEL_DIR}"
inherit module

PACKAGES = "${PN} ${PN}-dbg"


do_compile() {
    echo ${S}
    echo "11111111111111111111111"
    oe_runmake KERNEL_SRC=${KERNEL_SRC}
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/heat-sens-driver-load.sh ${D}${bindir}/
    install -m 0755 ${S}/heat-sens-driver-unload.sh ${D}${bindir}/

    install -d ${D}/lib/modules
    install -m 0755 ${S}/heat_sens_dev.ko ${D}/lib/modules/
}
