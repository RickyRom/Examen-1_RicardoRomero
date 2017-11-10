/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Zapatos extends Objetos{
    private double talla;
    private String tipo_suela;
    private int confort;

    public Zapatos() {
        super();
    }

    public Zapatos(double talla, String tipo_suela, int confort, String color, String descripcion, String marca, int tamaño, int calidad, int precio, String dueño) {
        super(color, descripcion, marca, tamaño, calidad, precio, dueño);
        this.talla = talla;
        this.tipo_suela = tipo_suela;
        this.confort = confort;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getTipo_suela() {
        return tipo_suela;
    }

    public void setTipo_suela(String tipo_suela) {
        this.tipo_suela = tipo_suela;
    }

    public int getConfort() {
        return confort;
    }

    public void setConfort(int confort) {
        this.confort = confort;
    }

    @Override
    public String toString() {
        return "Zapatos{" + "talla=" + talla + ", tipo_suela=" + tipo_suela + ", confort=" + confort + '}';
    }
}
