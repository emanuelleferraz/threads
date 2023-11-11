package questao01;
public class Mediana extends Thread {
	  
	private int v[];
	private double mediana;
	
	public Mediana (int v[]) {
		this.v = v;
	}
	
	public void run() {
		
		int esquerda = 0;
		int direita = v.length - 1;
		int meio = (esquerda + direita)/2;
		setMediana(v[meio]);
	}

	public double getMediana() {
		return mediana;
	}

	public void setMediana(double mediana) {
		this.mediana = mediana;
	}

}
