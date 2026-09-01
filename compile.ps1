#!/usr/bin/pwsh
$env:JAVA_HOME = 'C:\Users\jorfa\AppData\Local\jdks\jdk-24'
$env:M2_HOME = 'C:\Users\jorfa\.maven\maven-3.9.16'
$env:PATH = "$env:M2_HOME\bin;$env:JAVA_HOME\bin;$env:PATH"

Write-Host "================================================" -ForegroundColor Cyan
Write-Host "Compilando proyecto Maven - SistemaTutorias" -ForegroundColor Cyan
Write-Host "================================================" -ForegroundColor Cyan
Write-Host ""
Write-Host "JAVA_HOME: $env:JAVA_HOME" -ForegroundColor Yellow
Write-Host "M2_HOME: $env:M2_HOME" -ForegroundColor Yellow
Write-Host ""

Set-Location 'C:\Users\jorfa\Documents\GitHub\SistemaTutorias'

& "$env:M2_HOME\bin\mvn.cmd" clean compile

Write-Host ""
if ($LASTEXITCODE -eq 0) {
    Write-Host "BUILD SUCCESS ✓" -ForegroundColor Green
} else {
    Write-Host "BUILD FAILED - Exit Code: $LASTEXITCODE" -ForegroundColor Red
}
Write-Host ""
