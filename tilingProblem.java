public class tilingProblem {
      public static int TP(int n){
            if(n==0 || n==1){
                  return 1;
            }
            //vertical Approch 
            int fnm1 = TP(n-1);
            //Horizontal Approach
            int fnm2 = TP(n-2);
            int totalWays= fnm1+fnm2;
            return totalWays;
      }
      public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean map[]){
            if(index == str.length()){
                  System.out.println(newStr);
                  return;
            }
            char currCharr = str.charAt(index);
            if(map[currCharr - 'a'] == true){
                  removeDuplicates(str, index+1, newStr, map);
            } else{
                  map[currCharr-'a']=true;
                  removeDuplicates(str, index+1, newStr.append(currCharr), map);
            }
      }
      public static int friendsPairing(int n){
            if(n==1 || n==2){
                  return n;
            }
            //single
            int fnm1 = friendsPairing(n-1);
            //pair
            int fnm2 = friendsPairing(n-2);
            int pairWays = (n-1) * fnm2;

            int totWays = fnm1 + pairWays;

            return totWays;
      }
      public static void main(String[] args) {
            System.out.println(TP(3));
            String str = "aniketamte";
            removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
            System.out.println(friendsPairing(3));
      }
}
