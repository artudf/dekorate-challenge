# Dekorate Challenge - Core Dream Team

## Quickstart
#### To run locally:
 * mvn spring-boot:run
#### To deploy in openshift
 * oc login
 * docker login
 * set your docker hub username in the application.properties -> *dekorate.docker.group=<username>*
 * mvn clean package -Ddekorate.build=true  -Ddekorate.push=true -Ddekorate.deploy=true

oc apply -f target/classes/META-INF/dekorate/openshift.yml


