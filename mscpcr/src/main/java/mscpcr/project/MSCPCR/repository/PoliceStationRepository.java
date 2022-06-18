package mscpcr.project.MSCPCR.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mscpcr.project.MSCPCR.entities.PoliceStation;

@Repository
public interface PoliceStationRepository extends JpaRepository<PoliceStation, Integer>{
	 
//	@Query("Select p.police_code, p.policeStation_name, p.district_code, p.district_name FROM PoliceStation p JOIN p.District d")
	@Query(value = "select p.police_code, p.police_station_name, d.district_code, d.district_name from police_station_m p Inner Join district_m d on p.district_code=d.district_code", nativeQuery=true)
	public List<PoliceStation> getPoliceStations();

}
