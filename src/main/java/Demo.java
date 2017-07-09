import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vykhor on 04.07.17.
 */

public class Demo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Car car2 = (Car)context.getBean("Car");
        car2.getInfo();
    }

}
