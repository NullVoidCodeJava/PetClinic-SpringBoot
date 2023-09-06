#FROM openjdk:17
#EXPOSE 8080
#ADD target/petclinic.jar petclinic.jar
#ENTRYPOINT ["java", "-jar", "petclinic.jar"]

FROM openjdk:17
EXPOSE 8080
ADD pet-clinic-web/target/petclinic.jar petclinic.jar
ENTRYPOINT ["java", "-jar", "petclinic.jar"]
