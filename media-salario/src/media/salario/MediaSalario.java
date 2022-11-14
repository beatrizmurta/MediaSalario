/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package media.salario;
import java.util.Scanner;

/**
 *
 * @author Beatriz Murta
 */
public class MediaSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner ler = new Scanner (System.in);
        float salario, media, soma;
        int quantidade, cont;
        
        soma = 0;
        cont = 0;
        
        System.out.println("Com quantas pessoas você gostaria de fazer a média salarial? ");
        quantidade = ler.nextInt();
        
        while (cont < quantidade){
            System.out.println("Qual o valor do salario? ");
            salario = ler.nextFloat();
            
            soma+=salario;
            cont++;
        }
        
        media = soma / cont;
        System.out.println("A média salarial é: " +media);
    }
    
}
