package com.nationwide.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <ui>
 * 
 * <li>Eureka instances can be registered and clients can discover the instances
 * using Spring-managed beans</li>
 * 
 * <li>This is a regular Spring Boot application with one
 * annotation @EnableEurekaServer added to enable the service registry. This
 * service acts as a Discovery Server wherein all the client services in the
 * eco-system gets registered with this service</li>
 * 
 * <li>All the clients can retrieve list of all connected peers of a service
 * registry and makes all further requests to any other services through a
 * load-balancing algorithm.</li>
 * 
 * <li>All the clients registered with Eureka need to send heart beat signal to
 * inform about their presence.</li>
 * 
 * </ui>
 * 
 * @author Abhirick
 *
 */
@EnableEurekaServer // To stand up a registry that other applications can talk to.
@SpringBootApplication
public class DiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServiceApplication.class, args);
	}
}
