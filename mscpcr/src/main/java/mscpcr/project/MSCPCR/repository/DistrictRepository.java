package mscpcr.project.MSCPCR.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mscpcr.project.MSCPCR.entities.District;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {
}
