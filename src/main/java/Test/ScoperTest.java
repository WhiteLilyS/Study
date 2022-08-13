package Test;

import JavaClass.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScoperTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("dogBean", Dog.class);
        Dog mySecondDog = context.getBean("dogBean", Dog.class);

        System.out.println(myDog == mySecondDog);
        System.out.println(myDog);
        System.out.println(mySecondDog);

        context.close();
    }
}
