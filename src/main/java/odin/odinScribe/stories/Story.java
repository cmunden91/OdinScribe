package odin.odinScribe.stories;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Story {

	@Id
	private String id;
	private String name;
	private String description;
	private List<String> tags;
	private String content;
	
	public Story(String id, String name, String description, List<String> tags, String content) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.tags = tags;
		this.content = content;
	}
	
	public boolean hasTag(String tag) {
		return tags.contains(tag);
	}
	
	public boolean addTag(String tag) {
		if (tags.contains(tag) != true) {
			tags.add(tag);
		}
		return tags.contains(tag);
	}
	
	public boolean removeTag(String tag) {
		if (tags.contains(tag) == true) {
			tags.remove(tags.indexOf(tag));
		}
		return tags.contains(tag);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
	
}
