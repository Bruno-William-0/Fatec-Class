/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.i;

/**
 *
 * @author Bruno WIlliam
 */
public class Exemplo01 {
    public static void main(String[] args)
    {
        System.out.println("Nem todo gás mata");
        
        double d = 12.543654;
        int v = (int)d;//conversão manual
        
        float f = 5.6f;//o f indica que realmente é um float 
        byte b = (byte)f;
        
        String s="100";
        int a = Integer.parseInt(s);
        float c = Float .parseFloat(s);
        double e = Double.parseDouble(s);
        
        String[] p = {"5", "3"};
        String[] i = new String[2];
        i[0] = "5";
        i[1] = "3";
        
        
    }
    
    
}
