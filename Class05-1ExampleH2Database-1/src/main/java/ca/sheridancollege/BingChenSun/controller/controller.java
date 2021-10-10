package ca.sheridancollege.BingChenSun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.BingChenSun.controller.bean.User;
import ca.sheridancollege.BingChenSun.dao.UserDataAccess;

@Controller
public class controller {
	
	@Autowired
		private UserDataAccess da;
	
	
	@PostMapping("/userInput")
		public String addCustomer(Model model,@ModelAttribute User user){
		 long numberOfRows = da.addUser(user);	 
		 return "index";
								 }
								 
	@GetMapping("/CustomerEmailList")
	public String viewCustomerList(Model model) {
		List<User> userList = da.selectUsers();
		model.addAttribute("User", userList);
		return "userEmailList";
	}
}
