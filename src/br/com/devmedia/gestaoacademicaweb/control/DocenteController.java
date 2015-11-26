package br.com.devmedia.gestaoacademicaweb.control;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.devmedia.gestaoacademicaweb.model.Docentes;
import br.com.devmedia.gestaoacademicaweb.service.DocenteService;

@Controller
public class DocenteController {

	@Resource(name="docenteService")
	private DocenteService docenteService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {		
		return "index";
	}
		
	@RequestMapping("/listaDocentes")
	public String listarDocentes(Map<String, Object> map){
			map.put("docente", new Docentes());
			map.put("docenteList", docenteService.listarDocentes());		
		return "listar_docente";
	}
	
	@RequestMapping("/form")
	public String form(Map<String, Object> map){
			map.put("docente", new Docentes());
		return "inserir_docente_form";
	}
	
	@RequestMapping(value="/adicionar", method=RequestMethod.POST)
	public String adicionarDocente(@ModelAttribute("docente") Docentes docente, ModelMap model, HttpServletRequest request){		
			model.addAttribute("nome", docente.getNome());
			model.addAttribute("matricula", docente.getMatricula());
			model.addAttribute("titulacao", docente.getTitulacao());
			docenteService.adicionarDocente(docente);
		return "redirect:/index";
	}
	
	@RequestMapping("/update/{docenteId}")
	public String updateForm(Map<String, Object> map, @PathVariable("docenteId") int id){			
			map.put("docente", new Docentes());
			map.put("docenteList", docenteService.docenteById(id));
		return "atualizar_docente_form";
	}
	
	@RequestMapping(value="/atualizar", method=RequestMethod.POST)
	public String atualizarDocente(@ModelAttribute("docente") Docentes docente, ModelMap model, HttpServletRequest request){
			model.addAttribute("nome", docente.getNome());
			model.addAttribute("matricula", docente.getMatricula());
			model.addAttribute("titulacao", docente.getTitulacao());
			docenteService.atualizaDocente(docente.getId());
		return "redirect:/listaDocentes";
	}
	
	@RequestMapping("/remover/{docenteId}")
	public String removerDocente(@PathVariable("docenteId") int id){
			docenteService.removerDocente(id);
		return "redirect:/listaDocentes";
	}
	
}
