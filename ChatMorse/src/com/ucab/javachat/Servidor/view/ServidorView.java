package com.ucab.javachat.Servidor.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Clase encargada de cargar componentes visuales de la ventana 
 * @author Grupo 3
 */


@SuppressWarnings("serial")
public class ServidorView extends JFrame
{
   public JTextArea txaMostrar;
   public ServidorView()
   {
      super("Consola servidor");
      txaMostrar=new JTextArea();      
    
      this.setContentPane(new JScrollPane(txaMostrar));
      setSize(350,350);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }
}