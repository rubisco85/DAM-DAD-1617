/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.pkg01.interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author profesor
 */
public class Ventana extends JFrame {

    public Ventana() {

        setTitle("Mi primera ventana");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     /*   getContentPane().setLayout(new FlowLayout());
        for (int i = 0; i < 50; i++)
            getContentPane().add(new JButton("Botón " + i));*/
     
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(new JButton("BorderLayout.NORTH"),BorderLayout.NORTH);
        getContentPane().add(new JButton("BorderLayout.SOUTH"),BorderLayout.SOUTH);
        getContentPane().add(new JButton("BorderLayout.EAST"),BorderLayout.CENTER);
        getContentPane().add(new JButton("BorderLayout.WEST"),BorderLayout.WEST);
        getContentPane().add(new JButton("BorderLayout.CENTER"),BorderLayout.CENTER);
        

        pack();
        setSize(400, 500);

    }

}
