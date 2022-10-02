package pl.watiaty.testeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/api/tests", method = RequestMethod.GET)
    public List<Test> findAll() {
        return testService.findAll();
    }

    @RequestMapping(value = "/api/topics", method = RequestMethod.GET)
    public List<Topic> findAllTopics() {
        return topicService.findAll();
    }

    @RequestMapping(value = "/api/subtopics", method = RequestMethod.GET)
    public List<Subtopic> findAllSubTopics() {
        return subTopicService.findAll();
    }

    @RequestMapping(value = "/api/levels", method = RequestMethod.GET)
    public List<Level> findAllLevel() {
        return Arrays.stream(Level.values()).toList();
    }

    @RequestMapping(value = "/api/tests/level/{id}", method = RequestMethod.GET)
    public List<Topic> getTopicsByLevel(Long id) {
        return topicService.findByLevel(id);
    }
}
