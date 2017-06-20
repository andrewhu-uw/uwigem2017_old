# Initial major update/upgrade
sudo rpi-update
sudo apt-get update
sudo apt-get upgrade


# Install misc useful things
sudo apt-get -y install c++11 emacs python-dev python-rpi.gpio gedit;
sudo apt-get -y install python-smbus synaptic gnome-system-monitor git git-gui git-cola maven
sudo pip install wiringpi2
export PATH=$PATH:/opt/pi4j/lib/


# Download pi4j for Java, compile the examples
curl -s get.pi4j.com | sudo bash
sudo apt-get install pi4j
cd /opt/pi4j/examples
sudo build


# Set up ftp server
sudo apt-get -y install pure-ftpd
sudo groupadd ftpgroup
sudo useradd ftpuser -g ftpgroup -s /sbin/nologin -d /dev/null
sudo mkdir ~/Public/ftp
sudo chown -R ftpuser:ftpgroup ~/Public/ftp
sudo pure-pw useradd upload -u ftpuser -g ftpgroup -d ~/Public/ftp -m
sudo pure-pw mkdb
sudo ln -s /etc/pure-ftpd/conf/PureDB /etc/pure-ftpd/auth/60puredb
sudo service pure-ftpd restart


# Final updates
sudo apt-get update
