import java.util.Scanner;
public class Exercicio3{
	public static void main (String args[]) {
		int vA[] = new int [10];
		int i=0;
		Scanner in= new Scanner(System.in);
		for (i=0;i<10;i++) {
		System.out.println("Digite o valor "+(i+1)+ " :");
		vA[i]= in.nextInt();
		}
		for (i=0;i<10;i++) {
			if (vA[i]%2==0) {
				System.out.println(vA[i]+" é primo");
			}else {
				System.out.println(vA[i]+" não é primo");
			}
		}
	}
}