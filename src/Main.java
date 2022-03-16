import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
        Ingredientes Agua = new Ingredientes("AGUA", false,100);


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
                        "Mezclar agua tibia con la levadura",
                        "Mezclar la harina con la levadura",
                        "Amasar la mezcla hasta que quede uniforme",
                        "Vertir el pure sobre la masa",
                        "Agregar el queso y los ingredientes",
                        "Poner al horno en 180º durante 25 min"))
        );

        //Crear un recetario
        //Guardar las recetas en el recetario
        Recetario miRecetario = new Recetario(
                new ArrayList<>(Arrays.asList(pizza)),
                "Alex",
                "Recetas caseras"
        );

        //Mostrar las opciones que el usuario tiene

        System.out.println("Bienvenido, elige una opción");
        System.out.println("1.- Agregar un ingrediente nuevo");
        System.out.println("2.- Agregar una receta nueva");
        System.out.println("3.- Ver el recetario");

        Scanner leer = new Scanner(System.in);
        int respuesta = 0;
        respuesta = leer.nextInt();

        switch (respuesta){
            case 1:
                Ingredientes nuevo = new Ingredientes();
                System.out.println("Ingrese el nombre del ingrediente");
                nuevo.setNombre(leer.next());
                System.out.println("Ingrese la cantidad");
                nuevo.setCantidad(leer.nextDouble());
                System.out.println("¿Tú ingrediente es salado?  1.-SI \t 2.-NO");
                if (leer.nextInt()==1) {
                    nuevo.setSalado(true);
                }else {
                    nuevo.setSalado(false);
                }
                System.out.println("Ingrediente creado");
                ingredientesDisp.add(nuevo);
                break;
            case 2:
                Receta nueva = new Receta();
                System.out.println("Ingrese el nombre de la receta");
                nueva.setNombre(leer.next());
                System.out.println("Ingrese el tiempo de preparación");
                nueva.setTiempoPreparacion(leer.nextDouble());
                System.out.println("Los ingredientes disponibles son;");
                for (int i = 0; i < ingredientesDisp.size() ; i++) {
                    System.out.println(i+1 + ". " + ingredientesDisp.get(i));

                }
                break;
            case 3:
                break;

        }





    }
}
