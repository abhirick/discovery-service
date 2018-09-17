## DISCOVERY-SERVICE

### Table of Contents  

- [Info](#Info)  
- [GIT](#GIT)  
- [Dependencies](#Dependencies)  
- [Environment-Variables ](#Environment-Variables)   
- [Folder-Structure](#Folder-Structure)  
- [Maven-CMDS](#Maven-CMDS)  
- [Application-SetUp](#Application-SetUp)  
- [Database-SetUp](#Database-Setup)  
- [Access-Points](#Access-Points)  


## Info<a name="Info"></a> 
	This microservice will provide the service registry and discovery server.
	All the clients can retrieve list of all connected peers of a service registry and makes all further requests to any other 	services through a load-balancing algorithm.

## GIT<a name="GIT"></a>  
    > git clone 
    
## Dependencies<a name="Dependencies"></a>

## Environment-Variables<a name="Environment-Variables"></a>
   
## Folder-Structure<a name="Folder-Structure"></a>
    kindly follow the below folder structure 
     src/main/java	: Application/Library sources
     src/main/resources: Application/Library resources
     src/main/filters : Resource filter files
     src/main/webapp : Web application sources
     src/test/java	: Test sources for testing
     src/test/resources : Test resources for testing 
     src/test/filters	: Test resource filter files
     src/it	: Integration Tests (primarily for plugins)

## Maven-CMDS<a name="Maven-CMDS"></a>
    Use the following options to run this application, please make sure Maven is installed if not please download form here https://maven.apache.org/
    1. Run > mvn spring-boot:run
    2. Or In Eclipse right click on project -> run as->Spring boot application (Skip steps 1) 
    
## Application-SetUp<a name="Application-SetUp"></a> 
    1. Download the Zip or clone the project from the GIT repository.
    2. Use IDE like Eclipse or STS.
    3. Import the project as Existing Maven Project.
    4. After successful import , update the Maven Dependencies.
    
## Database-Setup<a name="Database-Setup"></a>
	NA
    
## Access-Points <a name="Access-Points"></a>
	This application is configured to run on port number :8761    
	
