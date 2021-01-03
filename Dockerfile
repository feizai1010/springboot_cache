FROM  java:8

RUN mkdir /home/demo

WORKDIR /home/demo

COPY ./target/demo-*.jar /home/demo/demo.jar

EXPOSE 8110

#ENTRYPOINT /bin/sh bin/startup.sh -m standalone
ENTRYPOINT /usr/bin/java -Xms512m -Xms512m -jar demo.jar

