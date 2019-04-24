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

        repSede.save(new Sede("Sede1", "MG", "Vitoria", "Trem", "(32)3234-3434", "sede1@gmail.com"));
        repSede.save(new Sede("Sede2", "MG", "Minas Gerais", "Trem2", "(32)3333-3434", "sede2@gmail.com"));
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

    @RequestMapping("sedeExcluir.html")
    ModelAndView sedeExcluir(Long sedeId){
        repSede.deleteById(sedeId);
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
    ModelAndView mForm(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("mForm");
        List<Sede> sed = repSede.findAll();
        mv.addObject("sedes", sed);
        return mv;
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

    

    @RequestMapping("aExcluir.html")
    ModelAndView aExcluir(Long atividadeId){
        repAtividades.deleteById(atividadeId);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aList");
        List<Atividades> ativ = repAtividades.findAll();
        mv.addObject("atividades", ativ);
        return mv;  
    }

    @RequestMapping("mExcluir.html")
    ModelAndView mExcluir(Long membroId){
        repMembro.deleteById(membroId);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("mList");
        List<Membro> mems = repMembro.findAll();
        mv.addObject("membros", mems);
        return mv;
      
    }

    @RequestMapping("somatorio2.html")//como passa o parametro da sede do jsp para a home controller
    ModelAndView listagemSomatorio(Long sedeId){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("somatorio2");
        List<Atividades> atis= repAtividades.findAll();
        int soma=0;
        for (Atividades a: atis) {
            if(a.getSedeId().equals(sedeId.toString())){
                soma=soma+Integer.parseInt(a.getHorasAssistencial())+
                Integer.parseInt(a.getHorasExecutiva())+
                Integer.parseInt(a.getHorasFinanceira())+
                Integer.parseInt(a.getHorasJuridica());
            }
        }
        mv.addObject("sede", repSede.getOne(sedeId));
        mv.addObject("somatorio", soma);

        return mv;
    }

    @RequestMapping("somatorio.html")//como passa o parametro da sede do jsp para a home controller
    ModelAndView listagemSomatorio2(String sedeId){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("somaAtividades");
        List<Sede> sed = repSede.findAll();
        mv.addObject("sedes", sed);
        return mv;
    }


    @RequestMapping("aEditar.html")//como passa o parametro da sede do jsp para a home controller
    ModelAndView aEditar(Long atividadeId){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aEditar");
        mv.addObject("atividade",   repAtividades.getOne(atividadeId)   );
        return mv;
    }


    @RequestMapping("sedeEditar.html")//como passa o parametro da sede do jsp para a home controller
    ModelAndView sedeEditar(Long sedeId){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedeEditar");
        mv.addObject("sede",   repSede.getOne(sedeId)   );
        return mv;
    }

    @RequestMapping("mEditar.html")//como passa o parametro da sede do jsp para a home controller
    ModelAndView mEditar(Long membroId){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("mEditar");
        mv.addObject("membro",   repMembro.getOne(membroId)   );
        return mv;
    }
    
    
    @RequestMapping("sedeSalvar.html")//como passa o parametro da sede do jsp para a home controller
    ModelAndView sedeSalvar(Sede s){
        ModelAndView mv = new ModelAndView();
        repSede.save(s);
        mv.setViewName("sedeList");
        List<Sede> sed = repSede.findAll();
        mv.addObject("sedes", sed);
        return mv;
    }

    @RequestMapping("aSalvar.html")//como passa o parametro da sede do jsp para a home controller
    ModelAndView aSalvar(Atividades a){
        ModelAndView mv = new ModelAndView();
        repAtividades.save(a);
        mv.setViewName("aList");
        List<Atividades> ativ = repAtividades.findAll();
        mv.addObject("atividades", ativ);
        return mv;
    }

    @RequestMapping("mSalvar.html")//como passa o parametro da sede do jsp para a home controller
    ModelAndView mSalvar(Membro m){
        ModelAndView mv = new ModelAndView();
        repMembro.save(m);
        mv.setViewName("mList");
        List<Membro> mems = repMembro.findAll();
        mv.addObject("membros", mems);
        return mv;
    }
    


    

    
}