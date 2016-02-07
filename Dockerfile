FROM java:7

ADD ./target/grizzly-1.0-SNAPSHOT-jar-with-dependencies.jar /opt/grizzly-1.0-SNAPSHOT.jar
ENTRYPOINT java -jar /opt/grizzly-1.0-SNAPSHOT.jar

EXPOSE 8081

