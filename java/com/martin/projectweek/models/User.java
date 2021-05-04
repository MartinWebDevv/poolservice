package com.martin.projectweek.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name="users")
public class User {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    @Email(message="Email must be a valid email!")
    @Size(min=5, max=30, message="Email must be between 5-30 characters!")
    private String email;
    
    @NotNull()
    private String firstName;
    
    @NotNull()
    private String lastName;
    
    @NotNull()
    @Size(min=3, message="Password must be between 3-15 characters!")
    private String password;
    
    @Transient
    private String passwordConfirmation;
    
    @OneToMany(mappedBy="user", fetch = FetchType.LAZY)
    private List<Schedule> appointments;
    
    
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    public User() {
    }
    
    public User(Long id, String email, String firstName, String lastName ,String password, List<Schedule> schedule) {
    	this.id = id;
    	this.email = email;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.password = password;
    	this.appointments = schedule;
    }
    
    
    


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
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
