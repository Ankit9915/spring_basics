package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/user/{userId}")
	public String  getUserDetail(@PathVariable("userId") int userId) {
		System.out.println(userId);
		
		return" home";
	}
	
	@RequestMapping("/home")
	public String home() {
		
		
		
		System.out.println("Showing home page");
		String str= null;
		System.out.println(str.length());
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		String url="https://www.google.com/search?q="+query;
		
		
		RedirectView rv = new RedirectView();
		rv.setUrl(url);
		if(query.isBlank()) {
			System.out.println("Fill the search box");
			return new RedirectView("home");
		}
		
		
		
		
		return rv;
	}

	
	//handling Exception in our spring mvc
 	
	/*@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
	public String exceptionHandlerNull(Model m) {
		m.addAttribute("msg","null pointer exception");
		
		
		return "null_page";
	}
	@ExceptionHandler( value=Exception.class)
	public String exceptionHandlerGeneric(Model m) {
		m.addAttribute("msg"," Exception has occured");
		
		return "null_page";

}*/
}