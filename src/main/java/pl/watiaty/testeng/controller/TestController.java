package pl.watiaty.testeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import pl.watiaty.testeng.entity.Level;
import pl.watiaty.testeng.entity.Subtopic;
import pl.watiaty.testeng.entity.Test;
import pl.watiaty.testeng.entity.Topic;
import pl.watiaty.testeng.service.SubTopicServiceImpl;
import pl.watiaty.testeng.service.TestServiceImpl;
import pl.watiaty.testeng.service.TopicServiceImpl;

import java.util.Arrays;
import java.util.List;

@Controller
@EnableWebMvc
public class TestController {
    private final TestServiceImpl testService;
    private final TopicServiceImpl topicService;
    private final SubTopicServiceImpl subTopicService;


    public TestController(TestServiceImpl testService, TopicServiceImpl topicService, SubTopicServiceImpl subTopicService) {
        this.testService = testService;
        this.topicService = topicService;
        this.subTopicService = subTopicService;
    }

    @GetMapping("test")
    public String getStartOptions(Model model) {
        model.addAttribute("topics", topicService.findAll());
        model.addAttribute("subtopics", subTopicService.findAll());
        model.addAttribute("levels", Arrays.stream(Level.values()).toList());
        return "test";
    }

    @PostMapping("test/start")
    public String getTests(@RequestParam(value = "subtopic") Long subtopic) {
        System.out.println(testService.findBySubtopicId(subtopic));
        return "test";
    }


}
