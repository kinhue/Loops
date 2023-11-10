package atividadeLoops;
import java.util.Scanner;
public class Lista3_Ex6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int x,contador=0,total=0;
		float media=0;
		
		
			
		do {
			
    		System.out.println("Digite um número inteiro:");
			x= leia.nextInt();
			if (x % 3 == 0 && x != 0) {
				contador++;
				total+=x;				
			}					
						 
			 
    	}while(x != 0);
		media = (float)total/contador;
		System.out.println("A média de todos os números múltiplos de 3 é: "+media);
		
		    
			
			
			
		
		
		

	}

}
