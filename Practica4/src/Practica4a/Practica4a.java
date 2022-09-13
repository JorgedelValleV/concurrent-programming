//David Seijas Pérez
//Jorge del Valle Vázquez

package Practica4a;

public class Practica4a
{
    public static void main(String[] args) 
    {
        int N = 25;
        int M = 25;

	    Thread threadsI[], threadsD[];
        threadsI = new Thread[M];  
        threadsD = new Thread[M];  
        Entero n = new Entero(0);
        Monitor mon = new Monitor();

		for (int i = 0;  i < M; ++i)
        {
            threadsI[i] = new thIncrementa(N, i, n, mon); //pasamos el lock que queramos ejecutar en ese momento
            threadsI[i].start();
            threadsD[i] = new thDecrementa(N, i+M, n, mon);
            threadsD[i].start();
        }

        try{
            for (int i = 0;  i < M; ++i){
                threadsI[i].join();
                threadsD[i].join();
            }
        }catch (InterruptedException e) {
			e.printStackTrace();
        }
		
		System.out.println("Han terminado todos los procesos. Valor final de n: " + n.getN());
	}
}