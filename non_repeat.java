
import java.util.HashMap;

public class non_repeat {
    public static void main(String args[]){
        Solution solution = new Solution();
        int[] arr = {4, 5, 1, 2, 0, 4, 5, 2, 1};
        int result = solution.firstNonRepeating(arr);
        System.out.println("First non-repeating element: " + result);
        
    }
}
class Solution{
    public int firstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return 0;
    }
}