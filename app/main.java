package app;

import java.util.ArrayList;

import Publicaciones.Post;
import Publicaciones.Publicacion;
import Publicaciones.Story;
import Usuarios.Cuenta;
import Usuarios.Pagina;
import Usuarios.Usuario;
import interfaces.Reportable;

public class main {

    public static void main(String[] args) {

        // Dos publicaciones
        Post post = new Post(
                1,
                "juanp",
                "Terminamos la Copa Fatima con dos goles",
                "2026-08-14",
                "cancha.jpg"
        );

        Story story = new Story(
                2,
                "juanp",
                "Yendo a entrenar",
                "2026-09-09",
                20
        );

        // Dos usuarios
        Cuenta cuenta = new Cuenta(
                "juanp",
                "juanp@mail.com",
                "2023-02-11",
                false,
                "Juan Perez",
                245
        );

        Pagina pagina = new Pagina(
                "fatimatec",
                "info@fatima.edu.ar",
                "2019-05-01",
                true,
                "Instituto Fatima",
                3100,
                "Educacion"
        );

        // Lista de publicaciones
        ArrayList<Publicacion> publicaciones = new ArrayList<>();

        publicaciones.add(post);
        publicaciones.add(story);

        // Lista de usuarios
        ArrayList<Usuario> usuarios = new ArrayList<>();

        usuarios.add(cuenta);
        usuarios.add(pagina);

        // Mostrar publicaciones
        System.out.println("=== PUBLICACIONES ===");

        for (Publicacion p : publicaciones) {
            p.mostrar();
            System.out.println();
        }

        // Mostrar usuarios
        System.out.println("=== USUARIOS ===");

        for (Usuario u : usuarios) {
            u.mostrarPerfil();
            System.out.println();
        }

        // Lista única de elementos reportables
        System.out.println("=== REPORTES ===");

        ArrayList<Reportable> reportes = new ArrayList<>();

        reportes.add(post);
        reportes.add(story);
        reportes.add(cuenta);
        reportes.add(pagina);

        for (Reportable r : reportes) {
            r.reportar();
        }

       
    }
}
