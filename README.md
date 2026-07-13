# Evaluación de Prestaciones de un Servicio Web

## 1. Descripción y Arquitectura del Proyecto
Para realizar una evaluación objetiva de las prestaciones del servicio web, se estructuró un ecosistema que combina un backend robusto basado en hilos de ejecución concurrentes y una infraestructura virtualizada que aísla los componentes de servicios esenciales.

### Arquitectura del Servidor en Java y Entorno de Desarrollo
El núcleo de la aplicación se desarrolló bajo el lenguaje de programación **Java**, empleando el framework **Spring Boot**. Esta elección responde a la necesidad de contar con una plataforma escalable, dotada de un servidor embebido **Apache Tomcat** optimizado para la gestión automatizada de un pool de hilos (*Thread Pool*), además de una gestión eficiente de la memoria a través de la máquina virtual de Java (JVM). 

La arquitectura lógica implementa una clase principal denominada `DemoApplication.java`, configurada mediante la anotación de nivel superior `@SpringBootApplication`. Al ejecutarse, el framework inicializa de manera automática el servidor web subyacente en el puerto predeterminado **8080**, levantando los contextos y preparando los *endpoints* para atender las solicitudes entrantes de los clientes y despachar la lógica de negocio configurada.

### Contenedorización e Infraestructura con Docker
Con la finalidad de garantizar la portabilidad del sistema, evitar conflictos de dependencias en el sistema operativo anfitrión y simular un entorno de producción realista, se recurrió a la tecnología de contenedores utilizando **Docker**. Mientras el servidor web Java se ejecuta de forma nativa o en su propio espacio controlado, las herramientas de soporte para la gestión de red o monitorización son desplegadas mediante contenedores independientes.

## 2. Tecnologías Utilizadas
* **Lenguaje:** Java
* **Framework:** Spring Boot
* **Servidor Embebido:** Apache Tomcat
* **Gestor de Dependencias:** Apache Maven
* **Contenedores:** Docker y Docker Compose
* **Monitoreo de Red:** Prometheus
* **Entorno de Desarrollo (IDE):** VS Code

## 3. Estructura del Proyecto e Infraestructura de Archivos
El espacio de trabajo se organizó bajo una topología de directorios estandarizada para proyectos basados en Java con el gestor Maven y entornos virtualizados. Esto asegura un aislamiento organizativo absoluto entre el código fuente y las directivas de infraestructura:

```text
proyecto-monitorizacion-red/
├── src/
│   └── main/
│       ├── java/com/telematica/
│       │   └── DemoApplication.java    # API Web y Servidor Embebido Tomcat
│       └── resources/
│           └── application.properties  # Propiedades del servidor (Puerto 8080)
├── pom.xml                             # Gestión de dependencias de software (Maven)
├── prometheus/
│   └── prometheus.yml                  # Manifiesto de configuración de raspado de red
├── Dockerfile                          # Configuración de la imagen base de Java (JDK)
└── docker-compose.yml                  # Orquestador de la red privada y servicios
```

## 4. Requisitos Previos
Para compilar y ejecutar este proyecto en un entorno local, es necesario contar con:

* Java Development Kit (JDK)

* Docker y Docker Compose

* Apache Maven (opcional, se puede usar el wrapper mvnw incluido)

## 5. Instalación y Ejecución
Opción A: Ejecución completa con Docker (Recomendado)
Esta opción levanta tanto el servidor web como los contenedores de monitorización de forma orquestada.

* Clonar el repositorio.

* Abrir una terminal en el directorio raíz del proyecto.

* Ejecutar el orquestador:
docker-compose up --build

**El servidor web estará disponible en http://localhost:8080.**
