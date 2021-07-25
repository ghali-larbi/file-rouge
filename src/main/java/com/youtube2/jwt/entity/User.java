package com.youtube2.jwt.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.util.Set;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
    private int id;
	private String email;
    private String FirstName;
    private String userLastName;
	private String userPassword;
	private String userAdresse;
    private String userTelephone;
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE",
            joinColumns = {
                    @JoinColumn(name = "USER_ID")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "ROLE_ID")
            }
    )
    private Set<Role> role;
	public int getId() {
		return id;
	}
	 public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
	public void setId(int id) {
		this.id = id;
	}
	public Set<Role> getRole() {
		return role;
	}
	public void setRole(Set<Role> role) {
		this.role = role;
	}
	public String getUserFirstName() {
		return FirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.FirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserAdresse() {
		return userAdresse;
	}
	public void setUserAdresse(String userAdresse) {
		this.userAdresse = userAdresse;
	}
	public String getUserTelephone() {
		return userTelephone;
	}
	public void setUserTelephone(String userTelephone) {
		this.userTelephone = userTelephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

   

    
}
