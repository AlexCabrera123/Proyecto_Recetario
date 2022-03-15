import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //CREACIÓN DE INGREDIENTES
        //GUARDAR INGREDIENTES EN UN ARRAY LIST
        //CREAR RECETAS
        //CREAR UN RECETARIO
        //GUARDAR LAS RECETAS EN EL RECETARIO
        //ABRIR UN MENÚ
        //DESPLEGAR LOS INGREDIENTES DISPONIBLES Y ENUMERARLOS
        //HACER UN ARRAYLIST DE INGREDIENTES
        //LLAMAR A LOS INGREDIENTES CON UN GET (INDICE -1)
        //PARA INGRESAR VARIOS INGREDIENTES USAR UN DO WHILE
        //QUE LA BANDERA SEA 0

        Ingredientes Levadura = new Ingredientes("LEVADURA", true, 500);
        Ingredientes Harina = new Ingredientes(" HARINA", true, 500);
        Ingredientes Queso = new Ingredientes("QUESO", true, 250);
        Ingredientes Paprika = new Ingredientes("PAPRIKA", true, 50);
        Ingredientes Pimiento = new Ingredientes("PIMIENTO", true, 100);
        Ingredientes Jitomate = new Ingredientes("JITOMATE", true, 100);
        Ingredientes Aceitunas = new Ingredientes("ACEITUNAS", true, 75);
        Ingredientes PuredeTomate = new Ingredientes("PURE DE TOMATE", true, 150);

        //Guardar ingredientes en un array list
        ArrayList<Ingredientes> ingredientesDisp = new ArrayList<>(Arrays.asList(Levadura, Harina, Queso, Paprika, Pimiento, Jitomate, Aceitunas, PuredeTomate));
        //crear recetas
        Receta pizza = new Receta(
                "PIZZA",
                25,
                //Ingredientes
                new ArrayList<>(Arrays.asList(Levadura,Harina,Queso,Pimiento, Jitomate, Aceitunas, PuredeTomate)),
                //Pasos
                new ArrayList<>(Arrays.asList("Lavar los ingredientes",
                        "Cortar los ingredientes",
                        "Mezclar la harina con la levadura")));
        //Crear un recetario





    }
}
