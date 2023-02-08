package resolucaodatela;

//import java.awt.Dimension; 

//import java.awt.Toolkit; 

import java.awt.*; 

public class ResolucaoDaTela { 

  

    public static void main(String[] args) { 

         

        Toolkit tk = Toolkit.getDefaultToolkit(); 

        Dimension d = tk.getScreenSize(); 

        System.out.println("Resoluçao da tela"); 

        System.out.println(d.height + " x " + d.width ); 

    } 

} 
