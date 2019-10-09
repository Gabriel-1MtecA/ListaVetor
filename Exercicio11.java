import java.util.Scanner;
public class Exercicio11{
	public static void main (String args[]) {
		Scanner in= new Scanner (System.in);
		int i,v;
		int []va= new int [10];
		for (i=0;i<10;i++) {
			System.out.println("Digite o º"+(i+1)+" valor");
			va[i]= in.nextInt();
		}
		System.out.println(" Digite o valor que será pesquisado");
		v= in.nextInt();
		for(i=0;i<10;i++) {
			if(va[i]==v) {
				System.out.println(" Esse valor ("+v+") está armazenado no vetor A, posição "+(i+1));
				i=i+10;
			}
			else {
				System.out.println(" Esse valor não foi encontrado na posição "+(i+1));
			}
			
			}
				
			}
				
			
			
		}
	
