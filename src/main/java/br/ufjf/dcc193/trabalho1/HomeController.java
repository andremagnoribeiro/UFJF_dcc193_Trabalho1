package br.ufjf.dcc193.trabalho1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




/**
 * HomeController
 */
@Controller
public class HomeController {
    @RequestMapping("index.html")
    public String home() {
        return "/WEB-INF/home.jsp";
    }
    
    
}