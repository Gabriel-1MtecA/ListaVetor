import java.util.Scanner;
public class Exercicio6{
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		int[] va= new int[10];
		int[] vb= new int[10];
		int i=0, j=0;
		for (i=0;i<10;i++) {
			System.out.println(" Digite o valor "+(i+1));
			va[i]= in.nextInt();
			vb[i]=va[i];
		}
		for (i=0;i<10;i++) va[i]= (int) Math.pow(2, va[i]);
		for (j=0;j<10;j++) System.out.println("2 ^"+vb[j]+" = "+va[j]);
	}
}
