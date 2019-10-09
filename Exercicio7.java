import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		int[] va= new int[15];
		int[] vb= new int[15];
		int n, m, f=0;
		n= f;
		int i=0, j=0;
		for (i=0;i<15;i++) va[i]= i;
		for (j=0;j<15;j++) {
			f= va[j];
			n=f;
			f=1;
			while (n>1) {
				f= f*n;
				n--;
			}
			vb[j]=f;
		}
		for (i=0;i<15;i++) System.out.println((i)+"! = "+vb[i]);
	}
}
