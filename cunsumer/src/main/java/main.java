import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.OrderService;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cunsumer.xml");
        OrderService bean = context.getBean(OrderService.class);
        bean.initOrder("1");
        System.in.read();
    }
}
