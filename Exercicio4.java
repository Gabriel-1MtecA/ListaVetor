import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		int []vA= new int [10];
		int i=0,n=0;
		Scanner in= new Scanner (System.in);
		for (i=0;i<10;i++) {
			System.out.println(" Digite o valor "+(i+1)+" : ");
			vA[i]= in.nextInt();
		}
		for (i=0;i<10;i++) {
			System.out.println(" Todos os Pares até "+vA[i]+" são :");
		for (n=0;n<=vA[i];n=n+2) {
			
			System.out.println(n);
		}}
		
		
		
	}}