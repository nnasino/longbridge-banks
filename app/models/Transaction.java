package models;

import java.util.Date;

import play.db.ebean.Model;

import javax.persistence.*;

import play.data.validation.Validation;
import play.data.validation.Constraints;

@Entity
@Table(name="gtd")
public class Transaction extends Model{
	@Id
	public Long id;
	
	@Constraints.Required
	public String partTranType;
	public Date valueDate;
	public Double amount;
	public String currency;
	public String tranDetails;
	public Account account;
}
