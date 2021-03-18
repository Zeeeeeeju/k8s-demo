package zj.k8s.app.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zj.k8s.app.demo.entity.Alive;
import zj.k8s.app.demo.entity.User;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping
    public List<User> get() {
        return mongoTemplate.findAll(User.class);
    }

    @PostMapping("/add")
    void add() {
        User user = new User();
        user.setId(String.valueOf(System.currentTimeMillis()));
        user.setName("Zzeju");

        mongoTemplate.insert(user);
    }

    @GetMapping("/alive")
    public String isAlive() throws Exception {
        System.out.println(System.currentTimeMillis() + "Check alive");
        if (!Alive.alive) {
            throw new Exception("System error");
        }
        return "OK";
    }

    @GetMapping("/modify")
    public String modifyAlive() {
        Alive.alive = !Alive.alive;
        return "OK";
    }

}
