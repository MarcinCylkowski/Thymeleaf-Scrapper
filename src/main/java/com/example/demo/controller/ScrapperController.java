package com.example.demo.controller;

import com.example.demo.model.ScrapperHandler;
import com.example.demo.service.ScrapperService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

import static com.example.demo.model.StatusEnum.UNDEFINED;

@CrossOrigin
@Controller
public class ScrapperController {

    private ScrapperService scrapperService;

    public ScrapperController(ScrapperService scrapperService) {
        this.scrapperService = scrapperService;
    }

    @GetMapping("/index")
    public String pageLoader(Model model){

        model.addAttribute("list", scrapperService.addToList());
        return "index";
    }
}
