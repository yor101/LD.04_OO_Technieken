package ootechnieken.OOtechnieken;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SpringBootApplication
public class OoTechniekenApplication {

	public static void main(String[] args) {
		SpringApplication.run(OoTechniekenApplication.class, args);

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("SpringOO.xml"));
		Triangle triangleFactory = (Triangle) factory.getBean("triangle");
		triangleFactory.draw();



	}

}
