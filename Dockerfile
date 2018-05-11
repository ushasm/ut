FROM gradle:4.7-jdk-alpine

WORKDIR /opt/spring

ADD . /opt/spring

USER root

RUN chown -R gradle /opt/spring

USER gradle

EXPOSE 8080

CMD ["gradle", "bootRun"]

