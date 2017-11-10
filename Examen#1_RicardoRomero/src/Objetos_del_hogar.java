/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Objetos_del_hogar extends Objetos{
    private String tiempo_vida;
    private String area_casa;
    private String instru_armado;
    private String fecha_compra;

    public Objetos_del_hogar() {
        super();
    }

    public Objetos_del_hogar(String tiempo_vida, String area_casa, String instru_armado, String fecha_compra, String color, String descripcion, String marca, int tamaño, int calidad, int precio, String dueño) {
        super(color, descripcion, marca, tamaño, calidad, precio, dueño);
        this.tiempo_vida = tiempo_vida;
        this.area_casa = area_casa;
        this.instru_armado = instru_armado;
        this.fecha_compra = fecha_compra;
    }

    public String getTiempo_vida() {
        return tiempo_vida;
    }

    public void setTiempo_vida(String tiempo_vida) {
        this.tiempo_vida = tiempo_vida;
    }

    public String getArea_casa() {
        return area_casa;
    }

    public void setArea_casa(String area_casa) {
        this.area_casa = area_casa;
    }

    public String getInstru_armado() {
        return instru_armado;
    }

    public void setInstru_armado(String instru_armado) {
        this.instru_armado = instru_armado;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    @Override
    public String toString() {
        return "Objetos_del_hogar{" + "tiempo_vida=" + tiempo_vida + ", area_casa=" + area_casa + ", instru_armado=" + instru_armado + ", fecha_compra=" + fecha_compra + '}';
    }
}
