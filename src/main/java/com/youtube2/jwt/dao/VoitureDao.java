package com.youtube2.jwt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.youtube2.jwt.entity.Voiture;

@Repository
public interface VoitureDao extends CrudRepository<Voiture,Integer> {
       Voiture findById(int id);
       Voiture findAllByMarque(String marque);
}
