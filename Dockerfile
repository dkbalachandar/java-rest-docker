FROM java:8

ADD ./target/hello-1.0-jar-with-dependencies.jar /opt/hello-1.0.jar
ENTRYPOINT java -jar /opt/hello-1.0.jar

EXPOSE 8080
