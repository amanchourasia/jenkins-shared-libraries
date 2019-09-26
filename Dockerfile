FROM java:8-jdk-alpine
RUN mkdir -p /usr/app
#COPY /home/java-maven-junit-helloworld-2.0-SNAPSHOT /usr/app/java-maven-junit-h                               elloworld-2.0-SNAPSHOT
COPY /home/abc.txt /usr/app/abc.txt
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "java-maven-junit-helloworld-2.0-SNAPSHOT"]
