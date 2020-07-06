package com.springrest;
import com.springrest.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan({"com.springrest.repository"})
public class App
{
    public static void main( String[] args )
    {
        SpringApplication sp = new SpringApplication(App.class);
        sp.run();
        System.out.println( "Hello World!" );
    }
}