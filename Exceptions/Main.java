import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            try {
                action();
            }catch (NumberFormatException ex){
                System.out.println("Introdujo algo que no es número");
                ex.printStackTrace();
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Los tamaños de los arreglos no son iguales");
                ex.printStackTrace();
            }catch (ArithmeticException ex){
                System.out.println("No se permite la division entre 0");
                ex.printStackTrace();
            }
        }
    }

    public static void action() {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        line1 = line1.replace("[", "")
                .replace("]", "");
        line2 = line2.substring(1, line2.length() - 1);

        String[] parts1 = line1.split(",");
        String[] parts2 = line2.split(",");

        int[] arr1 = new int[parts1.length];
        int[] arr2 = new int[parts2.length];


        for (int i = 0; i < parts1.length; i++) {
            arr1[i] = Integer.parseInt(parts1[i]);
        }


        for (int i = 0; i < parts2.length; i++) {
            arr2[i] = Integer.parseInt(parts2[i]);
        }

        int[] res = new int[arr1.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr1[i] / arr2[i];
        }
        System.out.println(Arrays.toString(res));
    }


}
