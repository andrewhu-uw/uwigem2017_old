#@author Andrew Hu @date 7/6/2017

:'Some people have encountered a problem where Pi4J will talk to wiringPi, and wiringPi will give out
a firmware error, saying that it cannot identify the hardware BCM2835 as a Raspberry Pi, even though
it clearly is a Pi. This can be solved by downgrading the kernel to the latest version that worked
which is 4.4.49'

#The long string is the git hash for a commit to this git repo that archives the kernel
#https://github.com/Hexxeh/rpi-firmware/commits/master

sudo rpi-update 2ca627126e49c152beb1bf7abd7122ce076dcc65