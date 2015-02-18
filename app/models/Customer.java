package models;

import javax.persistence.*;
import play.db.ebean.Model;
import java.util.*;
import play.data.validation.Constraints;

@Entity
@Table(name="gcm")
public class Customer extends Model{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	
	@Constraints.Required
	public String custName;
	public String email;
	public String address;
	public String BVN;
	public Date DOB;
	public String phone;
}
