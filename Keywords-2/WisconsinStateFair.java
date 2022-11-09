import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner s= new
    Scanner(System.in);
    int salary = s.nextInt();
    int weekdays=(salary-800)/130;
    System.out.printf("%d\n",weekdays+10);
    System.out.printf("%d",weekdays);
  }
}
