package hu.zerotohero.dao;

import hu.zerotohero.model.Country;
import hu.zerotohero.model.Region;

/**
 * @author Adam Saghy <adam.saghy@webvalto.hu>
 */

//Ezt fogjuk használni mindenhol, hogy biztosítsuk az üzleti logika függetlenségét az entitáskezelőktől
public interface CountryDaoInterface {
	void saveCountryWithRegion(Country country, Region region);

	void saveCountry(Country country);

	void deleteCountry(Country country);

	Country findCountry(String id);
}
