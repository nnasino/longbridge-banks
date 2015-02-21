package controllers;

import models.User;
import models.Customer;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.productmenus.*;
import play.data.Form;


public class ProductMenus extends Controller {
	private static final Form<User> userForm = Form.form(User.class);
	private static final Form<Customer> customerForm = Form.form(Customer.class);
	public static Result tm(){
		return ok(tm.render("torti"));
	}
	
	public static Result cm(){
		return ok(cm.render(customerForm, "torti"));
	}
	
	public static Result um(){
		return ok(um.render(userForm));
	}
	
	public static Result td(){
		return ok(td.render(null));
	}
}
