public class p62q61 {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{3,6,2,9,6,6,8};
        theDutchNationalFlagProblem(arr, 0);
        for (int i = 0; i < arr.length; i++)
            System.out.printf(", %d", arr[i]);
    }

    public static int[] theDutchNationalFlagProblem(int[] arr, int pivotIndex) throws Exception {
        if(pivotIndex >= arr.length || pivotIndex < 0 )
            throw new Exception("pivot i is out of bounds");
        int pivot = arr[pivotIndex];
        for (int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if (arr[j]< pivot) {
                    arraySwap(arr, i, j);
                    break;
                }
            }
        }

        for (int i = arr.length -1 ;i >= 0 && arr[i] >= pivot; i--) {
            for (int j = i - 1; j >= 0 && arr[j] >= pivot; j--) {
                if (arr[j] > pivot) {
                    arraySwap(arr, i, j);
                    break;
                }
            }
        }
        return arr;
    }


    public static void arraySwap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
