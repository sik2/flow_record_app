package com.flowLab.flowRecord.domain.record.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/record")
public class recordController {

    @GetMapping("/list")
    public String list () {
        return "record/list";
    }
    @GetMapping("/create")
    public String create () {
        return "record/create";
    }
}
