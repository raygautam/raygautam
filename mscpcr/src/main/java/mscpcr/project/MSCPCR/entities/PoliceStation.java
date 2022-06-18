package mscpcr.project.MSCPCR.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="police_station_m")
public class PoliceStation{
	@Id
	@Column(name ="police_code", nullable=false, unique=true, updatable = false)
	private Integer police_code;
	
	@Column(name ="policeStation_name", nullable=false, unique=true)
	private String policeStation_name;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn(name = "district_code", nullable = false)
	@JsonIgnore
	private District district_code; 


	public Integer getPolice_code() {
		return police_code;
	}

	public void setPolice_code(Integer police_code) {
		this.police_code = police_code;
	}
 
	public String getPoliceStation_name() {
		return policeStation_name;
	}

	public void setPoliceStation_name(String policeStation_name) {
		this.policeStation_name = policeStation_name;
	}

	public District getDistrict_code() {
		return district_code;
	}

	public void setDistrict_code(District district_code) {
		this.district_code = district_code;
	}

	@Override
	public String toString() {
		return "PoliceStation [police_code=" + police_code + ", policeStation_name=" + policeStation_name+ ", district_code=" + district_code + "]";
	}
	
	

	
}
