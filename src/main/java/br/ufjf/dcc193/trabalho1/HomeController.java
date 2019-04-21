package br.ufjf.dcc193.trabalho1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;



/**
 * HomeController
 */
@Controller
public class HomeController {
    @Autowired
    SedeRepository repSede;

    @RequestMapping("index.html")
    ModelAndView home(Sede s){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        mv.addObject("sede", s);
        return mv;
    }

    @RequestMapping("form.html")
    String form(){
        return "sedeFormulario";
    }

    @RequestMapping("sedeList.html")
    ModelAndView sedes() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedeList");
        List<Sede> sedes = repSede.findAll();
        mv.addObject("sed", sedes);
        return mv;
    }

    @RequestMapping("sedeNova.html")
    ModelAndView novo(Sede s){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedeNova");
        repSede.save(s);
        mv.addObject("sede",s);
        return mv;
    }

    @RequestMapping("sedeEditar.html")
    ModelAndView sedeEditar(Sede s){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedeEditar");
        repSede.save(s);
        mv.addObject("sede",s);
        return mv;
    }

    @RequestMapping("sedeExcluir.html")
    String sedeExcluir(Sede s){
        repSede.deleteById(s.getId());
        return "sedeList";
    }

    
}