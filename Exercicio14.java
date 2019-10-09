import java.util.Scanner;
public class Exercicio14{
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
        int i;
        int[]va = new int [10];
        int[]vb = new int [10];
        int[]vc = new int [10];
        for(i=0;i<10;i++) {
        	System.out.println(" Digite o "+(i+1)+"º do vetor A");
        	va[i]=in.nextInt();
        }
        for(i=0;i<10;i++) {
        	System.out.println(" Digite o "+(i+1)+"º do vetor B");
        	vb[i]=in.nextInt();
        }
        for(i=0;i<10;i++) {
        	if (va[i]>vb[i]) {
        		vc[i]=1;
        	}
        	else if(va[i]==vb[i]) {
        		vc[i]=0;
        	}
        	else if(va[i]<vb[i]) {
        		vc[i]=-1;
        	}
        }
        System.out.println(" Valores do vetor c :");
        for(i=0;i<10;i++) {
        	System.out.println(vc[i]+" |");	
        }
 

	}
}