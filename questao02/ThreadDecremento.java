package questao02;
public class ThreadDecremento extends Thread {
    private Contador var;
    private int cont;

    public ThreadDecremento(Contador var){
        this.var = var;
    }

    public void run(){
        for(int i = 0; i < 1000; i++){
            var.Decremento();
            cont++;
        }
    }

    public int getCont(){
        return this.cont;
    }
}
