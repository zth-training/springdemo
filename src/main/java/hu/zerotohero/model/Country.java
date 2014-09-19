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
@Table(name = "countries")
public class Country implements Serializable {

	@Id
	@Basic(optional = false)
	@Column(name = "country_id")
	private String id;

	@Column(name = "country_name")
	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
	private List<Location> locations;

	@JoinColumn(name = "region_id")
	@ManyToOne(optional = false)
	private Region region;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

}
