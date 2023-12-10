

public class p76q610 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1,0};
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i + " : "+ arr[i]);
        int[] np = nextPermutation(arr);
        for (int i = 0; i < np.length; i++)
            System.out.println("Element at index " + i + " : "+ np[i]);
        System.out.println("size is " + np.length);

    }


    public static int[] nextPermutation(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return arr;
        if (n == 1)
            return new int[0];
        int j = n - 1;
        boolean found = false;
        while (j != 0 && !found) {
            if (arr[j - 1] < arr[j])
                found = true;
            j--;
        }
        if (!found)
            return new int[0];
        int i = j;
        do {
            i++;
        }
        while ( i < n && arr[i] > arr[j]);
        i--;
        int[] np = new int[arr.length];
        for (int k = 0; k < n; k++){
            np[k] = arr[k];
        }
        np[j] = arr[i];
        int count = n-j-1;
        for (int k = 1; k <= count; k++){
            np[j+k] = arr[n-k];
        }
        np[n-i+j] = arr[j];
        return np;
    }

}
