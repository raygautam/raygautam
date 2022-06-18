package mscpcr.project.MSCPCR.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mscpcr.project.MSCPCR.dto.PoliceDistrictDTO;
import mscpcr.project.MSCPCR.entities.District;
import mscpcr.project.MSCPCR.entities.PoliceStation;
import mscpcr.project.MSCPCR.service.MasterServiceImplement;

@RestController
public class MasterController {
	
	@Autowired
	private MasterServiceImplement serviceImplement;
	
	//District
	@PostMapping("/insertDistrict")
	public District insertDistrict(@RequestBody District district) {
		System.out.println("c :"+district);
		District d=serviceImplement.insertDistrict(district);
		System.out.println("c: "+d);
		return d;
	}
	
	@GetMapping("/getDistrict")
	public List<District> getDistrict(){
		List<District> d=serviceImplement.getDistricts();
		return d;
	}
	
	//PoliceStation
	@PostMapping("/insertPoliceStation")
	public PoliceStation insertPoliceStation(@RequestBody PoliceStation policeStation) {
		System.out.println("c :"+policeStation);
		PoliceStation d=serviceImplement.insertPoliceStation(policeStation);
		System.out.println("c: "+d);
		return d;
	}
	
//	@GetMapping("/getPoliceStation")
//	public List<PoliceStation> getPoliceStation(){
//		List<PoliceStation> d=serviceImplement.getPoliceStations();
//		return d;
//	}
	
	@GetMapping("/getPoliceStation")
	public List<PoliceDistrictDTO> getPoliceStation(){
//		List<PoliceStation> d=;
		return serviceImplement.getPoliceStations();
	}
}
