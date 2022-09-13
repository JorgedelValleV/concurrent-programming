//David Seijas Pérez
//Jorge del Valle Vázquez

package Practica4b;

public class miAlmacen implements Almacen
{
    private Producto producto[];
    private volatile int ini;
    private volatile int fin;

    public miAlmacen(int n)
    {   
        this.producto = new Producto[n];
        this.ini = 0;
        this.fin = 0;
    }

    public void almacenar(Producto producto)
    {
        this.producto[fin] = producto;
        fin = (fin + 1) % (this.producto.length);
    }

    public Producto extraer()
    {   
        Producto producto = this.producto[ini];
        ini = (ini + 1) % (this.producto.length);
        return producto;
    }
}
