public class Average {

    public double getAvg(int[] nums) {

        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        return (double) sum / nums.length;
    }
}