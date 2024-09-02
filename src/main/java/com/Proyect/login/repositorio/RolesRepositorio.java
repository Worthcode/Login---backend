package com.Proyect.login.repositorio;

import com.Proyect.login.modelo.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepositorio extends JpaRepository<Roles, Integer> {
   
}
