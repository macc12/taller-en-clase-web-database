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
public class Equipo {

    private int id_equipo;
    private String nombre;
    private int puntaje;
    ArrayList<Persona> personas;

    public Equipo(int id_equipo, String nombre, int puntaje, ArrayList<Persona> personas) {
        this.id_equipo = id_equipo;
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.personas = personas;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

}
