package com.github.juanpabp.spring.controller;

import com.github.juanpabp.spring.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {

    @Value("${text.indexcontroller.index.title}")
    private String indexText;

    @Value("${text.indexcontroller.profile.title}")
    private String profileText;

    @Value("${text.indexcontroller.list.title}")
    private String listText;

    @GetMapping({"/index","/", "/home"})
    public String index(Model model)
    {
        model.addAttribute("title", indexText);
        return "index";
    }

    @RequestMapping("/profile")
    public String profile(Model model)
    {
        User user = new User();
        user.setLastname("Paulich");
        user.setName("Juan");
        user.setEmail("juanpaulich2020@gmail.com");
        model.addAttribute("user", user);
        model.addAttribute("title", profileText.concat(user.getLastname()));
        return "profile";
    }

    @GetMapping("/list")
    public String list(Model model)
    {
        User user = new User();
        user.setLastname("Paulich");
        user.setName("Juan");
        user.setEmail("juanpaulich2020@gmail.com");
        User user2 = new User();
        user2.setLastname("Gelati");
        user2.setName("Melania Ailen");
        user2.setEmail("melaniaileng@gmail.com");
        User user3 = new User();
        user3.setLastname("Pizarro Hepp");
        user3.setName("Hernan");
        user3.setEmail("hernan.hepp@gmail.com");
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);
        model.addAttribute("title", listText);
        return "list";
    }
}
