/*Uma granja possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel
 com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip 
 custa R$ 4,00 e o anel de alimento custa R$ 3,50, faça um programa para calcular o gasto 
total da granja para marcar todos os seus frangos. 
Entradas:
-total de frangos
Metodo:
(total de frangos *4)+ (total de frangos * 7)
 */
import java.util.Scanner;

public class Uni3Exe05 {
public static void main(String[]args){
Scanner teclado= new Scanner(System.in);

//Entradas
System.out.println("total de frangos na Granja São Jose");
int totalfrag= teclado.nextInt();


//Processo

int valortotal= (totalfrag * 4)+ (totalfrag * 7);


//Saidas

System.out.println("o total gasto com os chips e : " + valortotal + " Reais");

teclado.close();

}

    
}
