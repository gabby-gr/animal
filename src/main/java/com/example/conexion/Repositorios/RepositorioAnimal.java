/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.conexion.Repositorios;

import com.example.conexion.Entidades.Animales;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ggaby
 */
@Repository

public interface RepositorioAnimal extends JpaRepository<Animales, Integer>{

    
}
