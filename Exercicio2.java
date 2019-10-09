import java.util.Scanner;
public class Exercicio2{
	public static void main (String args[]) {
		int [] vA= new int [5];
		int i=0,n=0;
		Scanner in = new Scanner (System.in);
		for (i=0;i<5;i++) {
			System.out.println("Digite o valor "+(i+1)+" :");
			vA[i]= in.nextInt();
		}
		for (i=0;i<5;i++) {
			for (n=0;n<11;n++) {
				System.out.println(vA[i]+" x "+n+ " = "+vA[i]*n);
			}
			System.out.println("");

			
		}
}

}