# docker-wildflyswarm
Dockerized Wildfly-Swarm Example

## Synopsis

This is a little Demo-Project to tinker with **Docker** and **Wildfly Swarm**. 
The result is a minimum JSF-Swarm-App that runs with PrimeFaces and basically does nothing but show static Text. 
But it's in a docker Container, which was the point of the excercise.  

## Installation

Clone the project, build it and fiddle around with it.
The only Maven Parameters you need are **docker.registry.host** and **docker.registry.port** since I use my own private Registry for experiments. 

Port to expose: 

**8080** (Default Wildfly Swarm Port)

If you want to change the port, you can change the **&lt;entryPoint&gt;** in the projects pom.xml to include "-Dswarm.http.port" like this:
&lt;entryPoint&gt;["java", "-Dswarm.http.port=&lt;port&gt; -jar", "/${project.build.finalName}-swarm.jar"]&lt;/entryPoint&gt;


How to build: 

mvn clean install docker:build -Ddocker.registry.host=<your docker registry host> -Ddocker.registry.port=<your docker registry port>
Boot up the container and point your browser to the respective URL


## License

Since there is not really anything useful and/or secret stuff here, knock yourself out. If I had to name a license it would be the WTFPL found here http://www.wtfpl.net/about/.
