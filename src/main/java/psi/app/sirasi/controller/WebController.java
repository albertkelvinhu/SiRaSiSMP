package psi.app.sirasi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import psi.app.sirasi.model.User;
import psi.app.sirasi.service.UserService;

@Controller
public class WebController {
	
	@Autowired
	private UserService userService;

	
	//administrator =========================================
	//CREATE
	@RequestMapping(value={"/admin/add/siswa"})
	public ModelAndView formSiswa(){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("admin/formsiswa");
		return modelAndView;
	}
	
    @GetMapping("/admin/add/guru")
    public ModelAndView formGuru()
    {
        ModelAndView m = new ModelAndView();
        m.setViewName("admin/formguru");
        return m;
    }
    
    @GetMapping("/admin/add/kelas")
    public ModelAndView formKelas()
    {
        ModelAndView m = new ModelAndView();
        m.setViewName("admin/formkelas");
        return m;
    }

    //READ
    @GetMapping("/admin/list/kelas")
    public ModelAndView listKelas()
    {
        ModelAndView m = new ModelAndView();
        m.setViewName("dashboard/admin/listkelas");
        return m;
    }

    @GetMapping("/admin/list/siswa")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ModelAndView listSiswa()
    {
        ModelAndView m = new ModelAndView();
        m.setViewName("dashboard/admin/listsiswa");
        return m;
    }
    
    @GetMapping("/admin/list/guru")
    public ModelAndView listGuru()
    {
        ModelAndView m = new ModelAndView();
        m.setViewName("dashboard/admin/listguru");
        return m;
    }
    
    @GetMapping("/admin/list/staff")
    public ModelAndView listStaff()
    {
        ModelAndView m = new ModelAndView();
        m.setViewName("dashboard/admin/liststaff");
        return m;
    }
    
    //SAVE
    
	
	

}
