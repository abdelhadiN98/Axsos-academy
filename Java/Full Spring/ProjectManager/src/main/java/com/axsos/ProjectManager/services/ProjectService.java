package com.axsos.ProjectManager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.ProjectManager.models.Project;
import com.axsos.ProjectManager.models.User;
import com.axsos.ProjectManager.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	private final ProjectRepository projectRepository ;

	public ProjectService(ProjectRepository projectRepository) {
		
		this.projectRepository = projectRepository;
	}
	
	// returns all the projects
    public List<Project> allProjects() {
        return projectRepository.findAll();
    }
    // creates a Project
    public Project createProject(Project b) {
        return projectRepository.save(b);
    }
    // retrieves a Project
    public Project findProject(Long id) {
        Optional<Project> optionalProject = projectRepository.findById(id);
        if(optionalProject.isPresent()) {
            return optionalProject.get();
        } else {
            return null;
        }
    }
    
    public List<Project> allProjectsTable2(Long id){
    	return projectRepository.allProjectsTable2(id);
    }
    
    public List<Project> allProjectsTable1(Long id){
    	return projectRepository.allProjectsTable1(id);
    }
	
    public Project removeProject(Project project , User user) {
    	project.getManyUsers().remove(user);
    	return projectRepository.save(project);
    }
    
//  edit a project details
  public void updateProject(Project project , Long id) {
	Project editProject = projectRepository.findById(id).orElse(null);
  	assert editProject !=null;
  	editProject.setTitle(project.getTitle());
  	editProject.setDescription(project.getDescription());
  	editProject.setDuedate(project.getDuedate());
  	projectRepository.save(editProject);
  	
  }
//  delete a project
  public void deleteProject(Long id) {
	 Project project = findProject(id);
  	if (project!=null) {
  		projectRepository.deleteById(id);
  	}
  }


    

}
