import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        // contadorNumeros();
        digitarNumeros();
    }

    public static void digitarNumeros() {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int numero1 = terminal.nextInt();
        System.out.println("Digite o segundo numero");
        int numero2 = terminal.nextInt();

        try {
            contadorNumeros(numero1, numero2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void contadorNumeros(int numero1, int numero2) throws Exception {
        if (numero1 > numero2) {
            throw new Exception("O primeiro numero deve ser menor que o segundo");
        }
        int contagem = numero2 - numero1;

        for (int i = 0; i <= contagem; i++) {
            System.out.println(contagem + i);
        }

    }

}
