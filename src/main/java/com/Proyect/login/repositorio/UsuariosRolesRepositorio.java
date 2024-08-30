package com.Proyect.login.repositorio;

import com.Proyect.login.modelo.UsuariosRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRolesRepositorio extends JpaRepository<UsuariosRoles, Long> {
    
}
