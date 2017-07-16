import cars.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vykhor on 04.07.17.
 */

public class Demo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Car car1 = (Car)context.getBean("ColoredVolvo");
        car1.getInfo();

        Car car2 = (Car)context.getBean("ColoredVolvo");
        car2.getInfo();

        Car car3 = (Car)context.getBean("Volvo");
        car3.getInfo();

        Car car4 = (Car)context.getBean("Volvo");
        car4.getInfo();
    }

}
