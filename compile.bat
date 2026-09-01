@echo off
setlocal

set "JAVA_HOME=C:\Users\jorfa\AppData\Local\jdks\jdk-24"
set "M2_HOME=C:\Users\jorfa\.maven\maven-3.9.16"
set "PATH=%M2_HOME%\bin;%JAVA_HOME%\bin;%PATH%"

cd /d "C:\Users\jorfa\Documents\GitHub\SistemaTutorias"

echo.
echo ================================================
echo Compilando proyecto Maven - SistemaTutorias
echo ================================================
echo JAVA_HOME: %JAVA_HOME%
echo M2_HOME: %M2_HOME%
echo.

call "%M2_HOME%\bin\mvn.cmd" clean compile

echo.
if %ERRORLEVEL% EQU 0 (
    echo BUILD SUCCESS
) else (
    echo BUILD FAILED - Error Level: %ERRORLEVEL%
)
echo.
