package atividadeLoops;
import java.util.Scanner;
public class Lista2_Ex4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int idade, genere,area,numPessoas=0,numCisTransMulher=0,numCisTransHomem=0,numBackend=0,numNaoBinarioFullstack=0;
		float mediaIdade=0;
		String continua = "s";
		
		
		while (!continua.equals("n")) {
			
			
		System.out.println("Qual sua idade?");
		idade=leia.nextInt();
		mediaIdade+=idade;
		numPessoas++;
	    
		System.out.println("Com qual gênero você se identifica?");
		System.out.println("\n1- Mulher Cis ");
		System.out.println("\n2- Homem Cis ");
		System.out.println("\n3- Não Binário ");
		System.out.println("\n4- Mulher Trans");
		System.out.println("\n5- Homem Trans");
		System.out.println("\n6- Outros");
		genere=leia.nextInt();
		
		System.out.println("Qual sua área");
		System.out.println("\n1- Backend");
		System.out.println("\n2- Frontend");
		System.out.println("\n3- Mobile");
		System.out.println("\n4- FullStack");
		area=leia.nextInt();
		
		if (area == 1) {
			numBackend ++;
		}
		if ((genere == 1 || genere == 4) && area == 2) {
			numCisTransMulher++;
			
		}if ((genere == 2 || genere == 5) && area == 3 && idade > 40) {
			numCisTransHomem++;
		}
		if (genere == 3 && area == 4 && idade <30) {
			numNaoBinarioFullstack++;
		}
		
		System.out.println("Deseja colocar outro colaboradore?");
		continua=leia.next();
		if(continua.equals("s")) {
			System.out.println("Insira os dados de outro colaborador");
			
		}else {		
				
			mediaIdade=(float)mediaIdade/numPessoas;	
			System.out.println("\nO número de pessoas desenvolvedoras Backend: "+numBackend+
							"\nO número de Mulheres Cis e Trans desenvolvedoras Frontend:"+numCisTransMulher+
							"\nO número de homem Cis e Trans Mobile com mais de 40 é de: "+numCisTransHomem+
							"\nO número de Não Binários desenvolvedores FullStack menores de 30 anos: "+numNaoBinarioFullstack+
							"\nO número total de pessoas que responderam à pesquisa: "+numPessoas+
							"\nA média de idade das pessoas que responderam à pesquisa: "+mediaIdade);
			
			
		}
		}
		}

}
