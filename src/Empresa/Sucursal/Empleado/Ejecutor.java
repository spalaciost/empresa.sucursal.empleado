
package Empresa.Sucursal.Empleado;
import java.util.*;
public class Ejecutor {

    public static void main(String[] args) {
        Empleado e1=new Empleado("51442785","juanito perez",51,46,5000);
        Empleado e2=new Empleado("51123785","daniel lopez",40,52,10000);
        Sucursal s1=new Sucursal("cali");
        
        //ingresar empleado
        if(!s1.IngresarEmpleados(e1))
            System.out.println("error");
        if(!s1.IngresarEmpleados(e2))
            System.out.println("error");
        if(!s1.IngresarEmpleados(e2))
            System.out.println("error");
        
        //buscar empleado
        Empleado e = s1.BuscarEmpleado("51442785");
        if(e!=null) System.out.println(e);
        else System.out.println("No existe");
        
        System.out.println("-----------");
        //listar empleados
        ArrayList<Empleado> emp=s1.ListarTodosEmpleados();
        for(Empleado emp1: emp){
            System.out.println(emp1);
        }
        
    }
    
}
