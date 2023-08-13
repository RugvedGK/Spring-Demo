package SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Tester {
	public static void main(String[] args) {

//		ClassPathResource resource = new ClassPathResource("/SpringDemo/Configuration.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//
//		Car car = (Car) factory.getBean("car");
//
//		System.out.println(car);

//		ApplicationContext context = new ClassPathXmlApplicationContext("/SpringDemo/Configuration.xml");
//		Car car = (Car) context.getBean("car");
//      System.out.println(car);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/SpringDemo/Configuration.xml");
		Car car = (Car) context.getBean("car");
		System.out.println(car);
		Bike bike = (Bike) context.getBean("bike");
		System.out.println(bike);
	}
}
