FROM openjdk:8

MAINTAINER Sirish Yalamanchili "sirishmax@gmail.com"
ENV REFRESHED_AT 2017-05-14


# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
#EXPOSE 8085

ADD jboot/target/*.war app.war

RUN sh -c 'touch /app.war'

ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS  -Djava.security.egd=file:/dev/./urandom  -jar /app.war





