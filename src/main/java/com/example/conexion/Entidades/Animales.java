/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.conexion.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author ggaby
 */
@Entity
@Table (name = "animal")
        
public class Animales {
    @Id
    private int id;
    
    @Column(length = 50)
    private String nombre;
    private int numPatas;

    public Animales() {
    }

    public Animales(int id, String nombre, int numPatas) {
        this.id = id;
        this.nombre = nombre;
        this.numPatas = numPatas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    
    
}