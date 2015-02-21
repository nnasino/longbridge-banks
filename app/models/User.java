package models;

import play.db.ebean.Model;
import play.data.validation.Constraints;
import javax.persistence.*;

@Entity
@Table(name="gum",
uniqueConstraints = @UniqueConstraint(columnNames = "user_name"))
public class User extends Model{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	
	@Column(unique=true)
	public String userName;
	
	@Constraints.Required
	public String roleId;
	public String password;
}
