package odin.odinScribe.home;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class homeController {
	@GetMapping("/")
	public String home(@RequestParam(required=false, defaultValue="") String name, Model model) {
		return "home";
	}
}
