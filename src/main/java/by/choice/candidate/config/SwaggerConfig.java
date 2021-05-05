package by.choice.candidate.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author upagge 30.12.2020
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Candidate info API")
                                .version("1.0.0")
                                .contact(
                                        new Contact()
                                                .email("***@gmail.com")
                                                .url("https://***.by")
                                                .name("*** ***")
                                )
                );
    }

}
