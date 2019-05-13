package model.Datos;
import model.Gestor.Gestor;


public class Datos
{
	private String Titulo;
	private String Artista;
	private String Album;
	private String Año;
	private int Codigo;
        private String Letra;
        
        public Datos(int codigo, String nombre, String artista, String album, String año, String letra) {
            this.Codigo = codigo;
            this.Titulo = nombre;
            this.Artista = artista;
            this.Album = album;
            this.Año = año;
            this.Letra=letra;
        }

	public int getCodigo() {
		return Codigo;
	}

	public String getTitulo() {
		return Titulo;
	}

	public String getArtista() {
		return Artista;
	}

	public String getAlbum() {
		return Album;
	}

	public String getAño() {
		return Año;
	}

	public void setCodigo(int codigo) {
		this.Codigo = codigo;
	}

	public void setTitulo(String titulo) {
		this.Titulo = titulo;
	}
	public void setArtista(String artista) {
		this.Artista= artista;
	}
	public void setAlbum(String album) {
		this.Album = album;
	}
	public void setAño(String año) {
		this.Año = año;
	}

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    @Override
    public String toString() {
        return "Datos{" + "Titulo=" + Titulo + ", Artista=" + Artista + ", Album=" + Album + ", A\u00f1o=" + Año + ", Codigo=" + Codigo + ", Letra=" + Letra + '}';
    }
        

}

