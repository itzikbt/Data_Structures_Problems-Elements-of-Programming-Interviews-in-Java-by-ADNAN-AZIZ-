public class p98q74 {
    public static void main(String[] args) {
          char[] arr = new char[]{'a', 'd', 's', 'b', 'f', 'b', 'a', 'x'};
         int size = replaceAndRemove(arr, 6);
         for (int i = 0 ; i < size; i++)
              System.out.printf("%c ,",arr[i]);
         System.out.println(size);


    }

    public static int replaceAndRemove( char[] sequence, int size){
         int nextIdx = 0;
         int aCount = 0;

         for (int i = 0; i < size; i++){
              if (sequence[i] != 'b'){
                   sequence[nextIdx] = sequence[i];
                   nextIdx++;
              }
              if (sequence[i] == 'a')
               aCount++;
         }
         int addedSize = aCount;
         for (int i = nextIdx - 1; i >= 0 ;i-- ){
              if (sequence[i] == 'a'){
                   sequence[i + aCount] = 'd';
                   sequence[i + aCount -1] = 'd';
                   aCount--;
              }
              else {
                   sequence[i + aCount] = sequence[i];
              }
         }
         return nextIdx + addedSize;
    }

}
