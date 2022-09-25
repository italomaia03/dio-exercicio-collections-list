import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Temperaturas {
    public static void main(String[] args) {
        Random temp = new Random();
        int somaTemperaturas = 0;

        List<Integer> temperaturas = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            temperaturas.add(temp.nextInt(20) + 20);
        }
        for (int temperatura : temperaturas) {
            somaTemperaturas += temperatura;
        }
        double media = (double) somaTemperaturas / temperaturas.size();
        System.out.println(temperaturas);
        System.out.println("Média: " + String.format("%.2f", media) + "ºC");
        System.out.println("\nMeses acima da média:");

        for (int i = 0; i < 6; i++) {
            if (temperaturas.get(i) > media) {
                if (i == 0)
                    System.out.println("Janeiro: " + temperaturas.get(i)+"ºC");
                else if (i == 1)
                    System.out.println("Fevereiro: " + temperaturas.get(i)+"ºC");
                else if (i == 2)
                    System.out.println("Março: " + temperaturas.get(i)+"ºC");
                else if (i == 3)
                    System.out.println("Abril: " + temperaturas.get(i)+"ºC");
                else if (i == 4)
                    System.out.println("Maio: " + temperaturas.get(i)+"ºC");
                else if (i == 5)
                    System.out.println("Junho: " + temperaturas.get(i)+"ºC");
            }
        }

    }
}
