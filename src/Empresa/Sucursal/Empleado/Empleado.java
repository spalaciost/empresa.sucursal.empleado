
package Empresa.Sucursal.Empleado;

public class Empleado {
    private String Cedula, nombre;
    private int horas,edad;
    private double salario;

    public Empleado(String Cedula, String nombre, int horas, int edad, double salario) {
        this.Cedula = Cedula;
        this.nombre = nombre;
        this.horas = horas;
        this.edad = edad;
        this.salario = salario;
    }

    
    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Cedula=" + Cedula + ", nombre=" + nombre + ", horas=" + horas + ", edad=" + edad + ", salario=" + salario + '}';
    }
    
}
