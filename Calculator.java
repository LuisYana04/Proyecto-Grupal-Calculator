import java.util.*;
class Calculator {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int entero1=4, entero2=5;
    
    System.out.println("La suma de los dos enteros es: "+add(entero1, entero2));
      
  }    

public static int add(int num1, int num2){
      int suma;
          suma=num1+num2;
              return suma;
}

}

