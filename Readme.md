[Continue from](https://youtu.be/1aWhYEynZQw?t=1638)

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
 
---

For Docker
```console
docker compose up -d
```
