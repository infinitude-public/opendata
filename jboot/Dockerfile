FROM openjdk:8
VOLUME /tmp
ADD jboot/target/*.war /jboot.war
RUN sh -c 'touch /jboot.war'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/jboot.war"]
