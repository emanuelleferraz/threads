package questao02;
public class TesteThread {

    public static void main(String[] args) throws InterruptedException {

        Contador c = new Contador(0);
        ThreadIncremento t1 = new ThreadIncremento(c);
        ThreadIncremento t2 = new ThreadIncremento(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        ThreadDecremento t3 = new ThreadDecremento(c);
        ThreadDecremento t4 = new ThreadDecremento(c);
        
        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println(("Resultado do valor final do Contador: " + c.getVarCont()));
    }
    
}
