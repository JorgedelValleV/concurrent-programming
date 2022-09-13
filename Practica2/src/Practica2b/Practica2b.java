//David Seijas Pérez
//Jorge del Valle Vázquez

package Practica2b;


public class Practica2b
{
    public static void main(String[] args) 
    {
        int N = 5;
        int M = 5;

	    Thread threads[];
        threads = new Thread[2*M];
        Entero n = new Entero(0);
        LockRompeEmpate rompeEmpate = new LockRompeEmpate(2*M);
        LockTicket ticket = new LockTicket(2*M);
        LockBakery bakery = new LockBakery(2*M);

		for (int i = 0;  i < M; ++i)
        {
            threads[i] = new thIncrementa(N, i+1, n, rompeEmpate, ticket, bakery);
            threads[i].start();
        }
        for (int i = M;  i < 2*M; ++i)
        {
            threads[i] = new thDecrementa(N, i+1, n, rompeEmpate, ticket, bakery);
            threads[i].start();
        }

        try{
            for (int i = 0;  i < 2*M; ++i){
                threads[i].join();
            }
        }catch (InterruptedException e) {
			e.printStackTrace();
        }
		
		System.out.println("Han terminado todos los procesos. Valor final de n: " + n.getN());
	}
}