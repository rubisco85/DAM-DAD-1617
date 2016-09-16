/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.ejemplo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author profesor
 */
public class Ventana extends JFrame implements ActionListener {

    JButton boton1, boton2;
    JTabbedPane panel;

    public Ventana() {

        this.setTitle("Práctica 1");
        this.setVisible(true);

        panel = new JTabbedPane();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        boton1 = new JButton();
        boton2 = new JButton();

        boton1.addActionListener(this);
        boton2.addActionListener(this);

        boton1.setText("Inhabilitar");
        boton2.setText("Desbloqueado");

        panel1.add(boton1);
        panel2.add(boton2);

        panel.add(panel1, "Pestaña 1");
        panel.add(panel2, "Pestaña 2");

        this.add(panel);

        this.pack();
        this.setSize(300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            if (boton2.getText().equals("Desbloqueado")) {
                if (panel.isEnabledAt(1)) {
                    boton1.setText("Habilitar");
                    panel.setEnabledAt(1, false);
                } else {
                    boton1.setText("Inhabilitar");
                    panel.setEnabledAt(1, true);
                }
            }

        }
        if (e.getSource() == boton2) {
            if (boton2.getText().equals("Bloqueado"))
                boton2.setText("Desbloqueado");
            else
                boton2.setText("Bloqueado");

        }
    }

}
