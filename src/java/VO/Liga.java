/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import java.util.ArrayList;

/**
 *
 * @author Labing
 */
public class Liga {

    private int id_liga;
    private String nombre;
    private ArrayList<Equipo> equipos;

    public Liga(int id_liga, String nombre, ArrayList<Equipo> equipos) {
        this.id_liga = id_liga;
        this.nombre = nombre;
        this.equipos = equipos;
    }

    public int getId_liga() {
        return id_liga;
    }

    public void setId_liga(int id_liga) {
        this.id_liga = id_liga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

}
