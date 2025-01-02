public class Decri {
      public static void printDec(int n){
            if(n==1){
                  System.out.println(n);
                  return;
            }
            System.out.print(n + " ");
            printDec(n-1);
      }
      public static void printInc(int n){
            if(n==1){
                  System.out.print(n + " ");
                  return;
            }
            printInc(n-1);
            System.out.print(n+ " ");
      }
      public static int fact(int n){
            if(n==0){
                  return 1;
            }
            int fn = n * fact(n-1);
            return fn;
      }
      public static int printSum(int n){
            if(n==1){
                  return 1;
            }
            int fn = n + printSum(n-1);
            return fn;
      }
      public static int fib(int n){
            if(n==0 || n==1){
                  return n;
            }
            int f1 = fib(n-1);
            int f2 = fib(n-2);
            int fn = f1+f2;
            return fn;
      }
      public static boolean isSorted(int arr[], int i){
            if(i==arr.length-1){
                  return true;
            }
            if(arr[i] > arr[i+1]){
                  return false;
            }
            return isSorted(arr, i+1);
      }
      public static int firstOccurence(int arr[], int key, int i){
            if(i==arr.length){
                  return -1;
            }
            if(arr[i]==key){
                  return i;
            }
            return firstOccurence(arr, key, i+1);
      }
      public static int power(int x, int n){
            if(n==0){
                  return 1;
            }
            int xnm1 = power(x, n-1);
            int xn = x * xnm1;
            return xn;
      }
      public static int optimizedPower(int a, int n){
            if(n==0){
                  return 1;
            }
            //For even
            int halfPower = optimizedPower(a, n/2) * optimizedPower(a, n/2);
            //For Odd
            if(n % 2 != 0){
                  halfPower=a*halfPower;
            }
            return halfPower;
      }
      public static int sumOfDigits(int n){
            // N=1342  ->  1 + 3 + 4 + 2 -> 10
            //remainder = n%10
            //sumOfDigits(N/10)
            //rem=2 -> 2 + sumOfDigits(N/10)=2+(134)

            if(n==0){
                  return n;
            }
            return (n%10) + sumOfDigits(n/10);
      }
      public static int productOfDigits(int n) {
        // N=1342  ->  1 + 3 + 4 + 2 -> 10
        //remainder = n%10
        //sumOfDigits(N/10)
        //rem=2 -> 2 + sumOfDigits(N/10)=2+(134)

        if (n%10 == n) {
            return n;
        }
        return (n % 10) * productOfDigits(n / 10);
    }
      public static void main(String[] args) {
            int n=5;
            printDec(n);
            printInc(n);
            System.out.println();
            System.out.println(fact(n));
            System.out.println(printSum(n));
            System.out.println(fib(5));

            int arr[] = {3,2,4,1,5};
            System.out.println(isSorted(arr, 0));

            System.out.println(firstOccurence(arr, 8, 0));
            System.out.println("Power Function :"+ power(2, 3));
            System.out.println("Optimized Power : "+ optimizedPower(10, 2));
            System.out.println("Sum Of Digits : " + sumOfDigits(1342));
            System.out.println("Product Of Digit : " + productOfDigits(1342));
      }
}
