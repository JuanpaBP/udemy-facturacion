package com.github.juanpabp.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class RequestParamController {

    @GetMapping("/")
    public String Index()
    {
        return "params/index";
    }

    @GetMapping("/string")
    public String Param(@RequestParam(defaultValue = "This is a default value") String text, Model model)
    {
        model.addAttribute("title", "RequestParam example");
        model.addAttribute("text", "The text sent as a param is: ".concat(text));
        return "params/view";
    }

    @GetMapping("/mix-params")
    public String MixParam(@RequestParam(defaultValue = "This is a default value") String text, @RequestParam(defaultValue = "3") int number, Model model)
    {
        model.addAttribute("title", "RequestParam example");
        model.addAttribute("text", "The text sent as a param is: '".concat(text).concat("' and the number is '").concat(Integer.toString(number)).concat("'"));
        return "params/view";
    }


}
