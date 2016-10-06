
package Empresa.Sucursal.Empleado;
import java.util.*;
public class Sucursal {
    private String Ciudad;
    private int NumEmpleados;
    private HashMap<String, Empleado> emp;

    public Sucursal(String Ciudad) {
        this.Ciudad = Ciudad;
        this.NumEmpleados=0;
        this.emp=new HashMap<>();
    }
   public boolean IngresarEmpleados(Empleado e){
       if(this.emp.containsKey(e.getCedula()))
       return false;
   else{
       this.emp.put(e.getCedula(), e);
       return true;
       }
   }
   public ArrayList<Empleado> ListarTodosEmpleados(){
    ArrayList<Empleado> empleados=
            new ArrayList<>();
    for(Empleado e:this.emp.values())
        empleados.add(e);
    return empleados;
    }
   public Empleado ListarEmpleadoMayor(){
    Empleado mayor=null;
    for(Empleado e: this.emp.values()){
    if(mayor==null)
        mayor=e;
    else
    if(e.getEdad()>mayor.getEdad())
        mayor=e;
        }
    return mayor;
   }
   public Empleado BuscarEmpleado(String cedula){
       Empleado e=null;
       e=this.emp.get(cedula);
       return e;
   }

    public HashMap<String, Empleado> getEmp() {
        return emp;
    }

    public String getCiudad() {
        return Ciudad;
    }
    
   
}
