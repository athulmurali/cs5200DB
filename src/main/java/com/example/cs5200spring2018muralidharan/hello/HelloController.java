package com.example.cs5200spring2018muralidharan.hello;

import com.example.cs5200spring2018muralidharan.controllers.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    HelloRepository helloRepository;

    @RequestMapping("/api/hello/insert")
    public HelloObject insertHelloObject() {
        HelloObject obj = new HelloObject("Hello Jose Annunziato!");
        helloRepository.save(obj);
        return obj;
    }

    @RequestMapping("/api/hello/string")
    public String sayHello() {
        return "Hello Athul Muralidharan here !";
    }

    @RequestMapping("/api/hello/object")
    public HelloObject sayHelloObject() {
        HelloObject obj = new HelloObject("Hello Athul Muralidharan");
        return obj;
    }

    @RequestMapping("/api/hello/insert/{msg}")
    public HelloObject insertMessage(@PathVariable("msg") String message) {
        HelloObject obj = new HelloObject(message);
        helloRepository.save(obj);
        return obj;
    }

    @RequestMapping("/api/hello/select/all")
    public List<HelloObject> selectAllHelloObjects() {
        System.out.println(".................");

        List<HelloObject> hellos =
                helloRepository.findAll();
        return hellos;
    }


}
