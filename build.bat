@echo off
setlocal enabledelayedexpansion

set JAVA_HOME=C:\Program Files\Java\jdk-26.0.2.1

echo JAVA_HOME=%JAVA_HOME%

if exist "%JAVA_HOME%\bin\java.exe" (
    echo Java encontrado!
    "%JAVA_HOME%\bin\java.exe" -version
) else (
    echo Java NO encontrado en %JAVA_HOME%\bin\java.exe
)

cd /d C:\Users\jorfa\Documents\GitHub\SistemaTutorias

if "%~1"=="" (
    echo Ejecutando: mvn clean compile
    mvn clean compile
) else (
    echo Ejecutando: mvn %*
    mvn %*
)

endlocal
