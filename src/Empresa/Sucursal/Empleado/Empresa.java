
package Empresa.Sucursal.Empleado;

import java.util.*;

public class Empresa {
    private String nombre;
    private TreeMap<String, Sucursal> suc;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.suc= new TreeMap<>();
    }
    public ArrayList<Empleado> ListarTodosEmpleados(){
    ArrayList<Empleado> empleados=
            new ArrayList<>();
    for(Sucursal s:this.suc.values())
        for(Empleado e:s.getEmp().values())
        empleados.add(e);
    return empleados;
    }
    public boolean AgregarSucursal(Sucursal s){
     if(this.suc.containsKey(s.getCiudad()))
       return false;
   else{
       this.suc.put(s.getCiudad(), s);
       return true;
       }
    }
   public ArrayList<Empleado> ListarEmpleadosMayores(){
   return 
   } 
}
