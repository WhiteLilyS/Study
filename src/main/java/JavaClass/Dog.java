package JavaClass;

import model.Pet;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dogBean")
//@Scope("singleton")
public class Dog implements Pet {
//    private String name;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    @PostConstruct()
    public void  init(){
        System.out.println("Init method");
    }
    @PreDestroy
    public  void destroy(){
        System.out.println("Destroy method");
    }
    @Override
    public  void say(){
        System.out.println("Wow -wow");
    }

}
