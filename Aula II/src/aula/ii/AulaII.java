/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula.ii;
import java.util.Scanner;
/**
 *
 * @author Bruno WIlliam
 */
public class AulaII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a largura");
        int largura = sc.nextInt();
        System.out.println("Entre com o comprimento");
        int comprimento = sc.nextInt();
        int area = largura * comprimento;
        System.out.println("Area:" + area);
    }
    
}
