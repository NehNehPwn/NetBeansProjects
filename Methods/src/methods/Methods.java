/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import hsa.Console;
import java.awt.*;
import java.io.*;

/**
 *
 * @author NehNe
 */
public class Methods {
    
    static Console c = new Console ();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
       //System.out.println (reverse ("dog") ); 
       //System.out.println (searchAndReplace ("happy", 'p', 'r') );
       //System.out.println (sumOfNumbersBetween (2,7) );
       //System.out.println (areaCircle (4) );
       //drawHappyFace (200, 50);
       HelpingBIlly.billyhelp ();
        
    }
    
    public static String reverse (String input)
    {
        String output = "";
        
        for (int i = input.length () - 1; i >= 0; i--)
        {
            output += input.charAt (i);
        }
        
        return (output);
    }
    
    public static String searchAndReplace (String input, char find, char replace)
    {
        String output = "";
        
        for (int i = 0; i < input.length (); i++)
        {
            if (input.charAt (i) == find)
            {
                output += replace;
            }
            
            else
            {
                output += input.charAt (i);
            }
        }
        
        return (output);
    }
    
    public static int sumOfNumbersBetween (int num1, int num2)
    {
        int sum = 0;
        if (num1 > num2)
        {
            for (int i = num2; i <=  num1; i++)
            {
                sum +=i;
            }
        }
        else
        {
            for (int i = num1; i <= num2; i++)
            {
                sum += i;
            }
        }
        
        return (sum);
    }
    
    public static double areaCircle (int r)
    {
        double area = Math.PI * (r*r);
        return (area);
    }
    
    public static void drawHappyFace (int x, int y)
    {
        c.setColor (Color.black);
        c.drawOval (x, y, 100, 100);
        c.fillOval (x + 20, y + 20, 20, 20);
        c.fillOval (x + 60, y + 20, 20, 20);
        c.fillArc (x + 20, y + 60, 60, 20, 60, 60);
    }
    
}
