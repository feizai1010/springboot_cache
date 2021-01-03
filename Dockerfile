FROM  java:8

RUN mkdir /mydate/personal/harbor/data

COPY ./target/demo-*.jar /mydate/personal/harbor/data

RUN unzip /app/demo-*.jar -d /mydate/personal/harbor/data

WORKDIR /mydate/personal/harbor/data

EXPOSE 8110

ENTRYPOINT /bin/sh bin/startup.sh -m standalone

