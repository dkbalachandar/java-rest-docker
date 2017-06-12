FROM java:8

WORKDIR /opt

ADD hello-rest-${project.version}-jar-with-dependencies.jar /opt/helloRest.jar
ADD bin /opt/bin

RUN chmod +x /opt/helloRest.jar
RUN chmod +x /opt/bin/run.sh

CMD ["/opt/bin/run.sh"]

EXPOSE 8080