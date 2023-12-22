package spring_hibernate_annotaion.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import spring_hibernate_annotaion.dto.Country;
import spring_hibernate_annotaion.dto.CountryConfig;
import spring_hibernate_annotaion.dto.State;
import spring_hibernate_annotation.dao.CountryDao;

public class MainController {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(CountryConfig.class);
		State state=(State) applicationContext.getBean("state");
		state.setName("MH");
		state.setCm("Eknath Shinde");
		
		State state2=(State) applicationContext.getBean("state");
		state2.setName("KARN");
		state2.setCm("sidhu");
		
		List<State> list=new ArrayList<State>();
		list.add(state);
		list.add(state2);
		
		Country country=(Country) applicationContext.getBean("country");
		country.setStates(list);
		
		CountryDao countryDao=(CountryDao) applicationContext.getBean("countryDao");
		countryDao.saveCountry(country);
		((AbstractApplicationContext) applicationContext).close();
		
	}

}
