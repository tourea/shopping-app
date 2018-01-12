FROM java:8-jre
MAINTAINER Aboubacar Toure

ADD ./build/libs/config-server-1.0-SNAPSHOT.jar /service/
CMD ["java", "-Xmx200m", "-jar", "/service/config-server-1.0-SNAPSHOT.jar"]

HEALTHCHECK --interval=30s --timeout=3s CMD curl -f http://localhost:8888/health || exit 1

EXPOSE 8888
