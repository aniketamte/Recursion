public class sortedArray {
      static boolean sorted(int arr[], int index){
            //base condition
            if(index==arr.length-1){
                  return true;
            }
            return arr[index] < arr[index+1] && sorted(arr, index+1);
      }
      static boolean find(int arr[], int target, int index){
            if(index==arr.length){
                  return false;
            }
            return arr[index]==target || find(arr, target, index+1);
      }
      static int findIndex(int arr[], int target, int index){
            if(index==arr.length){
                  return -1;
            }
            if(arr[index]==target){
                  return index;
            } else{
                  return findIndex(arr, target, index+1);
            }
      }

      public static void main(String[] args) {
            int arr[]= {1,2,3,4,5};
            System.out.println("Array is sorted or not : "+sorted(arr, 0));
            System.out.println("Find element in array : " + find(arr, 3, 0)); 
            System.out.println("Find the index of an element in array : " + find(arr, 3, 0));
      }

}
