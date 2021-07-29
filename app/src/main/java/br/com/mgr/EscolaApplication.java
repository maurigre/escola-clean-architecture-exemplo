package br.com.mgr;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.mgr.configuration"})
public class EscolaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EscolaApplication.class, args);
    }

}
