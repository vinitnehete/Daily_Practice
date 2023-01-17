import java.io.*;
import java.util.*;

class FindTheDuplicateNumber {
	    public int findTheDuplicateNumber(int[] nums) {
            HashMap<Integer , Integer> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < nums.length;i++){
                if(map.containsKey(nums[i])){
                    map.put(nums[i] , nums[i]+1);
                }else{
                    map.put(nums[i] , 1);
                }
            }
            int count = 0 ;
            for(int num : map.keySet()){
                if(map.get(num)>1){
                    count = num;
                }
            }
            return count;
    }
    public static void main(String args[]) {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n + 1];
        for(int i = 0 ; i < nums.length ;i++) {
        	nums[i] = scanner.nextInt();
        }
        scanner.close();
        int result = new FindTheDuplicateNumber().findTheDuplicateNumber(nums);
        System.out.println(result);
    }
}
