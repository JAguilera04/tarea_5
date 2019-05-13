package model.Datos;
import model.Gestor.Gestor;


public class Datos
{
	private String Titulo;
	private String Artista;
	private String Album;
	private String A�o;
	private int Codigo;
        private String Letra;
        
        public Datos(int codigo, String nombre, String artista, String album, String a�o, String letra) {
            this.Codigo = codigo;
            this.Titulo = nombre;
            this.Artista = artista;
            this.Album = album;
            this.A�o = a�o;
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

	public String getA�o() {
		return A�o;
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
	public void setA�o(String a�o) {
		this.A�o = a�o;
	}

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    @Override
    public String toString() {
        return "Datos{" + "Titulo=" + Titulo + ", Artista=" + Artista + ", Album=" + Album + ", A\u00f1o=" + A�o + ", Codigo=" + Codigo + ", Letra=" + Letra + '}';
    }
        

}

