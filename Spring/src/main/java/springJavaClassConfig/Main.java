package springJavaClassConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springJavaClassConfig.configuration.SpringConfig;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Student student = context.getBean(Student.class);
//        Student student = (Student) context.getBean("student");
//        student.getDetails();
        Student student1 = (Student) context.getBean(Student.class);
//        student1.getDetails();
        student1.getStudentStationery();
        student1.getDetails();
    }
}
