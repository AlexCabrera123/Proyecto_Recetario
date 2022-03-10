import java.util.ArrayList;

public class Receta {
    private double tiempoPreparacion;
    private ArrayList<Ingredientes> ingredientes;
    private ArrayList<String> pasos;

    public Receta(double tiempoPreparacion, ArrayList<Ingredientes> ingredientes, ArrayList<String> pasos) {
        this.tiempoPreparacion = tiempoPreparacion;
        this.ingredientes = ingredientes;
        this.pasos = pasos;
        System.out.println("Receta creada");
    }

    public double getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(double tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public ArrayList<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }
}
