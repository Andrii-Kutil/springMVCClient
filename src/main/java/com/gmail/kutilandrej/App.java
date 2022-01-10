package com.gmail.kutilandrej;

import com.gmail.kutilandrej.config.MyConfig;
import com.gmail.kutilandrej.entity.Human;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
        MyConfig.class);
    Communication communication = applicationContext.getBean("communication", Communication.class);
    communication.getAllHumans().forEach(System.out::println);
    System.out.println("");
    try {
      communication.getHuman(2);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println("");
    Human saveHuman = new Human("Andr", "Kut", "Doctor", 12345);
    communication.saveHuman(saveHuman);
    communication.getAllHumans().forEach(System.out::println);
    System.out.println("");
    Human updateHuman = new Human(12,"Andr", "Kut", "Doctor", 12345);
    communication.saveHuman(updateHuman);
    communication.getAllHumans().forEach(System.out::println);
    System.out.println("");
    try {
      communication.deleteHuman(14);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
