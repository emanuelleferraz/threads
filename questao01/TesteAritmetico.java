package questao01;
public class TesteAritmetico {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Média
		int v[] = new int[10];
		
		
		for(int i = 0; i < 10; i++) {
			v[i] = i + 1;
		}
		
		Media m = new Media(v, 0, (v.length /2) - 1);
		Media m2 = new Media(v, v.length/2, v.length -1);
		
		m.start();
		m2.start();
		m.join();
		m2.join();
		
		double media = m.getMedia() + m2.getMedia();
		System.out.println("Média: " + media);

		//Mediana

		int vet[] = new int[7];

		for(int j = 0; j < 7; j++) {
			vet[j]+=j;
		}
		
		Mediana md = new Mediana(vet);
		
		md.start();
		md.join();
		double mediana = md.getMediana();
		System.out.println("Mediana: " + mediana);
		
	}

}
