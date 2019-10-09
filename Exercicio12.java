import java.util.Scanner;
public class Exercicio12 {
	public static void main(String[] args) {
		int C=0, i, j=0;
			int va[]= new int[10];
			int vb[]= new int[10];
			int a, b;
			Scanner in= new Scanner(System.in);
			for (i=0;i<10;i++) {
				System.out.println("Digite o "+(i+1)+"° valor:");
				va[i]=in.nextInt();
			}
			a=0;
			b=9;
			for (i=0; i<10; i++) {
				if (va[a]==va[b]) {
					vb[i]=va[a];
					j++;
					if(va[4]==va[5]) {
					for(i=0;i<1;i++) {
					System.out.print("Esse vetor é um palíndromo");
					i=10;}
				}
				a++;
				b--;
			}
			if (j==0) { System.out.println("esse vetor não é palíndromo"); j=20;}
	}
}}