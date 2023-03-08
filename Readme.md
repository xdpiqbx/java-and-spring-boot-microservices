### !!! The lesson was not completed. It was an advertisement for the course. Here is only the very initial base. 
 
---

mvn archetype:generate "-DgroupId=com.dpiqb" "-DartifactId=micros" "-DarchetypeArtifactId=maven-archetype-quickstart" "-DarchetypeVersion=1.4" "-DinteractiveMode=false"

---

1. remove `src` folder
2. prepare parent [`pom.xml`](clear-parent-pom.xml) for microservices
3. create new MODULE in PROJECT. In parent pom automaticly added section:
```xml
  <modules>
    <module>customer</module>
  </modules>
```
4. add basics microservice (entity, controller, service, DTOs)
5. `docker-compose`
6. configure `application.yml`
7. add dependencies to `customer` `pom.xml`
8. write service

Same for other services

---

For load balancer we need spring cloud

---

[zipkin.io](https://zipkin.io/pages/quickstart.html)
`docker run -d -p 9411:9411 openzipkin/zipkin`

`docker run -d -p 8761:8761 springcloud/eureka`

---

For Docker
```console
docker compose up -d
```

