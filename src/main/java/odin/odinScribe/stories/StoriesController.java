package odin.odinScribe.stories;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoriesController {
	
	@Autowired
	private StoriesServices storiesservices;
	
	
	@GetMapping("/stories")
	public String stories(@RequestParam(required=false, defaultValue="") String name, Model model) {
		return "stories";
	}
	
	@GetMapping("/stories/getSample")
	public Story story(@RequestParam(required=false, defaultValue="") String name, Model model) {
		return storiesservices.generateSampleStory();
	}
	/*
	@GetMapping("/stories/getSample")
	public Story story(@RequestParam(required=false, defaultValue="")) {
		return null;
	}
	*/
}
