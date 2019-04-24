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
    @Autowired
    AtividadesRepository repAtividades;
    @Autowired
    MembroRepository repMembro;

    @RequestMapping("index.html")
    ModelAndView home(Sede s){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        mv.addObject("sede", s);
        return mv;
    }

    @RequestMapping("sedeForm.html")
    String form(){
        return "sedeFormulario";
    }


    @RequestMapping("")
    String home1(){
        return "home";
    }

    @RequestMapping("sedeList.html")
    ModelAndView sedes() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedeList");
        List<Sede> sed = repSede.findAll();
        mv.addObject("sedes", sed);
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

    @RequestMapping("sedeEditar.html")//como passa o parametro da sede do jsp para a home controller
    ModelAndView sedeEditar(Sede s){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedeEditar");
        repSede.save(s);
        mv.addObject("sede",s);
        return mv;
    }

    @RequestMapping("sedeExcluir.html")
    ModelAndView sedeExcluir(Long idsede){
        repSede.deleteById(idsede);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedeList");
        List<Sede> sed = repSede.findAll();
        mv.addObject("sedes", sed);
        return mv;
    }

    @RequestMapping("aForm.html")
    ModelAndView aForm(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aFormulario");
        List<Sede> sed = repSede.findAll();
        mv.addObject("sedes", sed);
        return mv;
    }

    @RequestMapping("mForm.html")
    String mForm(){
        return "mForm";
    }


    @RequestMapping("aList.html")
    ModelAndView aList() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aList");
        List<Atividades> ativ = repAtividades.findAll();
        mv.addObject("atividades", ativ);
        return mv;
    }

    @RequestMapping("aNovo.html")
    ModelAndView aNovo(Atividades a){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aNovo");
        repAtividades.save(a);
        mv.addObject("atividade",a);
        return mv;
    }


    @RequestMapping("mNovo.html")
    ModelAndView mNovo(Membro m){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("mNovo");
        repMembro.save(m);
        mv.addObject("membro",m);
        return mv;
    }

    @RequestMapping("mList.html")
    ModelAndView mList() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("mList");
        List<Membro> mems = repMembro.findAll();
        mv.addObject("membros", mems);
        return mv;
    }

    @RequestMapping("aEditar.html")//como passa o parametro da sede do jsp para a home controller
    ModelAndView aEditar(Atividades a){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aEditar");
        repAtividades.save(a);
        mv.addObject("sede",a);
        return mv;
    }

    @RequestMapping("aExcluir.html")
    String aExcluir(Atividades a){
        repAtividades.deleteById(a.getId());
        return "aList";
    }

    @RequestMapping("listagemSomatorio.html")//como passa o parametro da sede do jsp para a home controller
    ModelAndView listagemSomatorio(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("somaAtividades");
        List<Sede> sed = repSede.findAll();
        mv.addObject("sedes", sed);
        return mv;
    }



    

    
}