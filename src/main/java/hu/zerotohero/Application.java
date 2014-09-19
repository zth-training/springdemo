package hu.zerotohero;

import hu.zerotohero.dao.CountryDao;
import hu.zerotohero.dao.CountryDaoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import hu.zerotohero.model.Country;
import hu.zerotohero.model.Region;

/**
 * @author Adam Saghy <adam.saghy@webvalto.hu>
 */


public class Application {
	private static CountryCreator countryCreator;

	public static void main(String[] args) {
		//Spring context inicializálása: application-context.xml-es beanek betöltése
		ApplicationContext context =
				new ClassPathXmlApplicationContext("/application-context.xml");
		//A context-ből lekérjük a CountryCreator bean-t.
		countryCreator = context.getBean(CountryCreator.class);

		//Példa műveletek
		createHungary();
		Country hungary = getCountry("HU");
		System.out.println(hungary.getName());
		deleteHungary(hungary);
	}

	private static void deleteHungary(Country country) {
		countryCreator.deleteCountry(country);
	}

	private static Country getCountry(String id) {
		return countryCreator.findCountry(id);
	}

	private static void createHungary() {
		countryCreator.create("HU", 1, "Magyarország");
	}

}