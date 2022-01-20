package fst.if5.cloud.projetMicroServices.administration;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class ApplicationAdministation {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationAdministation.class, args);
	}
/*
	@Bean
	public AlwaysSampler defaultSampler() {
		return new AlwaysSampler();
	}
	
	@Bean
	public Docket api() throws IOException, XmlPullParserException {
        MavenXpp3Reader reader = new MavenXpp3Reader();
        Model model = reader.read(new FileReader("pom.xml"));
        return new Docket(DocumentationType.SWAGGER_2)  
                .select() 
                .apis(RequestHandlerSelectors.basePackage("fst.if5.cloud.projetMicroServices.administration.api"))
                .paths(PathSelectors.any())                          
                .build().apiInfo(new ApiInfo("Administration Service Api Documentation", "Documentation automatically generated", model.getParent().getVersion(), null, new Contact("", "", ""), null, null));
	}
  */  
}
