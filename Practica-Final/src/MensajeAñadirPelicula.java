public class MensajeAĆ±adirPelicula extends Mensaje{
    private Pelicula pelicula;

    public MensajeAĆ±adirPelicula(String usuario, String destino, Pelicula pelicula)
    {
        super(10, usuario, destino);
        this.pelicula = pelicula;
    }

    public Pelicula getPelicula(){
        return pelicula;
    }
}
