# Ecosistema Microservicios con Spring Cloud

La finalidad de este repositorio es tener una plantilla de toda la estructura de un proyecto basado en microservicios con Spring Cloud.

La arquitectura desarrollada sera la siguiente:

![](https://spring.io/images/cloud-diagram-1a4cad7294b4452864b5ff57175dd983.svg)

Como es un ecosistema este repositorio en si, no es un proyecto Spring, sino que contiene una cantidad de proyectos que forman la arquitectura que vemos en la imagen anterior.

### Proyectos a desarrollar y orden en el cual se desarrollaron

1. Repositorio de configuración
2. Servidor de configuracion
3. Microservicio 1: Por definir su finalidad
4. Microservicio 2: Por definir su finalidad
5. Eureka - Registro y descubrimiento de microservicios
6. Gateway - Puerta del ecosistema
7. Zipkin - Seguimiento de la traza de las peticiones

##### 1. Repositorio de Configuracion

El repo de configuracion, es el unico que quedo por fuera del ecosistema, lo podemos encontrar en https://github.com/srdejo/config se solucionó el error de status:down cambiando el nombre de la rama principal, main a master.

##### 2. Servidor de Configuracion

Se creo el servidor de configuracion siguiendo las siguientes documentaciones: 

https://spring.io/guides/gs/centralized-configuration/ 

https://medium.com/@migueldoctor/spring-cloud-series-spring-cloud-config-server-con-github-paso-a-paso-135d2b4aaf4c