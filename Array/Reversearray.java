class Reversearray{
  public static void main(String args[]){
    int[] array1={1,2,3,4,5,6,7,8,9};
    System.out.println("Original array");
    for (int i=0;i<array1.length;i++){
      System.out.println(array1[i]);
    }
    System.out.println("Reverse array");
    for (int j=array1.length-1;j>=0;j--){
      System.out.println(array1[j]);
    }
  }
}
