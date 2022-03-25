package com.axsos.ProjectManager.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.ProjectManager.models.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
	
	List<Project> findAll();
	@Query(value="select * from projects left join users_teams on users_teams.project_id = projects.id where projects.user_id =?1 or users_teams.user_id =?1", nativeQuery=true)
	List<Project> allProjectsTable2(Long id);
	@Query(value="select * from projects where id not in(select id from projects left join users_teams on users_teams.project_id = projects.id where projects.user_id =?1 or users_teams.user_id =?1)", nativeQuery=true)
	List<Project> allProjectsTable1(Long id);

}
