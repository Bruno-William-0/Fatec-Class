/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.ii;

/**
 *
 * @author Bruno WIlliam
 */
public class For {
    public static void main(String[] args)
            
    throws InterruptedException //necessário para o Thread funcionar corretamente {
    {
//    for(int a=1; a<=10; a++)
//    {
//     System.out.println(a); 
//     Thread.sleep(1000);
//    }
//    }

//for(char c='a'; c<='z'; c++)
//{
//    System.out.println(c);
//    Thread.sleep(1000);
//}

//cronometro em java
for(int h=0; h<24; h++)
{
  for(int m=0; m<60; m++){
   for(int s=0; s<60; s++)   
   {
    System.out.println(h+":"+m+":"+s);
    Thread.sleep(100);
    Math.max(0, 2);
    Math.random();
    
   }
  }
}

}
}
