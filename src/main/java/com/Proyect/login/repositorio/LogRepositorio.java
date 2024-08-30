package com.Proyect.login.repositorio;

import com.Proyect.login.modelo.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepositorio extends JpaRepository<Log, Integer> {
    
}
