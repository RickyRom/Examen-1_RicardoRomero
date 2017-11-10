/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Personal extends Personas {

    private String ocupacion;
    private String horario_t;
    private String tiempo_trabajando;
    private int sueldo;

    public Personal() {
        super();
    }

    public Personal(String ocupacion, String horario_t, String tiempo_trabajando, int sueldo, String nombre, int edad, String id, String sexo, String estado_civil) {
        super(nombre, edad, id, sexo, estado_civil);
        this.ocupacion = ocupacion;
        this.horario_t = horario_t;
        this.tiempo_trabajando = tiempo_trabajando;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario_t() {
        return horario_t;
    }

    public void setHorario_t(String horario_t) {
        this.horario_t = horario_t;
    }

    public String getTiempo_trabajando() {
        return tiempo_trabajando;
    }

    public void setTiempo_trabajando(String tiempo_trabajando) {
        this.tiempo_trabajando = tiempo_trabajando;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Personal{" + "ocupacion=" + ocupacion + ", horario_t=" + horario_t + ", tiempo_trabajando=" + tiempo_trabajando + ", sueldo=" + sueldo + '}';
    }
}
