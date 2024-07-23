# Etapa 1: Construcción de la aplicación
FROM maven:3.8.4-openjdk-17 AS build

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar los archivos de la aplicación
COPY . .

# Construir el proyecto y generar el JAR
RUN mvn clean package -DskipTests

# Etapa 2: Creación de la imagen final
FROM openjdk:17-jdk-alpine

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el JAR generado desde la etapa de construcción
COPY --from=build /app/target/oauth2-app-0.0.1-SNAPSHOT.jar /app/oauth2-app-0.0.1-SNAPSHOT.jar

# Exponer el puerto en el que la aplicación escucha
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/oauth2-app-0.0.1-SNAPSHOT.jar"]