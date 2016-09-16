/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miventana;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author rmonclus
 */
public class MiVentana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Hola mundo");
        ventana.setVisible(true);// TODO code application logic here
        ventana.setSize(200,300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ventana.setTitle("Hola mundo");
        ventana.getContentPane().setLayout(new BorderLayout());
        //ventana.getContentPane().add(new JButton("Aceptar"));
        
        /*for (int i = 0; i < 30; i++)
            ventana.getContentPane().add(new JButton("Cancelar " + i));
    */
        
        ventana.getContentPane().add(new JLabel("Arriba"), BorderLayout.NORTH);
        ventana.getContentPane().add(new JLabel("Abajo"), BorderLayout.SOUTH);
        ventana.getContentPane().add(new JButton("Izda"), BorderLayout.WEST);
        ventana.getContentPane().add(new JButton("Dcha"), BorderLayout.EAST);
        JTextField campo = new JTextField("Centro");
        ventana.getContentPane().add(campo, BorderLayout.CENTER);
        
        JLabel etiqueta = new JLabel("Arriba");
        
        ventana.pack();
        
    }

}
