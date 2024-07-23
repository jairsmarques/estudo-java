
public class OperadorDecremento {

	public static void main(String[] args) {
		int limiteTentativsLogin = 10;
		
		//limiteTentativsLogin--;
		
		//int novoLimiteTentativaLogin = limiteTentativsLogin--; -> pós fixado
		int novoLimiteTentativaLogin = --limiteTentativsLogin;//pré fixado
		
		System.out.println("Limite de tentativas de login: " + limiteTentativsLogin);
		System.out.println("Novo limite de tentativas de login: " + novoLimiteTentativaLogin);
	}

}
