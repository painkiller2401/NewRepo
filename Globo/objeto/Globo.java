package objeto;
import java.awt.*;

public class Globo{
 private int diametro;
 private int xCoord, yCoord;
 public Globo (int diametroInicial, int xInicial, int
yInicial) {
 diametro = diametroInicial;
 xCoord = xInicial;
 yCoord = yInicial;
 }
 public void cambiarTamaño (int cambio) {
 diametro = diametro + cambio;
 }
 public void mostrar (Graphics g) {
 g.setColor(Color.BLUE);
 g.drawOval (xCoord, yCoord, diametro, diametro);
 }
  public void mostrar (Graphics g) {
 g.setColor(Color.WHITE);
 g.drawOval (xCoord, yCoord, diametro, diametro);
 }
}