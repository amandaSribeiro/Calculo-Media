import java.util.Scanner;

public class media {
 public static void main(String[] args) {
		float notaP1, notaP2, notaA1, notaP3, media, notaFinal;
		Scanner entrada = new Scanner(System.in);
		
		//COLETANDO AS NOTAS
		System.out.println("Informe a nota da P1: ");
		notaP1 = entrada.nextFloat();
		System.out.println("Informe a nota da P2: ");
		notaP2 = entrada.nextFloat();
		System.out.println("Informe a nota da A1: ");
		notaA1 = entrada.nextFloat();
		
		//CALCULANDO MÉDIA
		media = (notaP1 + notaP2 *2 + notaA1)/4;
		System.out.println("A média final é = " + media);
		
		if (media >=6 ) {
			System.out.println(" Aprovado! ");
			
		}
	
			
		else if(media <6 ){
			System.out.println(" Reprovado! ");
			
			//COLETANDO NOTA DA RECUPERAÇÃO
			Scanner entrada2 = new Scanner(System.in);
			System.out.println(" Inserir nota da Recuperação: ");
			notaP3 = entrada2.nextFloat();	
			
			//CALCULO FINAL
			notaFinal =(media + notaP3)/2;
 
			if (notaP3 >=6) {
				System.out.println("Aprovado!!");
			} 
			else {
				System.out.println("Reprovado de vez! ");
} 
			}
		
	}
}

    

