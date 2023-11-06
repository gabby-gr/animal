/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.conexion.Servicios;

import com.example.conexion.Repositorios.RepositorioAnimal;
import com.example.conexion.Entidades.Animales;
import java.util.List;
import static org.hibernate.query.results.Builders.entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ggaby
 */
@Service
public class Servicioanimales {
    
    @Autowired
    RepositorioAnimal rAnimal;
       
    public List<Animales> obtenerTodosLosAnimales () {
       return rAnimal.findAll();
    }
    
    public boolean insertarAnimal (Animales a){
        
        boolean respuesta = false;
        try{
            rAnimal.save(a); //insert o update a nivel de bdd
            respuesta = true;
            
        }catch (Exception ex){
            respuesta = false ;
        }
        return respuesta;
    }
    
    public boolean actualizarAnimal (Animales a){
        
        boolean respuesta = false;
        try{
            rAnimal.save(a); //insert o update a nivel de bdd
            respuesta = true;
            
        }catch (Exception ex){
            respuesta = false ;
        }
        return respuesta;
    }
    
    public boolean eliminarrAnimal (Animales a){
        
        boolean respuesta = false;
        try{
            rAnimal.delete(a); //insert o update a nivel de bdd
            respuesta = true;
            
        }catch (Exception ex){
            respuesta = false ;
        }
        return respuesta;
    }
    
}
