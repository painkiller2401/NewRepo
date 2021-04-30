//Paquete principal que contiene la clase
package principal;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import objeto.Globo;

public class JugarGlobo extends JApplet implements ActionListener {

 private JButton agrandar, reducir;
 private Globo miGlobo;
 private Globo miGlobo2;
 int a;
 int b;
 int c;



 public void init() {
 getContentPane().setLayout(new FlowLayout ());  
 agrandar = new JButton ("Agrandar");
 add (agrandar);
 agrandar.addActionListener(this);

 reducir = new JButton ("Reducir");
 add (reducir);
 reducir.addActionListener(this);

 miGlobo = new Globo (20, 50, 50);
 miGlobo2 = new Globo (20, 50, 50);
 }
 public void actionPerformed(ActionEvent event) {
 if (event.getSource() == agrandar)
 {
    miGlobo.cambiarTamaño(10);
    if(a==2 && c==1)
    {
      miGlobo2.cambiarTamaño(10);
    }
    if(a==1)
    {
      miGlobo2.cambiarTamaño(0);
      a=2;
    }
    if(c==2)
    {
      miGlobo2.cambiarTamaño(-10); 
      c=1;
    }
    miGlobo.cambiarTamaño(10);
    b=2;
 }

 if (event.getSource() == reducir)
 {
    if(a==2&b==1)
    {
      miGlobo2.cambiarTamaño(-10);
    }
    if(a==1)
    {
      miGlobo2.cambiarTamaño(0);
      a = 2;
    }
    if(b==2)
    {
      miGlobo2.cambiarTamaño(10);
      b = 1;
    }
    miGlobo.cambiarTamaño(-10);
    c = 2;
 }

 repaint();
 }
 public void paint (Graphics g) {
 miGlobo2.mostrar2(g);
 miGlobo.mostrar(g);
 }

 public static void main (String Args[]){
 JFrame f = new JFrame("Applet desde Consola");
 //crear una instancia de
 JugarGlobo start = new JugarGlobo();
 //Agregar la instancia del applet al marco
 f.add(start);
 //inicializar las variables al ancho y el alto de la
 int width = 400;
 int height = 400;
 f.setSize(width, height);
 //llamar a init() y a start() si es necesario
 start.init();
 //hacer visible el marco
 f.show();

 }
}