
package proyecto_final;
import java.util.Scanner;
public class proyecto {
    public static void main(String[] args){
        String Cliente;
        double c1,c2,c3,Total,Descuento,Pagar;
        Scanner lectura=new Scanner(System.in);
        System.out.print("CLiente:");
        Cliente=lectura.next();
        System.out.print("ingresar compra 1:");
        c1=lectura.nextDouble();
        System.out.print("ingresar compra 2:");
        c2=lectura.nextDouble();
        System.out.print("ingresar compra 3:");
        c3=lectura.nextDouble();
        Total=c1+c2+c3;
        Descuento=Total*0.1;  
        Pagar=Total-Descuento;
        System.out.println("El total es:"+Total);  
        System.out.println("El promedio es:"+Descuento);
        System.out.println("El promedio es:"+Pagar);
}
}
