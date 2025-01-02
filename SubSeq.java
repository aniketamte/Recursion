public class SubSeq {
      static void subseq(String p, String up){
            //if un process is empty then print process
            if(up.isEmpty()){
                  System.out.println(p);
                  return;
            }
            char ch = up.charAt(0);

            //add
            subseq(p + ch, up.substring(1));
            //ignore
            subseq(p, up.substring(1));
      }
      public static void main(String[] args) {
            subseq("", "abc");
      }
}
