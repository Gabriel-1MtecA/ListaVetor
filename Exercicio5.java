import java.util.Scanner;
public class Exercicio5 {
	public static void main (String args[]) {
		Scanner in= new Scanner (System.in);
		int [] vA=new int [10];
		int i=0,n=0;
		for (i=0;i<10;i++) {
			System.out.println(" Digite o valor "+(i+1));
			vA[i]= in.nextInt();
		}
		for (i=0;i<10;i++) {
			System.out.println(" Todos os divisores de "+vA[i]+" :");
			for (n=1;n<=vA[i];n++) {
				if (vA[i]%n==0) {
					System.out.println(n);
				}
			}
		}
		
	}
}
