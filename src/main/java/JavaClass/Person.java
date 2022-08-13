package JavaClass;

import model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPet(Pet pet) {
        System.out.println("setPet");
        this.pet = pet;
    }

//    @Autowired
//    public Person(@Qualifier("dogBean") Pet pet) {
//        System.out.println("Constructor");
//        this.pet = pet;
//     }
    public Person( Pet pet) {
        System.out.println("Created personBean");
        this.pet = pet;
     }
    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
