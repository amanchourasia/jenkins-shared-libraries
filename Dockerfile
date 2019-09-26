FROM tomcat:8.0-alpine
ADD java-maven-junit-helloworld-2.0-SNAPSHOT.jar /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]
