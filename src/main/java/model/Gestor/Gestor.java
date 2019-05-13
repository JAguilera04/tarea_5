
package model.Gestor;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import model.Datos.Datos;
/**
 * juan aguilera
 * 
 * @generated
 */

public class Gestor{
    private ArrayList<Datos> canciones;
    public Gestor(){
        canciones = new ArrayList();
        canciones.add(new Datos(1,"Put You on the Game","The Game","The Documentary","2005",leerArchivo("put_you_on_the_game.txt")));
        canciones.add(new Datos(2,"Dreams","The Game","The Documentary","2005",leerArchivo("dreams.txt")));
        canciones.add(new Datos(3,"Space Bound","Eminem","Recovery","2010",leerArchivo("space_bound.txt")));
        canciones.add(new Datos(4,"Maquiavelico","Canserbero","Merte","2012",leerArchivo("maquavelico.txt")));
        menu();
    }
	public void Menu(String archivo) {
		// TODO implement me
	}
	public String leerArchivo(String nombre) {
        Path archivo = Paths.get(nombre);
        String Contenido = "";
        try {
            Contenido = new String(Files.readAllBytes(archivo));
            return Contenido;
        } catch (Exception e) {
            System.out.println("No se pudo leer el archivo.");
            return "";
        }
	}
        public String leerString(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
        }
	public void agregaCancion() {
            Scanner entrada = new Scanner(System.in);
            int codigo=canciones.size()+1;
            System.out.println("Ingrese nombre de la canción");
            String nombre=leerString();
            System.out.println("Ingrese nombre del artista");
            String artista=leerString();
            System.out.println("Ingrese album de la canción");
            String album=leerString();
            System.out.println("Ingrese el año de la canción");
            String año=entrada.nextLine();
            System.out.println("Ingrese la ruta del archivo con la letra de la canción");
            String letra=entrada.nextLine(); 
            canciones.add(new Datos(codigo,nombre,artista,album,año,letra));
	}	
	public void quitarCacion(String quitar) {
            int posicion=0;
            for(int i=0;i<canciones.size();i++){
                if(quitar.equals(canciones.get(i).getTitulo())){ 
                posicion=i;
            }
            }
            canciones.remove(posicion);
	}
	public void mostrarCancion(String titulo) {
            int posicion=0;
            for(int i=0;i<canciones.size();i++){
                if(titulo.equals(canciones.get(i).getTitulo())){ 
                posicion=i;
            }  
            }
            System.out.println(canciones.get(posicion).toString());
	}
        public void mostrarletra(String titulo){
            int posicion=0;
            for(int i=0;i<canciones.size();i++){
                if(titulo.equals(canciones.get(i).getLetra())){ 
                posicion=i;
            }
            }
            System.out.println(canciones.get(posicion).toString());
            
        }
        
        public void menu(){
        Scanner entrada = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Eliga una opción");
        System.out.println("1.Mostrar canción");
        System.out.println("2.Añadir canción");
        System.out.println("3.Eliminar canción");
        System.out.println("4.Salir");
        int numero = entrada.nextInt();
        switch(numero){
            case 1:
                System.out.println("ingrese cancion que de sea ver");
                String titulo = entrada.nextLine();
                mostrarCancion(titulo);
                menu();
                break;
            case 2:
                agregaCancion();
                menu();
                break;
            case 3:
                System.out.println("Ingrese el nombre de la cancion a eliminar");
                String eliminacion=entrada.nextLine();
                quitarCacion(eliminacion);
                menu();
                break;
            case 4:
                break;
            default:
                menu();
                break;
                
        }
        }
}

