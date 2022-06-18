package mscpcr.project.MSCPCR.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="district_m")
public class District {
	@Id 
	@Column(name ="district_code", nullable=false, unique=true, updatable = false)
	private Integer district_code;
	
	@Column(name ="district_name", nullable=false, unique=true, updatable = false)
	private String district_name;
	

	public Integer getDistrict_code() {
		return district_code;
	}

	public void setDistrict_code(Integer district_code) {
		this.district_code = district_code;
	}

	public String getDistrict_name() {
		return district_name;
	}

	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}

	@Override
	public String toString() {
		return "District [district_code=" + district_code + ", district_name=" + district_name + "]";
	}
	

	
}
