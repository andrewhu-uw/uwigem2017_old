# Usage: To compile and run File.java, do
# bash javacomp.sh File
# Notice that ".java" was omitted.

sudo javac -classpath .:classes:/opt/pi4j/lib/'*' -d . $1.java
sudo java -classpath .:classes:/opt/pi4j/lib/'*' $1