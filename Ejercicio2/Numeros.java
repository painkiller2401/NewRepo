import java.util.Scanner;


public class Numeros 
{
  int num1, num2;
  public static void Main(String[] args)
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
        System.out.print(i);
      }
    }
  }
}