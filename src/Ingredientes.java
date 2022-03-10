public class Ingredientes {
    private String nombre;
    private boolean salado;
    private double cantidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSalado() {
        return salado;
    }

    public void setSalado(boolean salado) {
        this.salado = salado;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Ingredientes(String nombre, boolean salado, double cantidad) {
        this.nombre = nombre;
        this.salado = salado;
        this.cantidad = cantidad;
        System.out.println("Ingrediente creado");

    }
}
