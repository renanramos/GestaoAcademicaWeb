package br.com.devmedia.gestaoacademicaweb.control;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.devmedia.gestaoacademicaweb.pojo.Docente;
import br.com.devmedia.gestaoacademicaweb.service.DocenteService;

@Controller
public class DocenteController {

	@Resource(name="docenteService")
	private DocenteService docenteService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {		
		return "index";
	}
	
	@RequestMapping("/home")
	public String inicial(){
		return "index";
	}

//Configurações referentes a Docentes ---------------------------------------------	
	@RequestMapping("/listaDocentes")
	public String listarDocentes(Map<String, Object> map){
			map.put("docente", new Docente());
			map.put("docenteList", docenteService.listarDocentes());		
		return "docentes/listar_docente";
	}
	
	@RequestMapping("/form")
	public String form(Map<String, Object> map){
			map.put("docente", new Docente());
		return "docentes/inserir_docente_form";
	}
	
	@RequestMapping(value="/adicionar", method=RequestMethod.POST)
	public String adicionarDocente(@ModelAttribute("docente") Docente docente, ModelMap model, HttpServletRequest request){		
			model.addAttribute("nome", docente.getNome());
			model.addAttribute("matricula", docente.getMatricula());
			model.addAttribute("titulacao", docente.getTitulacao());
			docenteService.adicionarDocente(docente);
		return "redirect:/listaDocentes";
	}
	
	@RequestMapping(value="/update/{docenteId}", method=RequestMethod.GET)
	public ModelAndView updateForm(@PathVariable("docenteId") int id){			
			Docente docente = docenteService.docenteById(id);
		return new ModelAndView("atualizar_docente_form","docente",docente);
	}
	
	@RequestMapping(value="/atualizar", method=RequestMethod.PUT)
	public String atualizarDocente(final Docente docente){
			docenteService.atualizaDocente(docente);
		return "redirect:/listaDocentes";
	}
	
	@RequestMapping("/remover/{docenteId}")
	public String removerDocente(@PathVariable("docenteId") int id){
			docenteService.removerDocente(id);
		return "redirect:/listaDocentes";
	}

//Configurações referentes a Alunos ---------------------------------------------	
	
	
	
}
