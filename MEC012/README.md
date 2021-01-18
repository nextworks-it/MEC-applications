# MEC application for computing failing handovers using GS MEC012 
## Introduction
This repository contains a solution of the execise 4.1. Briefly, the exercise consists of designing a MEC application that uses the information provided by the Radio Network Information (RNI) MEC Service (RNIS) defined in the [ETSI GS MEC 012 specification](https://www.etsi.org/deliver/etsi_gs/MEC/001_099/012/02.01.01_60/gs_mec012v020101p.pdf)  to compute the percentage of failed handovers occurred for a specific User Equipment (UE) in an area covered by the MEC service (e.g., a shopping center). All the details about the exercise are available in the book.
In the following sections are listed and described the requirements and the steps to configure, install, execute and use the client and server sides of the aforementioned MEC application. 

## Getting started
Below are listed the requirements to install, configure and run properly the client and server side of MEC application.

### Requirements
* **[Java 1.8.0]** -  a different version of Java could give some error during the compilation of source code. 
* **[Apache maven 3.6.0]** -  for building the projects.

### Clone the repo
 Clone this repository with `git clone https://github.com/nextworks-it/MEC-applications`.
 The repository contains the `mec012` directory which includes two directories: `mec012-client`  and `mec012-server`. In details, these directories contain the source code of the client and server side of MEC application, respectively.

### Configuration
Below are listed the steps to properly configure the client and server sides of MEC application. The two sides of the MEC application are Spring-based and the related *application.properties* files need to be configured. 

##### Client side
The *application.properties*  is available in *mec012-client/src/main/resources* directory. In the file are specified:
* ```server.ip```, the IP address of the client side of MEC application. To this IP and port (configuration below) the server will send the notification
* ```server.port```, the port of the client side of MEC application
* ```mec-server.ip```, the IP of MEC application server side
* ```mec-server.port```, the port of MEC application server side. 

An example is shown below:
    
    
``` diff
    server.ip=10.30.8.52
    server.port=8083
    mec-server.ip=10.30.8.54
    mec-server.port=8080
```

##### Server side    
The *application.properties* file is available in *mec012-server/src/main/resources*. In the file are specified: 
* ```server.ip```, the IP address the server side
* ```server.port```, the port the server side is running on.
    
An example of configuration is below shown.

```diff
server.ip=10.30.8.54
server.port=8080
```    

### Installation
Once successfully configured, both client and server sides need to be installed.  It is assumed to run below commands under a Linux environment. 

##### Client side
1. From *mec-012* directory, move to **client** code directory with `cd mec012-client`.
2. Build the client code with `mvn package`. The *target* directory is created and contains the jar file ready to be exectued.

##### Server side
1. From *mec-012* directory, move to **server** code directory with `cd mec012-server`.
2. As previously done for client code, build the server code with `mvn package`. Also in this case, the *target* directory is created and it contains the jar file ready to be exectued.


### Execution
Below are listed the steps to execute the client and server side of the MEC application. In both cases, a Spring server will be up and running, ready to receive requests. 

##### Client side
1. Move into the target directory of client side in `mec012-client/target`. 
2. Execute the client with `java -jar MEC012-Application-1.0.0.jar`. With default configuration, it makes up and running a web server running on port 8083. 

##### Client side
1. Open another terminal and move into the target directory of server side in `mec012-server/target`. 
2. As done for the client side, execute the server with `java -jar MEC012-Application-Server-side-1.0.0.jar`. With default configuration, it makes the server is up and running on port 8080.

At this stage both client and server side are up and running.

### Usage
For the purpose of the exercise, is needed to trigger the client with a POST request. The POST request could be triggered using *curl* as shown below:

`curl -X POST http://<IP_CLIENT_SIDE>:<PORT_CLIENT_SIDE>/collection/ -v  -H  'Content-Type: application/json'`

For instance, IP_CLIENT_SIDE is 10.30.8.52 and PORT_CLIENT_SIDE is 8083:
`curl -X POST http://10.30.8.52:8083/collection/ -v  -H  'Content-Type: application/json'`

Technically speaking, the above request triggers the client to perform first a GET request to the server and then a subscription request is sent. Then, a certain number of notifications are sent by the server to the client that computes the handover failed percentage based on received notifications. On the client side, the output wil be shown on the standard output.

### Authors  
**Giada Landi**, **Elian Kraja**, **Pietro Piscione**  [Nextworks S.r.l.](http://www.nextworks.it)

### License
This project is licensed under the Apache 2.0 License - see the [LICENSE](https://github.com/nextworks-it/MEC-applications/blob/master/LICENSE) file for details.



