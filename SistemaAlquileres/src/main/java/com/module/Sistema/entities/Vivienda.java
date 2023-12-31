package com.module.Sistema.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Federico
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
//Autocomplete setters y getters
@Data
//Establecer la clase como una entidad JPA para relacionar con la base de datos
@Entity(name="viviendas")
//Referir la tabla de la base de datos a relacionar
@Table(name="viviendas")

public class Vivienda implements Serializable{
    
    private static final long serialVersionUID=1L;

    @Id
    @Column(name="id_vivienda")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(name="direccion")
    private String direccion;
    @Column(name="imagen_url")
    private String imagen;
    @ManyToOne
    @JoinColumn(name="id_agencia",nullable = false)
    private Agencia id_agencia;
    @Column(name="estado")
    private boolean estado;
    
    public void setEstado(boolean b) {
        estado = b;
    }
}
