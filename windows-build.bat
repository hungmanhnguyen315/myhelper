@echo off
echo Building project...
set JAVA_HOME=d:/programs/jdk1.8.0_121
set BUILD_DIR=bin
set BUILD_OPTS=-Xlint:all -encoding utf8 -sourcepath src
set SRCDIR=src/org/myhelper
rmdir /q /s %BUILD_DIR%
md %BUILD_DIR%
%JAVA_HOME%/bin/javac -d %BUILD_DIR% %BUILD_OPTS% %SRCDIR%/common/*.java
%JAVA_HOME%/bin/jar cvfm myhelper-1.0.jar MANIFEST.MF -C bin org

