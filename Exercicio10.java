import java.util.Scanner;
public class Exercicio10{
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int i;
		int[]va = new int[10];
		int[]vb = new int[10];
		int[]vc = new int[10];
	
	for(i=0;i<10;i++) {
		System.out.println("Digite o valor "+(i+1)+" do vetor A");
		va[i]= in.nextInt();
	}
	for(i=0;i<10;i++) {
		System.out.println("Digite o valor "+(i+1)+" do vetor B");
		vb[i]= in.nextInt();
	}
	for(i=0;i<10;i++) {
		if(va[i]!=vb[0] && va[i]!=vb[1] && va[i]!=vb[2] && va[i]!=vb[3] && va[i]!=vb[4] && va[i]!=vb[5] && va[i]!=vb[6] && va[i]!=vb[7] && va[i]!=vb[8] && va[i]!=vb[9]) {
			vc[i]=va[i];
			System.out.println("Diferença: "+vc[i]);
		}else {
			vc[i]=0;
		}
	  
	
	}
}
}