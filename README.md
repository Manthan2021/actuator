# actuator
description of actuator



Spring Boot-Actuator--->
The spring-boot-actuator module provides all of Spring Boot’s production-ready features. 
The recommended way to enable the features is to add a dependency on the spring-boot-starter-actuator “Starter”.


Definition of Actuator--->
An actuator is a manufacturing term that refers to a mechanical device for moving or controlling something. Actuators can generate a large amount of motion from a small change.

Refer the Documentation for actuator--->
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#actuator
go to production ready features.

if dependency added the one of the endpoint can be exposed for actuator '/actuator'.

we can check it by........
http://localhost:8080/actuator


to check health we can use
http://localhost:8080/actuator/health

management.endpoints.web.exposure.include=*
through this all the endpoints will be directly exposed.

http://localhost:8080/actuator/mappings
this will print the pattern of request mapping paths.

management.endpoints.health.show-details=always




