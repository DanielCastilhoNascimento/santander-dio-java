package padroes_de_projeto.service;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

    /*
     * Spring boot gerado pelo Spring Initializr
     * Com os modulos JPA, WEB, H2, OpenFeign
     * Incluido manualmente no pom o OpenAPI/Swagger (similar ao postman)
     * 
     * Utilizado a IDE VSCode.
     */

    @EnableFeignClients
    @SpringBootApplication

     public class Application {

        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }

}
