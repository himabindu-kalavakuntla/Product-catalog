# Product-catalog

Spring cloud server is connected using property url: http://localhost:8888/product-catalog/development (server enabled)
Product-catalog Spring cloud client connects to above server and reads the active profile set at below url:
http://localhost:9090/actuator/env

To set up specific profile and get the properties .. you can set the profile either in 

.idea/Environment Variables .. spring.profiles.active   client

Using command :
./gradlew bootRun -Dspring.profiles.active=production
/build/libs/
java -jar -Dspring.profiles.active=produc product-catalog-0.0.1-SNAPSHOT.jar 
export SPRING_PROFILES_ACTIVE=production

To check if properties are updated:
