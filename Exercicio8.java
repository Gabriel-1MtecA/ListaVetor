import java.util.Scanner;
public class Exercicio8 {
	public static void main(String[] args) {
		int[]va= new int[10];
		int[]vb= new int[10];
		Scanner in= new Scanner(System.in);
		int i=0, j=0, n, o;
		for (i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"° valor:");
			va[i]=in.nextInt();}
		for (i=0;i<10;i++) {
			for (j=9;j>=i;j--) {
				o=0;
				n=o;
				while (o<=va[j]) {
					n+=o;
					o++;}
				vb[i]=n;}}
		for (i=0;i<10;i++) System.out.print(va[i]+" | ");
		System.out.println("");
		for (i=0;i<10;i++) System.out.print(vb[i]+" | ");
	}
	
}