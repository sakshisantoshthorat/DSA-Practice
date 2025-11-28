import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


        public boolean ContainsDuplicate(int[] nums){
            HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<nums.length;i++){
                if(set.contains(nums[i])){
                    return true;
                }
                set.add(nums[i]);
            }
            return false;
        }

    public static void main(String[] args) {
            Main main = new Main();
            int[] nums = {5,4,3,2,1};
            boolean result = main.ContainsDuplicate(nums);
        System.out.println(result);
    }
}