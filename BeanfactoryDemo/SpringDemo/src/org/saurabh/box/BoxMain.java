package org.saurabh.box;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class BoxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
 		WoodBox woodbox = (WoodBox)factory.getBean("woodbox");
 		woodbox.display();
	}

}
