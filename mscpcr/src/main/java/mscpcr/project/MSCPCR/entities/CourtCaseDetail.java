//package mscpcr.project.MSCPCR.entities;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
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
//@Table(name="court_case_detail")
//public class CourtCaseDetail {
//	@Id
//	@Column(name="courtCase_Id", nullable=false, unique=true)
//	private String courtCase_Id;
//	
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "police_FIR_no", nullable = false)
//	@OnDelete(action = OnDeleteAction.CASCADE)
//	@JsonIgnore
//	private DCPUwithPolice police_FIR_no;
//	
//	@Column(name="state_vs", nullable=false, unique=false) //accused name
//	private String state_vs;
//	
//	@Column(name="caseNo_with_section_of_law", nullable=false, unique=false)
//	private String caseNo_with_section_of_law;
//	
//	@Temporal(TemporalType.DATE)
//	@Column(name ="hearing_date", nullable=false, unique=false)	// updated every time.
//	private Date hearing_date;
//	
//	@Column(name="hearing_status", nullable=false, unique=false)
//	private String hearing_status;
//
//	@Column(name="victim_compensation_awarded", nullable=false, unique=false)	//(I/F/N) I=half paid, F=full paid, N=not paid
//	private Character victim_compensation_awarded;
//	
//	@Temporal(TemporalType.DATE)
//	@Column(name ="date_of_awarded", nullable=false, unique=false)	//not paid it will contain default value
//	private Date date_of_awarded;
//	
//	@Column(name="amount_awarded", nullable=false, unique=false)	//not paid it will contain default value
//	private Integer amount_awarded;
//	
//	@Temporal(TemporalType.DATE)
//	@Column(name ="caseEntry_date", nullable=false, unique=false)	// updated every time.
//	private Date caseEntry_date;
//	
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "court_Id", nullable = false)
//	@OnDelete(action = OnDeleteAction.CASCADE)
//	@JsonIgnore
//	private CourtName court_Id;
//	
//	@Column(name ="courtCase_remark", nullable=false)
//	private String courtCase_remark;
//}
