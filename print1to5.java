public class print1to5 {
      public static void main(String[] args) {
            int ans = sumOfDigit(12345);
            System.out.println(ans);
      }
      public static void fun(int n){
            if(n==0){
                  return;
            }
            System.out.println(n);
            fun(n-1);
      }
      public static void funRev(int n){
            if(n==0){
                  return;
            }
            funRev(n-1);
            System.out.println(n);
      }
      //Sum of the digit
      public static int sumOfDigit(int n){
            if(n==0){
                  return 0;
            }
            return (n%10) + sumOfDigit(n/10);
      }
}
