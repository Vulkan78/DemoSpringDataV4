package com.objis.spring.demopresentation;


import com.objis.spring.demodao.FormationDao;
import com.objis.spring.demodomaine.Formation;
import com.objis.spring.demoservice.FormationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
public class DemoV4Application {

	public static void main(String[] args) {
		try{
			
			Formation formation = new Formation ( 1, "GTM" );
			
			// TODO Auto-generated method stub
			// 1. Chargement du conteneur en 4.0.0 Spring
			//ApplicationContext appContext = new ClassPathXmlApplicationContext(new String ("demo-beans.xml"));
			ApplicationContext appContext = new AnnotationConfigApplicationContext(DemoV1Application.class);
			
			// 2. Recuperation d'un bean du conteneur
			FormationService formationService = (FormationService) appContext.getBean(FormationService.class);
	
			// 3. Manipulation du bean avec injection de dependances
			formationService.creerformation(formation);
			((AnnotationConfigApplicationContext) appContext).close(); 
			
		 } catch (Exception e) {
			 e.printStackTrace();
	     }
	}
	
	@Bean(initMethod="initmethod", destroyMethod="destroymethod")
	public FormationService formationService() {
		return new FormationService();
	}
	
	@Bean
	public FormationDao formationDao() {
		return new FormationDao();
	}
}
