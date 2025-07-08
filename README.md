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

├── src/
│   ├── main/java/com/sofofa/proyecto/
│   │   ├── config/
│   │   ├── model/
│   │   └── repository/
│   └── test/java/com/sofofa/proyecto/
├── build.gradle
└── README.md 


