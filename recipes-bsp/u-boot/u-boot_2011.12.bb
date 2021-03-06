require u-boot.inc

# SPL build
UBOOT_BINARY = "u-boot.img"
UBOOT_IMAGE = "u-boot-${MACHINE}-${PV}-${PR}.img"
UBOOT_SYMLINK = "u-boot-${MACHINE}.img"

PV = "2011.12"
PR = "r1"

# No patches for other machines yet
COMPATIBLE_MACHINE = "(beagleboard|pandaboard|hawkboard|am3517-evm|am37x-evm|omap3evm)"

SRC_URI = "git://www.denx.de/git/u-boot.git;protocol=git \
           file://2011.12/0001-beagleboard-mount-rootfs-RO-instead-of-RW-at-boot.patch \
           file://2011.12/0002-beagleboard-add-support-for-TCT-Beacon-board.patch \
           file://2011.12/0003-beagleboard-add-support-for-scanning-loop-through-ex.patch \
           file://2011.12/0004-omap4-common-mount-root-RO.patch \
           file://2011.12/0005-omap4-common-use-ext4-by-default.patch \
           file://2011.12/U-Boot-OMAP-MMC-Add-delay-before-waiting-for-status.patch \
          "

# v2011.12 tag
SRCREV = "cba9a894fdb1cb49b60fcd1d1d6919cbd7995dd5"

LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb"

S = "${WORKDIR}/git"
