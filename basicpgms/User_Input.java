import java.util.Scanner;
class User_Input{
  public static void main(String args[]){
    Scanner MyObj = new Scanner(System.in);
    System.out.println("Enter Your name");
    String username = MyObj.nextLine();
    System.out.println("Hello "+username+" Welcome to ****");
  }
}
