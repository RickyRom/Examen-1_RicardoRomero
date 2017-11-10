/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Ropa extends Objetos{
    private double talla;
    private String material;
    private String pais_elaboracion;

    public Ropa() {
        super();
    }

    public Ropa(double talla, String material, String pais_elaboracion, String color, String descripcion, String marca, int tamaño, int calidad, int precio, String dueño) {
        super(color, descripcion, marca, tamaño, calidad, precio, dueño);
        this.talla = talla;
        this.material = material;
        this.pais_elaboracion = pais_elaboracion;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPais_elaboracion() {
        return pais_elaboracion;
    }

    public void setPais_elaboracion(String pais_elaboracion) {
        this.pais_elaboracion = pais_elaboracion;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", material=" + material + ", pais_elaboracion=" + pais_elaboracion + '}';
    }
}
