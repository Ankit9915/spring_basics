package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("desc","In Australia");
		
		
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {
		m.addAttribute("Header", "T20WORDCUP WATCH PARTY");
		return "contact";
	}

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
			System.out.println(user);
			
			if(user.getUserName().isBlank()) {
				return "redirect:/contact"; 
			}
			
			
			
			int createdUser = this.userService.createUser(user);
			model.addAttribute("msg", "user created with id"+createdUser);
			//model.addAttribute("user", user);
			
		
		return "success";

	}
}


//REQUEST PARAM
/*@RequestParam("email") String userEmail,
@RequestParam("userName") String userName,
@RequestParam("userPassword") String uPassword, Model model) {

User user =new User();
user.setEmail(userEmail);
user.setUserName(userName);
user.setUserPassword(uPassword);

System.out.println(user);

//process
//model.addAttribute("email", userEmail);
//model.addAttribute("userName", userName);
//model.addAttribute("userPassword",uPassword);
model.addAttribute("user", user);*/