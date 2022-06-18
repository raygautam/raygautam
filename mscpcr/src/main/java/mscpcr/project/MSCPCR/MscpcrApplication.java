package mscpcr.project.MSCPCR;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//implements CommandLineRunner
@SpringBootApplication
public class MscpcrApplication {

	public static void main(String[] args) {
		SpringApplication.run(MscpcrApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
//	@Autowired
//	private DistrictRepository districtRepository;
//	
//	@Autowired
//	private PoliceStationRepository policeStationRepository;
	
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		District district= new District();
//		district.setDistrict_code(1);
//		district.setDistrict_name("South Garo Hill");
//		districtRepository.save(district);
//		
//		PoliceStation policeStation= new PoliceStation();
//		policeStation.setPolice_code(1);
//		policeStation.setPoliceStation_name("Police Station 3");
//		policeStation.setDistrict_code(district);
//		policeStationRepository.save(policeStation);
//	}

}
