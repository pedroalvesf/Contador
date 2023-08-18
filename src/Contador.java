import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro numero: ");
    int numero1 = scanner.nextInt();
    System.out.println("Digite o segundo numero: ");
    int numero2 = scanner.nextInt();
    scanner.close();

    try {
      count(numero1, numero2);
    } catch (ExceptionNumbers e) {
      System.out.println(e.getMessage());
    }

  }

  static void count(int numero1, int numero2) throws ExceptionNumbers {
    if (numero1 >= numero2) {
      throw new ExceptionNumbers("O segundo parametro deve ser maior do que o primeiro");
    }
    int contador = numero2 - numero1;

    for (int i = 1; i <= contador; i++) {
      System.out.println(i);

    }

  }

}
