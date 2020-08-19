
package Librerias;

/*
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Proyecto III Parcial.
*/

public class Bitacora 
{
    private String Usuario;
    private String Fecha;
    private String Departamento;
    private String Actividad;
    private String Hora;

   //Setters
    public void setUsuario(String _usuario)
    {
        this.Usuario = _usuario;
    }
    
    public void setFecha(String _fecha)
    {
        this.Fecha = _fecha;
    }
    
    public void setDepartamento(String _departamento)
    {
        this.Departamento = _departamento;
    }

     public void setActividad(String _actividad)
     {
        this.Actividad = _actividad;
     }
     
     public void  setHora(String _hora)
     {
         this.Hora = _hora;
     }
    

  //Getters
    public String getUsuario()
    {
        return this.Usuario;
    }
    
    public String getFecha()
    {
        return this.Fecha;
    }
    
    public String getDepartamento()
    {
        return this.Departamento;
    }
    
     public String getActividad()
     {
         return this.Actividad;
     }
     public String  getHora()
     {
         return this.Hora;
     }
}
