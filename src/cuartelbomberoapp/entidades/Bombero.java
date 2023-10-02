/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuartelbomberoapp.entidades;

import java.time.LocalDate;

/**
 *
 * @author jonathan veliz
 */
public class Bombero {
    private int idBombero;
    private String dni;
    private String nombre_ape;
    private LocalDate fecha_nac;
    private String celular;
    private int codBrigada;

    public Bombero() {
    }

    public Bombero(int idBombero, String dni, String nombre_ape, LocalDate fecha_nac, String celular, int codBrigada) {
        this.idBombero = idBombero;
        this.dni = dni;
        this.nombre_ape = nombre_ape;
        this.fecha_nac = fecha_nac;
        this.celular = celular;
        this.codBrigada = codBrigada;
    }

    public Bombero(String dni, String nombre_ape, LocalDate fecha_nac, String celular, int codBrigada) {
        this.dni = dni;
        this.nombre_ape = nombre_ape;
        this.fecha_nac = fecha_nac;
        this.celular = celular;
        this.codBrigada = codBrigada;
    }
    
    
    
}
