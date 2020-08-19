
package Librerias;

/**
 *
 * Heiby Mariele Barahona Fonseca
 * 202010060463
 */
public class Ventas extends Productos{
    Productos producto = new Productos();
    private String cliente;
    private int cantidad;
    private double total;
  

public Ventas(){}

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public double Total(int cantidad, double precio){
        total= cantidad*precio;
        return cantidad;
    }

}
