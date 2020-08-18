
package Librerias;
import java.util.Date;

/*
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Proyecto III Parcial.
*/

public abstract class Bitacora 
{
    private String Usuario;
    private Date Fecha;
    private String Departamento;

   //Setters
    public void setUsuario(String _usuario)
    {
        this.Usuario = _usuario;
    }
    
    public void setFecha(Date _fecha)
    {
        this.Fecha = _fecha;
    }
    
    public void setDepartamento(String _departamento)
    {
        this.Departamento = _departamento;
    }
    

  //Getters
    public String getUsuario()
    {
        return this.Usuario;
    }
    
    public Date getFecha()
    {
        return this.Fecha;
    }
    
    public String getDepartamento()
    {
        return this.Departamento;
    }
    
    abstract String getActividad();
    abstract String getHora();
}
