package odin.odinScribe.stories;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class storiesController {
	@GetMapping("/stories")
	public String stories(@RequestParam(required=false, defaultValue="") String name, Model model) {
		return "stories";
	}
}
