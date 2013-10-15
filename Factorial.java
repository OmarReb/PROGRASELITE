import java.util.*;
public class Factorial {

     public static void main(String[] args){
       Scanner rec =new Scanner(System.in);
       int fac=1;
       System.out.println("Ingrese el numero que decea sacarle el factorial");
       int num=rec.nextInt();

           for(int i=1;i<=num;i++){
                 fac=fac*i;
               }
	      System.out.println("El factorial del numero es: "+fac);
      }
}
