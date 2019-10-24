import java.util.Scanner;

public class EvenorOdd {
  
  public static void main(String[] args) {
    
    Scanner number = new Scanner(System.in);
    
    int num1;
    
    num1=0;
    
    System.out.println("Enter that digit little man");
    num1=number.nextInt();
    
    if(num1%2==0) {System.out.println("even");}
    
    else{System.out.println("odd");
      
    }
    
  }
}