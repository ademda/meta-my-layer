SUMMARY = "an extension of core-image-minimal with py layer on it and some packages."
LICENSE = "MIT"

inherit core-image
IMAGE_INSTALL += "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"
IMAGE_INSTALL += "my-recipe"
IMAGE_INSTALL += "driver-recipe"
IMAGE_LINGUAS += " "
IMAGE_INSTALL:append = " mc"
CORE_IMAGE_EXTRA_INSTALL += "bash"



