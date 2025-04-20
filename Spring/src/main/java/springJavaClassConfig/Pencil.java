package springJavaClassConfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pencil implements Stationery{
    @Override
    public void getStationeryDetails() {
        System.out.println("5 pencil");
    }
}
