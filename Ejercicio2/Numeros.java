import java.util.Scanner;


public class Numeros 
{
  int num1, num2;
  public static void main(String[] args)
  {
    Numeros n = new Numeros();
    Scanner leer = new Scanner(System.in);
    System.out.print("Por favor ingrese el limite inferior");
    n.num1 = leer.nextInt();
    System.out.print("Por favor ingrese el limite superior");
    n.num2 = leer.nextInt();
    for(int i = n.num1; i < n.num2; i++)
    {
      if(i % 2 == 0)
      {
        System.out.print("pares " + i + " , ");
      }
    } 
    int o = n.num1;
    while( o < n.num2) 
    {
      if(o % 2 == 1)
      {
        System.out.print("impares " + o + " , ");
      }
      o++;
    }
  }
}
