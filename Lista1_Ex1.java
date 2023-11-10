package atividadeLoops;
import java.util.Scanner;
public class Lista1_Ex1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int x,y,intervalo;
		
		System.out.println("Escolha o primeiro número inteiro do seu intervalo:");
		x= leia.nextInt();
		System.out.println("Escolha o último número inteiro do seu intervalo:");
		y= leia.nextInt();		
		
		if(x>y) {
			System.out.println("Valores inválidos. O seu primeiro número deve ser menor que o segundo.");
			
		}else {
			
		for (intervalo=x; intervalo<=y; intervalo++) {
			
			
			if (intervalo % 3  == 0 && intervalo % 5 == 0 ) {
				System.out.println(intervalo+" É múltiplo de 3 e de 5");
			}
			
				
			}
		}
	}

}
