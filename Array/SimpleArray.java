public class SimpleArray{
  public static void main(String args[]){
    String[] friends = {"Sumit","Mohit","Nilesh"};
    System.out.println("Printing one/first element\n");
    System.out.println(friends[0]);
    System.out.println("Printing all elements using for loop");
    for (int i=0;i<friends.length;i++){
      System.out.println(friends[i]);
    }
  }
}
