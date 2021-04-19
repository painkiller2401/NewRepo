import java.util.Scanner;

public class Calculadora
{
  

  double resultado = 0;
  public void Suma(double sumando1, double sumando2)
  {
    resultado = sumando1 + sumando2;
  }
  public void Resta(double minuendo, double sustraendo)
  {
    resultado = minuendo - sustraendo;
  }
  public void Multiplicacion(double factor1, double factor2)
  {
    resultado = factor1 * factor2;
  }
  public void Division(double dividendo, double divisor)
  {
    resultado = dividendo * divisor;
  }
  public static void Main(String[] args)
  {
    Calculadora Operaciones = new Calculadora(); 

    Scanner leer = new Scanner(System.in);
    int seleccion;
    double numero1;
    double numero2;
    double resultado = 0;
    System.out.print("Por favor ingrese el primer valor");
    numero1 = leer.nextDouble();
    System.out.print("Por favor ingrese el segundo valor");
    numero2 = leer.nextDouble();
    System.out.print("Ingrese ");
    System.out.print("1 para suma ");
    System.out.print("2 para resta ");
    System.out.print("3 para multiplicacion ");
    System.out.print("4 para division ");
    seleccion = leer.nextInt();

    switch(seleccion)
    {
      case 1:
        Operaciones.Suma(numero1,numero2);
        break;
      case 2:
        Operaciones.Resta(numero1,numero2);
        break;
      case 3:
        Operaciones.Multiplicacion(numero1,numero2);
        break;
      case 4:
        Operaciones.Division(numero1,numero2);
        break;

    }
    leer.close();
    System.out.print("El resultado es: "+ resultado);
  }
  
  
}