
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Personas {
    private String nombre;
    private int edad;
    private String id;
    private String sexo;
    private String estado_civil;
    ArrayList<Mensajes> m = new ArrayList();

    public Personas() {
    }

    public Personas(String nombre, int edad, String id, String sexo, String estado_civil) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.sexo = sexo;
        this.estado_civil = estado_civil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public ArrayList<Mensajes> getM() {
        return m;
    }

    public void setM(ArrayList<Mensajes> m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
