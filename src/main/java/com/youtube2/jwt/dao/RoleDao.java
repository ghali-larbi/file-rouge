package com.youtube2.jwt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.youtube2.jwt.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
