//package mscpcr.project.MSCPCR.entities;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import org.hibernate.annotations.OnDelete;
//import org.hibernate.annotations.OnDeleteAction;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import lombok.Data;
//
//@Entity
//@Data
//@Table(name="court_name_m")
//public class CourtName {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name ="court_Id", nullable=false, unique=true)
//	private String court_Id;
//	
//	@Column(name ="court_name", nullable=false, unique=true)
//	private String court_name;
//	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "district_code", nullable = false)
//	@OnDelete(action = OnDeleteAction.CASCADE)
//	@JsonIgnore
//	private District district;
//}
