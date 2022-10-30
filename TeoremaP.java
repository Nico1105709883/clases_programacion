import java.util.Scanner;
public class TeoremaP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del cateto opuesto (a): ");
        double a = sc.nextInt();
        System.out.println("Ingrese el valor del cateto adyacente (b): ");
        double b = sc.nextInt();
        sc.close();
        double a2 = Math.pow(a,2);
        double b2 = Math.pow(b,2);
        double c2 = a2 + b2;
        double c = (Math.sqrt(c2));
        System.out.println("el valor de la hipotenusa es: "+c); 
    }
}