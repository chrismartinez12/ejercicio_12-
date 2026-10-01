package Publicaciones;

import Publicaciones.Publicacion;

import interfaces.Reportable;

// implements Reportable
// OJO: las stories NO son Comentable. Se responden por mensaje directo,
// no por comentario debajo. No le agregues Comentable.
public class Story extends Publicacion implements Reportable{

    private int horasRestantes;

    public Story(int id, String autor, String contenido, String fechaCreacion,
                 int horasRestantes) {
        super(id, autor, contenido, fechaCreacion);
        this.horasRestantes = horasRestantes;
    }

    @Override
    public void mostrar() {
        System.out.println("[STORY #" + getId() + "] @" + getAutor()
                + " - expira en " + horasRestantes + " hs");
        System.out.println("  " + getContenido());
    }

    public int getHorasRestantes() { return horasRestantes; }
    public void setHorasRestantes(int horasRestantes) { this.horasRestantes = horasRestantes; }

    
    // aca van los metodos de Reportable
	public void motivo() {
		System.out.println("no me interesa esta story");
		
		
	}
	public void reportar() {
		System.out.println("==== reporte ===="); 
		System.out.println("motivo: " );motivo();
	}
}
