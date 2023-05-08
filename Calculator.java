import java.util.*;
class Calculator {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int entero1=4, entero2=5;
    
    System.out.println("La suma de "+entero1+" mas "+entero2+" es: "+add(entero1, entero2));
    System.out.println("La resta de "+entero1+" menos "+entero2+" es: "+sub(entero1, entero2));      
    System.out.println("La multiplicacion de "+entero1+" por "+entero2+" es: "+mul(entero1, entero2));
  }    

  public static int add(int num1, int num2){
      int suma;
          suma=num1+num2;
  return suma;
}
  public static int sub(int num1, int num2){
        int resta;
        resta=num1-num2;
  return resta;
}
  public static int mul(int num1, int num2){
            int mult;
                    mult=num1*num2;
                      return mult;
  }

}

