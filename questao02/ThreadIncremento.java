package questao02;
public class ThreadIncremento extends Thread {

    private Contador var;
    private int cont;

    public ThreadIncremento(Contador var){
        this.var = var;
    }

    public void run(){
        for(int i = 0; i < 1000; i++){
            var.Incremento();
            cont++;
        }
    }

    public int getCont(){
        return this.cont;
    }
}
