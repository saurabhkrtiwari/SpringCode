package org.saurabh.box;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class BoxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
 		WoodBox woodbox = (WoodBox)context.getBean("woodbox");
 		woodbox.display();
	}

}
