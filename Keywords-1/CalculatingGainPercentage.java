
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    float a=s.nextFloat();
    float b=s.nextFloat();
    float c=s.nextFloat();
    float gain=c-a-b;
    float gainper=(gain/(a+b)*100);
    System.out.printf("%.2f",gainper);
  }
}
