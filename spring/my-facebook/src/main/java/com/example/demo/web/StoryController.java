package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Story;
import com.example.demo.repository.StoryRepository;


@Controller
@RequestMapping("/stories")
public class StoryController {

	@Autowired
	private StoryRepository storyRepository;

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody String addNewStory(@RequestParam String name, @RequestParam String body) {
		Story story = new Story();
		story.setName(name);
		story.setBody(body);
		storyRepository.save(story);
		return "New Story added";
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Story> getAll() {
		System.out.println("getting...");
		List<Story> stories = (List<Story>) storyRepository.findAll();
		System.out.println(stories.size());
		return stories;
	}

}
