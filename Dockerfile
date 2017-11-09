#Set Base image
FROM java:8
#Maintainer
MAINTAINER SUBHASH
#Exposed Port
EXPOSE 8761 
#Volume TMP
VOLUME /tmp
ADD target/eurekaservice-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]