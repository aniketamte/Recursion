public class linearsearch {
      //check linear
      static boolean linear(int arr[], int target, int i){
            if(i==arr.length){
                  return false;
            }
            return arr[i]==target || linear(arr, target, i+1);
      }
      //find inderx
      static int findIndex(int arr[], int target, int i){
            if(i== arr.length){
                  return -1;
            }
            if(arr[i]==target){
                  return i;
            } else{
                  return findIndex(arr, target, i+1);
            }
      }
      //findIndex from last
      static int findIndexFromLast(int arr[], int target, int i) {
            if (i == -1) {
                  return -1;
            }
            if (arr[i] == target) {
                  return i;
            } else {
                  return findIndexFromLast(arr, target, i - 1);
            }
      }
      public static void main(String[] args) {
            int arr[]= {1,3,4,5,6,7,8};
            int target=4;
            System.out.println(linear(arr, target, 0));
            System.out.println(findIndex(arr, target, 0));
            System.out.println(findIndexFromLast(arr, target, arr.length-1));
      }
}
