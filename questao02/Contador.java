package questao02;
public class Contador {
	
	private int varCont;
	
	public Contador(int varCont) {
		this.varCont = 0;
	}

	public void Incremento(){
		this.varCont = varCont + 1;
	}

	public void Decremento(){
		this.varCont = varCont - 1;
	}

	public int getVarCont(){
		return this.varCont;
	}
	

}
