package app;
import java.util.ArrayList;

import Publicaciones.Post;
import Publicaciones.Publicacion;
import Publicaciones.Story;
import Usuarios.Cuenta;
import Usuarios.Pagina;
import Usuarios.Usuario;
import interfaces.Reportable;
import interfaces.Comentable;

public class main {

    private static final boolean Comentable = false;

	public static void main(String[] args) {

        // Dos publicaciones
        Post post = new Post(1, "juanp", "Terminamos la Copa Fatima con dos goles",
                "2026-08-14", "cancha.jpg");
        Story story = new Story(2, "juanp", "Yendo a entrenar",
                "2026-09-09", 20);

        // Dos usuarios
        Cuenta cuenta = new Cuenta("juanp", "juanp@mail.com", "2023-02-11", false,
                "Juan Perez", 245);
        Pagina pagina = new Pagina("fatimatec", "info@fatima.edu.ar", "2019-05-01", true,
                "Instituto Fatima", 3100, "Educacion");

        // Cada familia por separado, sin necesidad de interfaces
        ArrayList<Publicacion> publicaciones = new ArrayList<>();
        publicaciones.add(post);
        publicaciones.add(story);

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(cuenta);
        usuarios.add(pagina);

        System.out.println("=== PUBLICACIONES ===");
        for (Publicacion p : publicaciones) {
            p.mostrar();
        }

        System.out.println("\n=== USUARIOS ===");
        for (Usuario u : usuarios) {
            u.mostrarPerfil();
        }
        
        ArrayList<Reportable> reportes = new ArrayList<>();
       
		reportes.add(post);
		reportes.add(story);
		reportes.add(cuenta);
		reportes.add(pagina); 	
		
		for(Reportable R : reportes ) {
			R.reportar();
		}
		   // Descomenta y anota el error del compilador:
         //  Esto da ERROR porque una lista de Publicacion
        //  solamente puede contener Publicacion y no va a recibir lo de cuenta ya que es de Usuario
		// ArrayList<Publicacion> reportes = new ArrayList<>();
        // reportes.add(cuenta);
         
    }
}