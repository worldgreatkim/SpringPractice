package kr.co.softcampus.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.softcampus.beans.TestBean;

public class MainClass {
	public static void main(String[] args) {
		//test1();
		test2();
	}
	
	//BeanFactory - 패키지 내부
	public static void test1() { 
		ClassPathResource res = new ClassPathResource("kr/co/softcampus/config/beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		TestBean t1 = factory.getBean("t1",TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		TestBean t2 = factory.getBean("t1",TestBean.class);
		System.out.printf("t1 : %s\n", t2);
	}
	
	//BeanFactory - 패키지 외부
	public static void test2() {
		 FileSystemResource res = new FileSystemResource("beans.xml");
		 XmlBeanFactory factory = new XmlBeanFactory(res);
		 TestBean t1 = factory.getBean("t2",TestBean.class);
		 System.out.printf("t1 : %s\n", t1);
		 
		 TestBean t2 = factory.getBean("t2",TestBean.class);
		 System.out.printf("t2 : %s\n", t1);
	}

}
