import java.util.Scanner;
public class Area_poligono {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("1 para sacar el area de un triangulo");
        System.out.println("2 para sacar el area de un cuadrado");
        System.out.println("3 para sacar el area de un rectangulo");
        System.out.println("-------------------------------------");
        System.out.println("ingrese el numero del poligono que desea seleccionar");
        int numeroAccion=sc.nextInt();
        if (numeroAccion==1){
            System.out.println("Cual es la base del triangulo");
            int baseTriangulo=sc.nextInt();
            System.out.println("Cual es la altura del triangulo");
            int alturaTriangulo=sc.nextInt();
            double areaTriangulo=(double)(baseTriangulo*alturaTriangulo)/2;
            System.out.println("el area del triangulo es de "+areaTriangulo);
        }else if(numeroAccion==2){
            System.out.println("cual es el lado del cuadrado");
            int ladoCuadrado=sc.nextInt();
            int areaCuandrado=ladoCuadrado*ladoCuadrado;
            System.out.println("el area del cuadrado es de "+areaCuandrado);
        }else if(numeroAccion==3){
            System.out.println("Cual es la base del rectangulo ");
            int baseRectangulo=sc.nextInt();
            System.out.println("Cual es la altura del rectangulo ");
            int alturaRectangulo=sc.nextInt();
            int areaRectangulo=baseRectangulo*alturaRectangulo;
            System.out.println("el area del rectangulo es de "+areaRectangulo);
        }else {
            System.out.println("el numero que ingreso no registra ningun poligono");
        }
    }
}