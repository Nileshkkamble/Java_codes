class If_else{
  public static void main(String args[])
  {
     int a=10;
     int b=11;
     int c=a;

     if (a==b){
       System.out.println("a is equal to b");
     }
     if (b==c){
       System.out.println("b is equal to c");
     }
     if (a==c){
       System.out.println("a is equal to c");
     }
     else{
       System.out.println("a,b,c are not equal to each other");
     }
  }
}
