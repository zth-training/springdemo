package hu.zerotohero;

import hu.zerotohero.dao.CountryDaoInterface;
import hu.zerotohero.model.Country;
import hu.zerotohero.model.Region;

/**
 * @author Adam Saghy <adam.saghy@webvalto.hu>
 */
public class CountryCreator {

	//CountryDaoInterface lesz a típusa, hogy biztosítsuk a függetlenséget. Így bármelyik CountryDao implementációt tudja majd kezelni.
	CountryDaoInterface countryDao;

	//Az application-context.xml-ben azt adtuk meg, hogy a konstruktoba paraméterként fogjuk átadni neki a countryDao-t.
	public CountryCreator(CountryDaoInterface countryDao) {
		this.countryDao = countryDao;
	}

	public Country create(String id, Integer regionId, String name) {
		Country country = new Country();
		country.setId("HU");
		Region region = new Region();
		region.setId(1);
		country.setRegion(region);
		country.setName("Magyarország");

		countryDao.saveCountry(country);

		return country;
	}

	public void deleteCountry(Country country) {
		countryDao.deleteCountry(country);
	}

	public Country findCountry(String id) {
		return countryDao.findCountry(id);
	}
}
