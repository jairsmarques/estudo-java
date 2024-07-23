
public class OperadorIncremento {

	public static void main(String[] args) {
		int totalDownloads = 10;
		
		//totalDownloads = totalDownloads + 1;
		//totalDownloads += 1;
		//totalDownloads++;//pós fixada
		
		//int novoTotalDownloads = totalDownloads++;
		int novoTotalDownloads = ++totalDownloads;//pré fixada
		
		System.out.println(totalDownloads);
		System.out.println("Novo total de downloads " + novoTotalDownloads);

	}

}
