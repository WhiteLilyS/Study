package Configuration;

import JavaClass.Cat;
import JavaClass.Person;
import model.Pet;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("JavaClass")
public class MyConfig {

    @Bean
//    @Scope("prototype")
    public Pet catBean() {
        System.out.println("!!!");
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
