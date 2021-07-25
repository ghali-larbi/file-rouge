package com.youtube2.jwt.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.youtube2.jwt.dao.UserDao;
import com.youtube2.jwt.dao.VoitureDao;
import com.youtube2.jwt.entity.Role;
import com.youtube2.jwt.entity.User;
import com.youtube2.jwt.entity.Voiture;

import antlr.collections.List;
import javassist.NotFoundException;

@Service
public class VoitureService {
	 @Autowired
	 private VoitureDao voitureDao;
	 
	  public Voiture addVoiture(Voiture voiture) {
	        return voitureDao.save(voiture);
	    }
	  public Voiture updateVoiture(int matricule,Voiture voiture) {
	     Voiture newVoiture=voitureDao.findById(matricule);
	     newVoiture.setPrix(voiture.getPrix());
	     newVoiture.setCategorie(voiture.getCategorie());
	     newVoiture.setMarque(voiture.getMarque());
	     newVoiture.setModel(voiture.getModel());
	     newVoiture.setPuissance(voiture.getPuissance());
	     
		 
		 return voitureDao.save(newVoiture);
	    }
	public void deleteVoiture(int idVoiture) {
		 Voiture newVoiture=voitureDao.findById(idVoiture);
		  voitureDao.delete(newVoiture);	  
	}
	 public Voiture getVoiture(String marque) {
	   Voiture getVoitureMarque=voitureDao.findAllByMarque(marque);
	  
		   if(getVoitureMarque.getEtat().equals("disponible")) {
			   return getVoitureMarque;
		   }
		   else {
			  System.out.println("not found");   
		   }
		   return null;
	   
	   
		
	    }
}
