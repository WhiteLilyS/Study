package Test;

import JavaClass.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        Dog mySecondDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Belka");
//        mySecondDog.setName("Strelka");
//        System.out.println("?"+ (myDog==mySecondDog));
//        System.out.println(myDog.getName());
//        System.out.println(mySecondDog.getName());
        context.close();
    }
}
