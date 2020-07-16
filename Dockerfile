FROM java:8-jdk-alpine

COPY target/ibm-hackathon-backend-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch ibm-hackathon-backend-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","ibm-hackathon-backend-0.0.1-SNAPSHOT.jar"]  