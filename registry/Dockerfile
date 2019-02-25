FROM java:8-alpine

ADD ./build/libs/registry.jar /app/

CMD ["java", "-Xmx200m", "-jar", "/app/registry.jar"]

EXPOSE 8761