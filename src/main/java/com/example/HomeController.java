package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("classlist")
    public String classlist(Model model){
        model.addAttribute("title", "2학년 교과목 리스트");

        List<String> list = new ArrayList<String>();
        list.add("실전프로젝트");
        list.add("컴퓨터비전");
        model.addAttribute("classlist", list);
        return "board/list";
    }
}
