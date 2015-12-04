@echo off

mkdir bin
dir /s /B *.java > src.txt
javac -d bin @src.txt
jar cf jre8deps.jar -C bin/ .
rm src.txt
rmdir /Q /S bin
