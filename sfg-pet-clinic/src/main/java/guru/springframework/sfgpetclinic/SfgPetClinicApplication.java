package guru.springframework.sfgpetclinic;

import guru.springframework.sfgpetclinic.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgPetClinicApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String test = myController.testSpringContext();

        System.out.println(test);



        System.out.println("----By Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("----By Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("----By Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        //Spring profiles
        I18NController i18NController = (I18NController) ctx.getBean("i18NController");

        System.out.println(i18NController.sayHello());
    }

}
