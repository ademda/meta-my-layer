obj-m := heat_sens_dev.o

KDIR := $(KERNEL_SRC)

PWD := $(shell pwd)

all:
	make -C $(KDIR) M=$(PWD) modules

clean:
	make -C $(KDIR) M=$(PWD) clean