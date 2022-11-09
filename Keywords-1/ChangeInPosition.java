import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int xcor=s.nextInt();
    int ycor=s.nextInt();
    long length=s.nextLong();
    long add=(length/2);
    System.out.printf("%d %d",xcor+add,ycor+add);
  }
}
