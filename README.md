# SistemaTutorias

## Compilación y Build

### Opción 1: Usar build.bat (Recomendado)
```bash
build.bat                   # Compila (clean + compile)
build.bat clean package     # Genera JAR
build.bat clean install     # Instala en repositorio local
```

### Opción 2: Usar Maven directamente
```bash
mvn clean compile
mvn clean package
```