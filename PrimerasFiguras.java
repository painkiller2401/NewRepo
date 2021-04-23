import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;


public class PrimerasFiguras extends JFrame{

 public PrimerasFiguras(){
  this.setTitle("Ventana Perrona");
  this.setSize(500,500);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setVisible(true);

 }
 public void paint(Graphics g)
 {
  g.setColor(Color.blue);
  g.setFont(new Font("Arial",Font.BOLD,34));
  int i = 2;
  int j = 0;
  int k = 250;
  
  while(i < 360)
  {
    double b = Math.toRadians(i);
    int l = (int) Math. round(100*Math.cos(b));
    int m = (int) Math. round(100*Math.sin(b));
    
    g.drawString(".", 250+Math.round(m),  250+Math.round(l)); 
    i++;
    j++;
    k--;
  }

 }

 public static void main(String[] args){
  new PrimerasFiguras();
  
 }

}
