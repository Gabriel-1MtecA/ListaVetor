import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		int[] rA= new int[20];
		int[] rB= new int[20];
		int i=0,a=19, s=0;
		Scanner in= new Scanner(System.in);
		for (i=0;i<20;i++) {
			System.out.println("Digite o valor "+(i+1)+" :");
			rA[i]= in.nextInt();
		}
		for (i=0;i<20;i++) {
			if (rA[i]%2==0) {
				rB[s]= rA[i];
				s++;
				System.out.println(rA[i]+" é par");
				System.out.println("");
			} else {
				rB[a]= rA[i];
				a--;
				System.out.println(rA[i]+" é impar");
				System.out.println("");
			}
		}
	}
}
