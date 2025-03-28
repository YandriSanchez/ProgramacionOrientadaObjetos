package ec.edu.ups.poo.Clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familiar extends Persona{

    private String parentesco;
    private String tipoSangre;
    private GregorianCalendar fechaNacimiento;

    public Familiar() {}

    public Familiar(String cedula, String nombre, String apellido, String direccion, String parentesco,
                    String tipoSangre, GregorianCalendar fechaNacimiento) {
        super(cedula, nombre, apellido, direccion);
        this.parentesco = parentesco;
        this.tipoSangre = tipoSangre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Familiar{" +
                super.toString() +
                "cedula='" + getCedula() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", parentesco='" + parentesco + '\'' +
                ", tipoSangre='" + tipoSangre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    public calcularEdad(){
        Calendar hoy = Calendar.getInstance();
        int anioActual = hoy.get(Calendar.YEAR);
        int mesActual = hoy.get(Calendar.MONTH);
        int diaActual = hoy.get(Calendar.DAY_OF_MONTH);
    }
}
