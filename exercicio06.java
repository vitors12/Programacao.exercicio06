import java.util.Scanner;

public class exercicio06 {
    public static void main (String [] args) {
        double  raio, area;
        Scanner ler = new Scanner (System.in);
        System.out.println("Entre com o valor do raio do circulo");
        raio = ler.nextDouble();
        area = 3.1416 * (raio * raio);
        System.out.println("Valor da area do circulo e " + area);
}
}
