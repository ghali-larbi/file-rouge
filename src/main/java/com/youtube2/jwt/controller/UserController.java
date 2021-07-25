package com.youtube2.jwt.controller;

import com.youtube2.jwt.entity.User;
import com.youtube2.jwt.entity.Voiture;
import com.youtube2.jwt.service.UserService;
import com.youtube2.jwt.service.VoitureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private VoitureService voitureService;

    @PostConstruct
    public void initRoleAndUser() {
        userService.initRoleAndUser();
    }

    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user) {
        return userService.registerNewUser(user);
    }
    @PostMapping({"/updateUser/{idUser}"})
    @PreAuthorize("hasRole('User')")
    public User updateUser( @RequestBody User user,@PathVariable int idUser ){
    	return userService.updateUser(idUser,user);
    }

    @GetMapping({"/forAdmin"})
    @PreAuthorize("hasRole('Admin')")
    public String forAdmin(){
    	System.out.println("for admin ");
        return "This URL is only accessible to the admin";
    }

    @GetMapping({"/forUser"})
    @PreAuthorize("hasRole('User')")
    public String forUser(){
        return "This URL is only accessible to the user";
    }
    @PostMapping({"/addVoiture"})
    @PreAuthorize("hasRole('Admin')")
    public Voiture addVoiture( @RequestBody Voiture voiture ){
    	return voitureService.addVoiture(voiture);
    }
    @PutMapping({"/updateVoiture/{matricule}"})
    @PreAuthorize("hasRole('Admin')")
    public Voiture updateVoiture( @RequestBody Voiture voiture,@PathVariable int matricule ){
    	return voitureService.updateVoiture(matricule,voiture);
    }
    @DeleteMapping({"/{idVoiture}"})
    @PreAuthorize("hasRole('Admin')")
    public void deleteVoiture(@PathVariable int idVoiture ){
    	 voitureService.deleteVoiture(idVoiture);
    }
    
    @GetMapping({"/getVoiture/{marque}"})
    @PreAuthorize("hasRole('User')")
    public Voiture getVoiture(@PathVariable String marque){
        return voitureService.getVoiture(marque) ;
    }
}
