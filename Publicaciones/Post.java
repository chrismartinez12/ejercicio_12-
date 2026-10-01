package Publicaciones;

import Publicaciones.Publicacion;

import interfaces.Comentable;
import interfaces.Reportable;

// implements Comentable, Reportable
public class Post extends Publicacion implements Comentable, Reportable {

    private String imagenUrl;

    public Post(int id, String autor, String contenido, String fechaCreacion,
                String imagenUrl) {
        super(id, autor, contenido, fechaCreacion);
        this.imagenUrl = imagenUrl;
    }

    @Override
    public void mostrar() {
        System.out.println("[POST #" + getId() + "] @" + getAutor()
                + " (" + getFechaCreacion() + ")");
        System.out.println("  " + getContenido());
        if (imagenUrl != null) System.out.println("  img: " + imagenUrl);
        System.out.println("  " + getLikes() + " likes");
    }

    public String getImagenUrl() { return imagenUrl; }
    public void setImagenUrl(String imagenUrl) { this.imagenUrl = imagenUrl; }

    // aca van los metodos de Comentable y Reportable
    
	public void motivo() {	
		System.out.println("no me gusta");	
	}
	
	public void autor() {
		System.out.println("henry el loco");		
	}
	
	public void texto() {
		System.out.println("hola, esto es un post que no me interesa");
	}
	public void reportar() {
		
		System.out.println("==== reporte ===="); 
		System.out.println("motivo: " );motivo();
		System.out.println("autor: " );autor();
		System.out.println("texto: " );texto();
	}
	
	}


