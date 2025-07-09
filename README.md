Proyecto TDD 

Este es un proyecto desarrollado en Java que implementa la metodología Test Driven Development (TDD) para un sistema CRUD completo. Se enfoca en la calidad del código desde el inicio, integrando pruebas automatizadas, reporte de cobertura y una estructura clara y profesional, apta para entregas técnicas.
🎯 Objetivo
Desarrollar un módulo backend funcional y bien testeado, como parte de una práctica formativa orientada a los estándares utilizados en entornos reales de trabajo.

⚙️ Tecnologías utilizadas

- Java 17
- Gradle
- JUnit 5
- Mockito
- JaCoCo
- H2 Database (modo embedded)
- Git

🧪 Testing y métricas

- Pruebas unitarias implementadas con JUnit y Mockito.
- Reporte de cobertura generado con JaCoCo, en formato HTML.
📁 Ubicación del reporte: build/reports/jacoco/test/html/index.html
| Paquete | Instrucciones | Ramas | 
| model | 100% | 100% | 
| repository | 90% | 100% | 
| config | 50% | — | 


🧾 Para ejecutar tests y generar cobertura
./gradlew clean test jacocoTestReport

📁 Estructura del proyecto

src/
├── main/java/
│   ├── config/        # Configuraciones del entorno (DBConnection)
│   ├── model/         # Entidades del dominio (Item)
│   └── repository/    # Persistencia CRUD y lógica de negocio
└── test/java/
    └── repository/    # Pruebas unitarias según enfoque TDD
docs/
└── Informe_TDD_PazGPortillo.docx  # Informe técnico del proyecto




🚀 Ejecución del Proyecto
📥 1. Clonar el repositorio
Abre una terminal y ejecuta:

bash

git clone https://github.com/Pazstack/Proyecto-TDD-SOFOFA
cd PROYECTO_TDD

⚙️ 2. Compilar el proyecto
bash
./gradlew build
Esto compilará el proyecto y resolverá las dependencias configuradas en build.gradle.

🧪 Ejecución de Pruebas Unitarias
Para correr los tests unitarios desde la línea de comandos:

bash
./gradlew test

También puedes ejecutar las pruebas directamente desde tu IDE (por ejemplo IntelliJ IDEA) haciendo clic derecho sobre el archivo ItemRepositoryTest.java o cualquier clase de test, y seleccionando "Run...".

📄 Documentación
El informe técnico del proyecto se encuentra en la carpeta /docs: docs/Informe_TDD_PazGPortillo.docx

Incluye detalles sobre metodología TDD, estructura del proyecto, cobertura de pruebas y reflexiones.