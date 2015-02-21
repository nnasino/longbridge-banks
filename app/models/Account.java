package models;

import javax.persistence.*;

import play.db.ebean.Model;
import play.data.validation.Constraints;;

@Entity
@Table(name="gam")
public class Account extends Model{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	
	@Column(unique=true)
	public String foracid;
	
	public Customer customer;

	@Constraints.Required
	public String schmType;
	public String schmCode;
	
	public String freezeStatus;
	public String dateOfFreeze;
	public String closeStatus;
	public String dateOfClosure;
	public String dateOfOpening;
	public String effAcctBalance;
	public String acctBalance;	
}
