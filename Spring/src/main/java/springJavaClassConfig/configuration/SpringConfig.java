package springJavaClassConfig.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import springJavaClassConfig.Pen;
import springJavaClassConfig.Pencil;
import springJavaClassConfig.Stationery;
import springJavaClassConfig.Student;

@Configuration
@ComponentScan("springJavaClassConfig")
public class SpringConfig {
//
//    @Bean
//    public Student student(){
//        return new Student();
//    }
//
//    @Bean (name = "studentIdObject")
//    public Student student1(@Qualifier("pencil") Stationery stationery){
//        Student student1 = new Student();
//        student1.setAge(18);
//        student1.setRollNo(8);
//        student1.setName("dohith");
//        student1.setStationery(stationery);
//        return student1;
//    }
//
//    @Bean
//    @Primary
//    public Pen pen(){
//        return new Pen();
//    }
//
//    @Bean
//    @Primary
//    public Pencil pencil(){
//        return new Pencil();
//    }


}
