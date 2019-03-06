FROM java:8-alpine

ADD ./build/libs/auth-service.jar /app/

CMD ["java", "-Xmx200m", "-jar", "/app/auth-service.jar"]

EXPOSE 5000