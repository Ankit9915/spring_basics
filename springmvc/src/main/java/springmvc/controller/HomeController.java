package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String home(Model model) {
		
		System.out.println("this is home url");
		model.addAttribute("name", "ankit");
		model.addAttribute("id",786);
		
		List <String> friends=new ArrayList<String>();
		friends.add("vimal");
		friends.add("mishra");
		friends.add("suma");
		
		model.addAttribute("f",friends);
		
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about url");
		
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help page");
		//creating modelview object
				ModelAndView modelandview =new ModelAndView();
				//seting data
				modelandview.addObject("name","Ankit");
				//setting view name
				modelandview.setViewName("help");
				
				//marks
				List<Integer> list=new ArrayList<Integer>();
				list.add(90);
				list.add(87);
				list.add(56);
				list.add(34);
				
				modelandview.addObject("marks",list);
				return modelandview;
		
		
	}

}