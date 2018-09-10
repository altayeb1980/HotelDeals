FROM openjdk:8
VOLUME /tmp
ENV SPRING_BOOT_DOCKER_APP_HOME=/opt/boot-docker
ENV SPRING_BOOT_DOCKER_APP_BINARIES=/opt/boot-docker/bin
ENV FINAL_JAR_NAME=/hotel-deals-app.jar

# Create directory
RUN mkdir -p $SPRING_BOOT_DOCKER_APP_BINARIES

WORKDIR $SPRING_BOOT_DOCKER_APP_HOME
COPY target/*.jar $SPRING_BOOT_DOCKER_APP_HOME$FINAL_JAR_NAME

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar", "${FINAL_JAR_NAME}"]