package com.axsos.ProjectManager.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="projects")
public class Project {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    
	    @Size(min=3, max=300, message="title must be between 3 and 300 characters")
	    private String title;
	    
	    
	    @Size(min=3, max=300, message="description must be between 3 and 300 characters")
	    private String description;
	    
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    @NotNull
	    private Date duedate;
	    
	    @Column(updatable=false)
	    private Date createdAt;
	    private Date updatedAt;
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="user_id")
	    private User user;
	    @ManyToMany(fetch = FetchType.LAZY)
	    @JoinTable(
	        name = "users_teams", 
	        joinColumns = @JoinColumn(name = "project_id"), 
	        inverseJoinColumns = @JoinColumn(name = "user_id")
	    )
	    private List<User> manyUsers;
	    
		public Project() {
			
		}
		public Project(Long id,
				@NotEmpty(message = "title must not be empty!") @Size(min = 3, max = 300, message = "title must be between 3 and 300 characters") String title,
				@NotEmpty(message = "description must not be empty!") @Size(min = 3, max = 300, message = "description must be between 3 and 300 characters") String description,
				@NotEmpty(message = "Date is required!") @NotNull Date duedate, User user) {
			super();
			this.id = id;
			this.title = title;
			this.description = description;
			this.duedate = duedate;
			this.user = user;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Date getDuedate() {
			return duedate;
		}
		public void setDuedate(Date duedate) {
			this.duedate = duedate;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		
		
		public List<User> getManyUsers() {
			return manyUsers;
		}
		public void setManyUsers(List<User> manyUsers) {
			this.manyUsers = manyUsers;
		}
		@PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
		
		
		
	    
	    

}
