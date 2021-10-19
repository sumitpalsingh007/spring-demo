package in.spstech.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Student student1 = (Student)context.getBean("student1");
        Student student2 = (Student)context.getBean("student2");
        Student student3 = (Student)context.getBean("student3");
        Student student4 = (Student)context.getBean("student4");
        Student student5 = (Student)context.getBean("student5");
        System.out.println("Students created");
    }
}
