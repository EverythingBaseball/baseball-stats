package nl.romkema.baseball.statistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bbs")
public class PageController {

    @GetMapping
    public String home(Model model) {
        return "forward:/index.html";
    }
}
