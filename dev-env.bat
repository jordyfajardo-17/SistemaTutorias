@echo off
REM Configuración de ambiente para desarrollo
set JAVA_HOME=C:\Program Files\Java\jdk-26.0.2.1
set PATH=%JAVA_HOME%\bin;C:\Users\jorfa\.maven\maven-3.9.16\bin;%PATH%

REM Verifica que Java esté disponible
java -version

REM Abre PowerShell con el ambiente configurado
powershell -NoExit -Command "Write-Host 'Ambiente configurado: JAVA_HOME y Maven listos para usar' -ForegroundColor Green"
