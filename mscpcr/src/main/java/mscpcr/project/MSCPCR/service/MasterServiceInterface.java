package mscpcr.project.MSCPCR.service;

import java.util.List;

import mscpcr.project.MSCPCR.dto.PoliceDistrictDTO;
import mscpcr.project.MSCPCR.entities.District;
import mscpcr.project.MSCPCR.entities.PoliceStation;

public interface MasterServiceInterface {
	
	//District
	public District insertDistrict(District district);
	public List<District> getDistricts();
	
	//PoliceStation
	public PoliceStation insertPoliceStation(PoliceStation policeStation);
//	public List<PoliceStation> getPoliceStations();
	public List<PoliceDistrictDTO> getPoliceStations();
}
