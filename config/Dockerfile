FROM java:8-alpine

ADD ./build/libs/config.jar /app/

CMD ["java", "-Xmx200m", "-jar", "/app/config.jar"]

EXPOSE 8888