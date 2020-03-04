package fai.projeto03;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		 Main app = new Main();
		 app.comparacaodeidade();
	}
	private void comparacaodeidade()
    {
     
	   Scanner ler = new Scanner(System.in);
	
	   System.out.println("Entre com sua idade");
	   int idade = ler.nextInt();
	
	  if (idade > 20) {
		System.out.println("Idade maior que 20 ");
		
	   }else if (idade > 11 && idade  <18) {
		   System.out.println("Idade maior que 12 e menor que 17");
		   
	   }  else if (idade < 5 || idade == 7) {
		   System.out.println("Idade igual a 7 OU menor que 5");
		   
	   }else if (idade  ==5 || idade == 6 || idade ==8 ||idade  ==9 || idade == 10 || idade ==11 || idade ==18 || idade ==19) {
		   System.out.println("Outras combinações");
	   
	   }
	     
	
    }
}
