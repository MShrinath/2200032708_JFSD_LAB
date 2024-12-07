package jfsdexam;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan(basePackages = "jfsdexam")
public class ApplicationConfig {

    @Bean
    public Employee employee() {
        return new Employee(101, "puuspa", 75000.0, "IT", Arrays.asList("Java", "Spring", "SQL"));
    }

    @Bean
    public Course course() {
        Course course = new Course();
        course.setCourseId(301);
        course.setCourseName("jfsdd");
        course.setCredits(4);
        return course;
    }
}
