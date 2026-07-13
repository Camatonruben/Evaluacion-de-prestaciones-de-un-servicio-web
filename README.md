# Evaluación de Prestaciones de un Servicio Web

## Descripción del Proyecto
Este proyecto implementa un ecosistema web diseñado para evaluar de manera objetiva las prestaciones de un servicio de red. Combina un backend robusto basado en hilos de ejecución concurrentes y una infraestructura virtualizada que aísla los componentes de servicios esenciales. 

La arquitectura lógica cuenta con un servidor web embebido (Apache Tomcat) optimizado para la gestión automatizada de un pool de hilos (*Thread Pool*) y una gestión eficiente de memoria a través de la JVM.

## Tecnologías y Arquitectura
* **Lenguaje:** Java
* **Framework:** Spring Boot (Clase principal: `DemoApplication.java`)
* **Servidor Embebido:** Apache Tomcat (Puerto 8080)
* **Gestor de Dependencias:** Apache Maven
* **Contenedorización e Infraestructura:** Docker y Docker Compose
* **Monitoreo de Red:** Prometheus
* **Entorno de Desarrollo (IDE):** VS Code

## Estructura del Proyecto
El espacio de trabajo está organizado bajo una topología estandarizada para proyectos Java con Maven y entornos virtualizados, asegurando un aislamiento total entre el código fuente y las directivas de red:

proyecto-monitorizacion-red/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── telematica/
│       │           └── DemoApplication.java    # API Web y Servidor Embebido Tomcat
│       └── resources/
│           └── application.properties          # Propiedades del servidor (Puerto 8080)
├── pom.xml                                     # Gestión de dependencias (Maven)
├── prometheus/
│   └── prometheus.yml                          # Manifiesto de configuración de raspado de red
├── Dockerfile                                  # Configuración de la imagen base de Java (JDK)
└── docker-compose.yml                          # Orquestador de la red privada y servicios

##Requisitos Previos (Prerequisites)
Para poder compilar y ejecutar este proyecto en un entorno local, es necesario contar con:

-Java Development Kit (JDK): Versión compatible con el proyecto.

-Docker y Docker Compose: Para levantar la infraestructura virtualizada.

-Apache Maven: Para la gestión de dependencias (o utilizar el wrapper incluido).

#Instalación y Ejecución
Opción 1: Ejecución completa con Docker (Recomendado)
Esta opción garantiza la portabilidad del sistema y evita conflictos de dependencias en el sistema operativo anfitrión, levantando tanto el servidor web como los contenedores de monitorización.

Clonar el repositorio.

Abrir una terminal en el directorio raíz del proyecto.

Ejecutar el orquestador:
docker-compose up --build
El servidor web estará disponible en http://localhost:8080.
