package com.axsos.ProjectManager.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.hibernate.cfg.annotations.MapKeyColumnDelegator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.axsos.ProjectManager.models.Project;
import com.axsos.ProjectManager.models.User;
import com.axsos.ProjectManager.services.ProjectService;
import com.axsos.ProjectManager.services.UserService;

@Controller
public class ProjectController {
	private final ProjectService projectService;
	private final UserService userService;
	public ProjectController(ProjectService projectService, UserService userService) {
		
		this.projectService = projectService;
		this.userService = userService;
	}
	@GetMapping("/home")
	public String home(Model model ,HttpSession session ) {
		Long user_id = (Long) session.getAttribute("user_id");
		User thisUser = userService.findUserById(user_id);
		model.addAttribute("thisUser", thisUser);
		List<Project> allProjects = projectService.allProjectsTable1(user_id);
		List<Project> allProjectsTable2 = projectService.allProjectsTable2(user_id);
		model.addAttribute("allProjects", allProjects);
		model.addAttribute("allProjectsTable2", allProjectsTable2);
		return "welcome.jsp";
	
	}
	
	@RequestMapping("/projects/new")
	public String createProject(@Valid @ModelAttribute("project") Project project,BindingResult result,Model model) {
		return "createProjectPage.jsp";
	}
	
	@PostMapping("/createProject")
	public String createProject(Model model ,@Valid @ModelAttribute("project") Project project, BindingResult result,HttpSession session) {
		if(result.hasErrors()) {
			return "createProjectPage.jsp";
		}
		
		Long user_id =(Long) session.getAttribute("user_id");
		User user1 = userService.findUserById(user_id);
		 project.setUser(user1);
		 projectService.createProject(project);
		
		return "redirect:/home";
	}
	
	@RequestMapping("join/{id}")
	public String joinTeam(@PathVariable("id") Long id,HttpSession session) {
		Long user_id =(Long) session.getAttribute("user_id");
		User user1 = userService.findUserById(user_id);
		Project this_project = projectService.findProject(id);
		user1.getManyProjects().add(this_project);
		projectService.createProject(this_project);
		
		return "redirect:/home";
	}
	@RequestMapping("leave/{id}")
	public String leaveTeam(@PathVariable("id") Long id,HttpSession session) {
		Long user_id =(Long) session.getAttribute("user_id");
		User user1 = userService.findUserById(user_id);
		Project this_project = projectService.findProject(id);
		projectService.removeProject(this_project, user1);
		return "redirect:/home";
	}
	
	@RequestMapping("/projects/edit/{id}")
		public String editPage(@PathVariable("id") Long id ,Model model ,@Valid @ModelAttribute("project") Project project, BindingResult result,HttpSession session) {
		Project projects = projectService.findProject(id);
		model.addAttribute("projects", projects);
		return "editProject.jsp";
		}
	
	
	@RequestMapping(value ="/edit/{id}" , method = RequestMethod.PUT)
	public String updateBook(@PathVariable("id") Long id,@Valid @ModelAttribute("project") Project project , BindingResult result) {
		if (result.hasErrors()) {
			return "editProject.jsp";
		}
		else {
			projectService.updateProject(project, id);
			return "redirect:/home";
		}
	}
	
	@RequestMapping("/projects/{id}")
	public String detailsPage(@PathVariable("id") Long id,Model model) {
		Project projects = projectService.findProject(id);
		model.addAttribute("projects", projects);
		return "detailsProject.jsp";
	}
	
	
	

}
