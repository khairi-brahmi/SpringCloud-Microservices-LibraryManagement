package fst.if5.cloud.projetMicroServices.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationDiscovery {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationDiscovery.class, args);
	}	
}