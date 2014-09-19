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
@Table(name = "locations")
public class Location implements Serializable {

	@Id
	@Basic(optional = false)
	@Column(name = "location_id")
	private Integer id;

	@Column(name = "street_address")
	private String streetAddress;

	@Column(name = "postal_code")
	private String postalCode;

	@Basic(optional = false)
	@Column(name = "city")
	private String city;

	@Column(name = "state_province")
	private String stateProvince;

	@JoinColumn(name = "country_id")
	@ManyToOne(optional = false)
	private Country country;

	@OneToMany(mappedBy = "location")
	private List<Department> departments;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

}
