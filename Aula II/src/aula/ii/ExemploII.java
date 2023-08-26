/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.ii;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno WIlliam
 */
public class ExemploII {
    
    public static void exemploii()
    {
     String s = JOptionPane.showInputDialog("Entre com a largura");
    int largura = Integer.parseInt(s);
    int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Entre com a largura"));
    double area = largura * comprimento;
    JOptionPane.showMessageDialog(null, area);
    }
}
