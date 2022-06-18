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
//import org.springframework.beans.factory.annotation.Value;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import lombok.Data;
//
//@Entity
//@Data
//@Table(name="dcpu_with_police")
//public class DCPUwithPolice {
//	@Id
//	@Column(name ="slno", nullable=false, unique=true)
//	private Long slno;
//	
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "complaint_no", nullable = false)
//	@OnDelete(action = OnDeleteAction.CASCADE)
//	@JsonIgnore
//	private DCPUComplaint complaint_no;
//	
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "send_by", nullable = false)
//	@OnDelete(action = OnDeleteAction.CASCADE)
//	@JsonIgnore
//	private UserDetail send_by;
//	
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "send_to", nullable = false)
//	@OnDelete(action = OnDeleteAction.CASCADE)
//	@JsonIgnore
//	private UserDetail send_to;
//
//	@Value("${some.key:NR}")
//	@Column(name ="status", nullable=false, unique=false)	// NR=not receive, R=receive default value=NR
//	private Character status;
//	
//	@Temporal(TemporalType.DATE)
//	@Column(name ="send_date", nullable=false, unique=false)
//	private Date send_date;
//	
//	@Value("${some.key:00-00-00}")
//	@Temporal(TemporalType.DATE)
//	@Column(name ="receive_date", nullable=false, unique=false) // default value=00-00-00
//	private Date receive_date;
//	
//	@Column(name ="message", nullable=true, unique=false)
//	private String message;
//
//}
