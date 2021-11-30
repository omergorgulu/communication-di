package com.aep.training.communicationdi;

import com.aep.training.communicationdi.controller.ConstructorCommunicationController;
import com.aep.training.communicationdi.controller.FieldCommunicationController;
import com.aep.training.communicationdi.controller.SetterCommunicationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CommunicationDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CommunicationDiApplication.class, args);

        System.out.println("Field -------------------------");
        FieldCommunicationController fieldCommunicationController = (FieldCommunicationController) context.getBean("fieldCommunicationController");
        fieldCommunicationController.handleMessage();

        System.out.println("Constructor -------------------------");
        ConstructorCommunicationController constructorCommunicationController = (ConstructorCommunicationController) context.getBean("constructorCommunicationController");
        constructorCommunicationController.handleMessage();

        System.out.println("Setter -------------------------");
        SetterCommunicationController setterCommunicationController = (SetterCommunicationController) context.getBean("setterCommunicationController");
        setterCommunicationController.handleMessage();

    }

}
