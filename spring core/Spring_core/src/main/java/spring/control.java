package spring;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class control {
	@RequestMapping("/home")
		public String hello() {
			System.out.println("aa");
			return "home";
		}
	
}
