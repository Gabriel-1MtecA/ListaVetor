import java.util.Scanner;
public class Exercicio13{
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int i;
		int[]va = new int [10];
		int[]vb = new int [10];
		for(i=0;i<10;i++) {
			System.out.println(" Digite o valor "+(i+1));
			va[i]= in.nextInt();
		}
		for(i=0;i<10;i++) {
			if (va[i]%2==0) {
								vb[i]=vb[i]+1;
			}else {
				vb[i]=0;
				
			}
			}
		System.out.println(" ");
		System.out.println("Valores do vetor b :");
		for(i=0;i<10;i++) {
			System.out.println(vb[i]+"|");
			
		}
	}
}