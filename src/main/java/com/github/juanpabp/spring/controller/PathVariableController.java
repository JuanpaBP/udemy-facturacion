package com.github.juanpabp.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class PathVariableController {


    @GetMapping("/")
    public String Index(Model model)
    {
        model.addAttribute("title", "PathVariable Routing");
        return "variables/index";
    }

    @GetMapping("/string/{text}")
    public String Variables(@PathVariable String text, Model model)
    {
        model.addAttribute("title", "PathVariable Example");
        model.addAttribute("text", text);
        return "variables/view";
    }

    @GetMapping("/string/{text}/{number}")
    public String Variables2(@PathVariable String text, @PathVariable int number, Model model)
    {
        model.addAttribute("title", "PathVariable Example");
        model.addAttribute("text", text);
        model.addAttribute("number", number);
        return "variables/view";
    }


}
