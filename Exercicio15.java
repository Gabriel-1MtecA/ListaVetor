import java.util.Scanner;
public class Exercicio15 {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int A[]= new int[10];
		int B[]= new int[10];
		int C[]= new int[10];
		int i=0, j=0, d;
		for (i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"° valor:");
			A[i]= in.nextInt();
		}
		
		for (i=0;i<10;i++) {
			d=0;
			for(j=0;j<10;j++) {
				if (A[i]>A[j]) d++;
			}
			B[d]= A[i];
		}
		for (i=0;i<10;i++) {
			d=0;
			for(j=0;j<10;j++) {
				if (A[i]<A[j]) d++;
			}
			C[d]= A[i];
		}
		System.out.println("Vetor b :");
		for (i=0;i<10;i++) {
			System.out.print(B[i]+" 	");
			}
		System.out.println(" ");
		System.out.println("Vetor c : ");
		for (i=0;i<10;i++) {
			System.out.print(C[i]+" 	");
		}
	}
}
