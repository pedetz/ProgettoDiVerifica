FROM tomcat:8-jdk8-openjdk
COPY /target/ProgettoVerifica.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]