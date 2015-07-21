import java.util.Scanner;

public class HelloWorld{
  public static void main(String ... arg){
    Scanner jin = new Scanner(System.in);
    
    while(jin.hasNext()){
      System.out.printf("Hello, %s%n",jin.nextLine());
    }
  }
}
