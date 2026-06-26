FROM tomcat:10.1-jdk21

COPY target/myapp.war /usr/local/tomcat/webapps/myapp.war

EXPOSE 8080
