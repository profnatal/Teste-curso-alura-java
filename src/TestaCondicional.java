
public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("testando concicionais");
		int idade = 19;
		int quantidadePessoas = 3;
		
		if(idade >= 18) {
		System.out.println("Você já é de maior e pode entrar");
		
		}
		else {
			if(quantidadePessoas >=2) {
				System.out.println("Você não é de maior mas pode entrar");
				
			} else {
			System.out.println("Você não é de maior");
			
			}
		}
		
	}

}
