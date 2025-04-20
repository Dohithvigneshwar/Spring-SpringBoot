package springJavaClassConfig;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Getter
    @Setter
    @Value("18")
    private int age;
    @Value("8")
    private int rollNo;
    @Getter
    @Setter
    @Value("Dohith Sp")
    private String name;
//    field Injection
//    @Autowired
//    @Qualifier("pencil")
    private Stationery stationery;

    public Student(){
        System.out.println("Student Constructor");
    }

//    Constructor Injection
    @Autowired
    public Student(@Qualifier("pen") Stationery stationery){
        this.stationery = stationery;
    }

    public void getDetails(){
        System.out.println("Age : "+age+" rollNo : "+rollNo+" name : "+name);
    }
//    @Autowired
//    @Qualifier("pen")
//    Setter Injection
//    public void setStationery(Stationery stationery){
//        this.stationery = stationery;
//    }
    public void getStudentStationery(){
        stationery.getStationeryDetails();
    }
}
