package TestNG19;

import static org.testng.AssertJUnit.assertEquals;
public class Kata {
    public static void main(String[] args) {
        System.out.println(longestConsec());
    }
    public static int longestConsec() {
        int arr[] = {1, 5, 3, 4, 10, 5, 10};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

}
