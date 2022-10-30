import java.util.Scanner;

public class AreaC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del Radio de la circunferencia");
        double r = sc.nextInt();
        sc.close();
        double A = Math.PI * Math.pow(r, 2);
        System.out.println("El area de la circunferencia es:" + A);
        
    }
}