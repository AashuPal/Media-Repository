package in.aashu.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    // Swagger configuration can be added here if needed
    // For example, you can use Docket bean to configure Swagger
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)   // for OpenAPI 3.0
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.controllers"))
                .paths(PathSelectors.any())
                .build();
    }

}
