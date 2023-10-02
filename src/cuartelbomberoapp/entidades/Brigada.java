/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuartelbomberoapp.entidades;

/**
 *
 * @author jonathan veliz
 */
public class Brigada {
    private int codBrigada;
    private String nombre_br;
    private String especialidad;
    private boolean libre;
    private int nro_cuartel;  

    public Brigada() {
    }

    public Brigada(int codBrigada, String nombre_br, String especialidad, boolean libre, int nro_cuartel) {
        this.codBrigada = codBrigada;
        this.nombre_br = nombre_br;
        this.especialidad = especialidad;
        this.libre = libre;
        this.nro_cuartel = nro_cuartel;
    }
    
    
}
