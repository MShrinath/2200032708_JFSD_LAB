package jfsdexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Employee employee = context.getBean(Employee.class);
        System.out.println("Employee Details: " + employee);
        
        System.out.println("\n");

        Course course = context.getBean(Course.class);
        System.out.println("Course Details: " + course);
    }
}
