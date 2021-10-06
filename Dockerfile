#Step Run Tomcat sql
FROM tomcat:8.0-alpine
ADD . /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh","run"]
#Step build maven
FROM maven:3.6.1
COPY src /home/app/src
COPY . /home/app/
RUN mvn clean package

#
#Step Run jre
#
FROM openjdk:8-jdk-alpine
LABEL Haythem Bennani <bennani@elhebri.com>
COPY --from=build /home/app/target/demo-0.0.1-SNAPSHOT.jar /usr/local/lib/devopsrest.jar
EXPOSE 8088
ENTRYPOINT [ "java","jar","./devopsrest.jar" ]



