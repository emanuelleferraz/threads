package questao01;
public class Media extends Thread {
	
	private int v[];
	private double media;
	private int ini;
	private int fim;
	private int resultado;
	
	public Media(int v[], int ini, int fim) {
		this.v = v;
		this.ini = ini;
		this.fim = fim;
		
	}
	
	public void run() {
		for(int i = ini; i <= fim; i++) {
			resultado += v[i];
			setMedia(resultado/(double)v.length);
		}
		
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

}
