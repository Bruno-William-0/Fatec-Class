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
public class ExemploIII {
    public static void exemploIII()
    {
         String s = JOptionPane.showInputDialog("Nota1?");
        if(s!=null)
        {
            float n1 = Float.parseFloat(s);
            s = JOptionPane.showInputDialog("Nota2");
            if(s!=null)
            {
             float n2 = Float.parseFloat(s);   
             JOptionPane.showMessageDialog(null, "A média é:" +(n1+n2)/2);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Cancelar foi pressionado");
            }
        }
        else
        {    
            JOptionPane.showMessageDialog(null, "Cancelar foi pressionado");
        }
    }
}
