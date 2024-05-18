import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int parametro1;
        int parametro2;
        int contador;

        System.out.println("Digite um numero: ");
        parametro1 = teclado.nextInt();
        System.out.println("Digite um numero: ");
        parametro2 = teclado.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());

        }
    }

    static void contar(int parametro1, int parametro2) {
        if (parametro2 > parametro1) {
            int contador = parametro2 - parametro1;
            for (int i = 1; i <= contador; i++) {
                System.out.println("Imprimindo numero: " + i);
            }
        } else {
            throw new RuntimeException("O segundo numero deve ser maior que o primeiro.");
        }

    }
}
