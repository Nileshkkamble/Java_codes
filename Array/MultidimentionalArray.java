class MultidimentionalArray{
  public static void main(String args[]){
    String[][] numbers = {{"1","2","3"},{"one","two","three"}};
    for(int i=0;i<numbers.length;i++){
      for(int j=0;j<numbers[i].length;j++){
        System.out.println(numbers[i][j]);
      }
    }
  }
}

