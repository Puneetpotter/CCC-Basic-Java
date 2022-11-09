import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int people1=s.nextInt();
    double rating1=s.nextDouble();
    int people2=s.nextInt();
    double rating2=s.nextDouble();
    int people3=s.nextInt();
    double rating3=s.nextDouble();
    double res=((people1*rating1)+(people2*rating2)+(people3*rating3))/(people1+people2+people3);
    System.out.printf("%.2f",res);
  }
}
