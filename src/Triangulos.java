import java.util.Scanner;
public class Triangulos {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la medida del lado a: ");
        float lado1 = sc.nextFloat();
        System.out.println("Ingrese la medida del lado b: ");
        float lado2 = sc.nextFloat();
        System.out.println("Ingrese la medida del lado c: ");
        float lado3 = sc.nextFloat();

        if (lado1 > lado2 + lado3 || lado2 > lado3 + lado1 || lado3 > lado1 + lado2){
            System.out.println("No es un triángulo válido");
        }
        else if (lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2 || lado3 == lado2 && lado3 != lado1) {
            System.out.println("EL triángulo es isósceles");
        }
        else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
            System.out.println("El triángulo es escaleno");
        }
        else if(lado1 == lado2 && lado2 == lado3){
            System.out.println("El triángulo es equilátero");
        }
    }
}
