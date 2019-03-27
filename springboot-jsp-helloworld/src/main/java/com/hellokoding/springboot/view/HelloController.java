package com.hellokoding.springboot.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping({"/", "/hello"})
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
    	List<String> images = new ArrayList<>();
    	images.add("01");
    	images.add("02");
    	images.add("03");
    	images.add("04");
    	images.add("05");
        model.addAttribute("name", name);
        model.addAttribute("images", images);
        return "hello1";
    }
}
