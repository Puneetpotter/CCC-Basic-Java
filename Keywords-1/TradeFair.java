
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();
    int res=(2*n)/7;
    System.out.printf("Number of attendees on day 1 : %d\n",res);
    System.out.printf("Number of attendees on day 2 : %d\n",res*2);
    System.out.printf("Number of attendees on day 3 : %d\n",res/2);
  }
}
