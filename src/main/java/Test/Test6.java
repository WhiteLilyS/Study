package Test;

import Configuration.MyConfig;
import JavaClass.Person;
import model.Pet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();
//        ----------------
//        Pet secondCat = context.getBean("catBean", Pet.class);
//        Pet cat = context.getBean("catBean", Pet.class);
//        secondCat.say();
//        cat.say();
//        -------------------
//        Person person2 = context.getBean("personBean",Person.class);
//        person.callYourPet();
//-----------------------------
        Person person = context.getBean("personBean",Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}
