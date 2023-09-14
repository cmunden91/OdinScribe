package odin.odinScribe.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {
	@RequestMapping("/")
	public String home() {
		return "Hello World";
	}
}
