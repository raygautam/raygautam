//package mscpcr.project.MSCPCR.entities;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.validation.constraints.Email;
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
//@Table(name="user_detail")
//public class UserDetail {
//	
//	@Id
//	@Column(name="user_id", nullable=false, unique=true)
//	private Long user_id;
//	
//	@Column(name="user_name", nullable=false, unique=true)
//	private String name;
//	
//	@Email
//	@Column(name="user_email", nullable=false, unique=true)
//	private String email;
//	
//	
//	@Column(name="contact_no", nullable=false, unique=true)
//	private Integer contact_no;
//	
//	@Column(name="password", nullable=false, unique=false)
//	private String password; // store encoded password
//	
//	@Column(name="status", nullable=false, unique=false)
//	private Character status;  // default Y mean user is active, N mean user is deactivated
//	
//	@OneToOne
//	@JoinColumn(name="role_id")
//	@OnDelete(action = OnDeleteAction.CASCADE)
//	@JsonIgnore
//	private Role role;
//	
//	@Temporal(TemporalType.DATE)
//	@Column(name="created_date", nullable=false, unique=false)
//	private Date created_date;   // auto generated
//	
//}
