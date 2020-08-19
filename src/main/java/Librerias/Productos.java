
package Librerias;

/*
    * @serial : 201710080097.
    * @author : Milton David Canales Gonzales.
    * @version : Proyecto III Parcial.
*/

public class Productos 
{
    private String NoSerie;
    private String Descripcion;
    private int Cantidad;
    private int precio;
    private String Proveedor;
    private String Caducidad;
    
    //Setters
    public void setNoSerie(String _noSerie)
    {
        this.NoSerie = _noSerie;
    }

    public void setDescripcion(String _descripcion)
    {
        this.Descripcion = _descripcion;
    }

    public void setCantidad(int _cantidad)
    {
        this.Cantidad = _cantidad;
    }

    public void setProveedor(String _proveedor)
    {
        this.Proveedor = _proveedor;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCaducidad(String _caducidad)
    {
        this.Caducidad = _caducidad;
    }
    
    //Getters
    public String getNoSerie()
    {
        return this.NoSerie;
    }

    public String getDescripcion()
    {
        return this.Descripcion;
    }

    public int getCantidad()
    {
        return this.Cantidad;
    }

    public String getProveedor()
    {
        return this.Proveedor;
    }

    public int getPrecio() {
        return precio;
    }

    public String getCaducidad()
    {
        return this.Caducidad;
    }

}
 