package hu.zerotohero.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * 
 * @author Attila Budai <attila.budai@zerotohero.hu>
 * 
 */
@Entity
@Table(name = "regions")
public class Region implements Serializable {

	@Id
	@Basic(optional = false)
	@Column(name = "region_id")
	private Integer id;

	@Column(name = "region_name")
	private String regionName;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "region")
	private List<Country> countries;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

}
