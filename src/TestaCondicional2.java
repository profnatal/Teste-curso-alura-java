public class TestaCondicional2 {
	
	public static void main(String[] args) {
		System.out.println("testando concicionais");
		int idade = 18;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if(idade >= 18 || quantidadePessoas >= 2) {
		System.out.println("Você já é de maior e pode entrar");
		
		if(idade >= 18 && quantidadePessoas >= 2) 
			System.out.println("Voce pode entrar");
	
			} 
		
		else {
			System.out.println("Você não é de maior");
			
			}
		int idade2 = 68;
		boolean ehIdoso = idade2 >= 65;
		
		System.out.println("valor ehIdoso");
		
		}
		
	}


