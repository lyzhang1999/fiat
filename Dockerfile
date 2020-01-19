FROM gcr.io/spinnaker-marketplace/gradle_cache
MAINTAINER delivery-engineering@netflix.com
ENV GRADLE_USER_HOME /gradle_cache/.gradle
COPY . compiled_sources
WORKDIR compiled_sources
RUN ./gradlew --no-daemon fiat-web:installDist -x test

FROM openjdk:8-jre-alpine
MAINTAINER delivery-engineering@netflix.com
COPY --from=0 /compiled_sources/fiat-web/build/install/fiat /opt/fiat
RUN apk --no-cache add --update bash
RUN adduser -D -S spinnaker
USER spinnaker
CMD ["/opt/fiat/bin/fiat"]