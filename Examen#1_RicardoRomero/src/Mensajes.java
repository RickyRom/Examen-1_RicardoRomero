/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Mensajes {
    private String emisor;
    private String receptor;
    private String cuerpo;

    public Mensajes() {
    }

    public Mensajes(String emisor, String receptor, String cuerpo) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.cuerpo = cuerpo;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString() {
        return "Mensajes{" + "emisor=" + emisor + ", receptor=" + receptor + ", cuerpo=" + cuerpo + '}';
    }
}
