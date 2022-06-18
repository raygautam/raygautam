package mscpcr.project.MSCPCR.dto;

//@Data
public class PoliceDistrictDTO {
	private Integer police_code;
	private String policeStation_name;
//	private Integer district_code;
	private String district_name;
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
//	public Integer getDistrict_code() {
//		return district_code;
//	}
//	public void setDistrict_code(Integer district_code) {
//		this.district_code = district_code;
//	}
	public String getDistrict_name() {
		return district_name;
	}
	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}
	@Override
	public String toString() {
		return "PoliceDistrictDTO [police_code=" + police_code + ", policeStation_name=" + policeStation_name
				+ ",  district_name=" + district_name + "]";
	}
	
//	district_code=" + district_code + ",
	
}
