public class MensajeConfA├▒adirPeli extends Mensaje{
    Pelicula pelicula;

    public MensajeConfA├▒adirPeli(String origen, String destino, Pelicula pelicula)
    {
        super(11, origen, destino);
        this.pelicula = pelicula;
    }

    public Pelicula getPelicula(){
        return pelicula;
    }
}
