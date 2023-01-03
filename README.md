# microprofile-metrics-quickstart

This project uses Quarkus, and expose metrics for prometheus to integrate with OpenShift User Workloads Monitoring.

## How to recreate from the beginning?

1. Create the quarkus project:
    ```bash
    $ mvn io.quarkus.platform:quarkus-maven-plugin:2.15.1.Final:create \
        -DprojectGroupId=org.acme \
        -DprojectArtifactId=microprofile-metrics-quickstart \
        -Dextensions='resteasy-reactive' \
        -DnoCode
    $ cd microprofile-metrics-quickstart
    ```

2. Add the extension `quarkus-micrometer-registry-prometheus`:
    ```bash
    $ ./mvnw quarkus:add-extension -Dextensions='quarkus-micrometer-registry-prometheus'
    ```

3. Create the resource [GreetingsResource.java](./src/main/java/org/acme/GreetingsResource.java) using metrics.

4. Run the application:
    ```bash
    $ ./mvnw quarkus:dev
    ```

5. Check the metrics endpoint:
    ```bash
    $ curl -X GET localhots:8080/q/metrics
    ```