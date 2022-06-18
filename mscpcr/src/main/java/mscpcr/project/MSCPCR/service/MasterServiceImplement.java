package mscpcr.project.MSCPCR.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mscpcr.project.MSCPCR.dto.PoliceDistrictDTO;
import mscpcr.project.MSCPCR.entities.District;
import mscpcr.project.MSCPCR.entities.PoliceStation;
import mscpcr.project.MSCPCR.repository.DistrictRepository;
import mscpcr.project.MSCPCR.repository.PoliceStationRepository;

@Service
public class MasterServiceImplement implements MasterServiceInterface{
	
	@Autowired
	private DistrictRepository districtRepository;
	
	@Autowired
	private PoliceStationRepository policeStationRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	//District
	@Override
	public District insertDistrict(District district) {
		System.out.println("ServiceImplement : "+district);
		District d=districtRepository.save(district);
		System.out.println("ServiceImplement :"+district);
		return d;
	}

	@Override
	public List<District> getDistricts() {
		List<District> d=districtRepository.findAll();
		return d;
	}
	
	//PoliceStation
	@Override
	public PoliceStation insertPoliceStation(PoliceStation policeStation) {
		return policeStationRepository.save(policeStation);
	}

//	@Override
//	public List<PoliceStation> getPoliceStations() {
//		// TODO Auto-generated method stub
//		System.out.println(policeStationRepository.getPoliceStations());
//		return policeStationRepository.getPoliceStations();
//	}
	
	@Override
	public List<PoliceDistrictDTO> getPoliceStations() {
		return policeStationRepository.findAll()
				.stream()
				.map(this::policeDistrictDTO)
				.collect(Collectors.toList());
	}
	
	private PoliceDistrictDTO policeDistrictDTO(PoliceStation policeStation) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		PoliceDistrictDTO policeDistrictDTO=new PoliceDistrictDTO();
		policeDistrictDTO=modelMapper.map(policeStation, PoliceDistrictDTO.class);
		return policeDistrictDTO;
	}
	

}
