import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HowToUseWithSpring {
	
	public static void main(String[] args) {
		PayService payService = new PayService();
        
		/* 从Spring获取指定接口的实现类，并注册为观察者 */
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		String[] beanNames = context.getBeanNamesForType(PayObserver.class);
		System.out.println(Arrays.toString(beanNames));
		for (String beanName : beanNames) {
			payService.addObserver((PayObserver)context.getBean(beanName));
		}
        
        payService.update(1, 10000);
	}

}
