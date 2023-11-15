package odin.odinScribe.stories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoriesServices {
	@Autowired
	private StoriesRepo storiesRepo;
	
	
	public List<Story> getAllStories() {
		List<Story> stories = new ArrayList<>();
		storiesRepo.findAll().forEach(stories::add);;
		return stories;
	}
	
	public void addStory(Story story) {
		storiesRepo.save(story);
	}
	
	public void removeStory(Story story) {
		storiesRepo.delete(story);
	}
	
	public Story generateSampleStory() {
		List<String> tags = new ArrayList<>();
		tags.add("SampleTag1");
		tags.add("SampleTag2");
		Story story = new Story("S1", "Sample Story", "This is a sample story to test API get Requests", tags, 
				"This is a sample of a potential story /n It can contain new lines and potentially more HTML information!");
		return story;
	}
}
