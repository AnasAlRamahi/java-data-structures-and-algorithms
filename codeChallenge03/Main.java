class Main {
  public static void main(String[] args) {
    
    int n = 16;
    int[] arr = {4, 8, 15, 16, 23, 42, 42};

    int result = binarySearch(arr , n);
      System.out.println(result);
  }

  public static int binarySearch(int[] sortedArr, int searchKey){
    int min = 0;
    int max = sortedArr.length-1;
    int counter = 0;

      for (int i = (max)/2  ; i <= max ; i=(min+max)/2){
        System.out.println("iteration " + counter);
        if(min == max){
          if(sortedArr[min] == searchKey)
          return min;
          else 
            return -1;
        }else if (max < min){
          return -1;
        }else{
          if (sortedArr[i] > searchKey){
            max = i-1;
          }else if (sortedArr[i] < searchKey){
            min = i+1;
          }else{
            return i;
          }
        } 
        counter++;
      }
      return -1;
  }
}