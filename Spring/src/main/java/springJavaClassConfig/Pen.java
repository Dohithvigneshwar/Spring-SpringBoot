package springJavaClassConfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements Stationery{
    @Override
    public void getStationeryDetails() {
        System.out.println("10 pen");
    }
}
