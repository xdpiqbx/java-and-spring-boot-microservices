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
