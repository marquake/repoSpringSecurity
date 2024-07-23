# Usar la imagen base de OpenJDK
FROM openjdk:17-jdk-alpine

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR de la aplicación al directorio de trabajo del contenedor
COPY target/oauth2-app-0.0.1-SNAPSHOT.jar /app/oauth2-app-0.0.1-SNAPSHOT.jar

# Exponer el puerto en el que tu aplicación está escuchando
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/oauth2-app-0.0.1-SNAPSHOT.jar"]
