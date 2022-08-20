package pl.watiaty.testeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import pl.watiaty.testeng.entity.Level;
import pl.watiaty.testeng.entity.Topic;
import pl.watiaty.testeng.service.SubTopicServiceImpl;
import pl.watiaty.testeng.service.TestServiceImpl;
import pl.watiaty.testeng.service.TopicServiceImpl;

import java.util.Arrays;
import java.util.List;

@Controller
@EnableWebMvc
@RequestMapping("/test")
public class TestController {
    private final TestServiceImpl testService;
    private final TopicServiceImpl topicService;
    private final SubTopicServiceImpl subTopicService;


    public TestController(TestServiceImpl testService, TopicServiceImpl topicService, SubTopicServiceImpl subTopicService) {
        this.testService = testService;
        this.topicService = topicService;
        this.subTopicService = subTopicService;
    }

    @GetMapping("")
    public String findAll(Model model) {
        model.addAttribute("tests", testService.findAll());
        model.addAttribute("topics", topicService.findAll());
        model.addAttribute("subtopics", subTopicService.findByTopic(1L));
        model.addAttribute("levels", Level.values());

        System.out.println(Arrays.stream(Level.values()).findAny().get().ordinal());
        return "test";
    }

    public List<Topic> getTopicsByLevel(Long id) {
        return topicService.findByLevel(id);
    }
}
