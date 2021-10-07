# Dekorate Challenge - Core Dream Team

## Quickstart
#### To run locally:
 * mvn spring-boot:run
 * Go to http://localhost:8080
#### To deploy in openshift
 * oc login
 * docker login
 * set your docker hub username in the application.properties -> *dekorate.jib.group=<username>*
 * mvn clean package -Ddekorate.build=true  -Ddekorate.push=true -Ddekorate.deploy=true
 
### Known issues (already reported to Aurea Muñoz):
* The application.properties doesn't always work as it should, so the controller has been configured with annotations

The properties in application.properties are deactivated but still there to show how it would be configured with them

Check the result in
http://dekorate-challenge-user3-dekorate-challenge.apps.cluster-kc2df.kc2df.sandbox790.opentlc.com/

 

