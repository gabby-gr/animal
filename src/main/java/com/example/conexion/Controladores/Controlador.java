/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.conexion.Controladores;
import java.util.List;
import com.example.conexion.Entidades.Animales;
import com.example.conexion.Servicios.Servicioanimales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ggaby
 */
@RestController
@RequestMapping("/animal")

public class Controlador {
    
    @Autowired
    Servicioanimales sAnimal;
    
    
    @GetMapping("")
    public List<Animales> getTodosLosAniamales(){
        return sAnimal.obtenerTodosLosAnimales();
    
    }
    
    @PostMapping("")
    public List<Animales> postInsertarAnimal(@RequestBody Animales a){
        if (sAnimal.insertarAnimal(a)){
            return sAnimal.obtenerTodosLosAnimales();
                
        }else{
            return null;
        }
    
    }
    
    @PutMapping("")
    public List<Animales> putActualizar(@RequestBody Animales a){
        if (sAnimal.insertarAnimal(a)){
            return sAnimal.obtenerTodosLosAnimales();
                
        }else{
            return null;
        }
    
    }
    
    @DeleteMapping("")
    public List<Animales> deletetEliminarAnimal(@RequestBody Animales a){
        if (sAnimal.eliminarrAnimal(a)){
            return sAnimal.obtenerTodosLosAnimales();
                
        }else{
            return null;
        }
    
    }
    
}
