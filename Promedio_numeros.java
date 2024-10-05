import java.util.Scanner;
public class Promedio_numeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //le pregunto añ usuario cuantas variables va a almacenar
        System.out.println("cuantos numeros va a almacenar");
        int numeroCondicional=sc.nextInt();
        //defino la matriz
        int[] numeros=new int[numeroCondicional];
        int suma=0;
        for (int i=0;i<numeroCondicional;i++){
            System.out.println("ingrese el primer numero");
            int numeroAlmacenar=sc.nextInt();
            numeros[i]=numeroAlmacenar;
            suma=suma+numeros[i];
        }
        double promedio=(double)suma/numeros.length;
        System.out.println("el promedio es de "+promedio);
    }
}
