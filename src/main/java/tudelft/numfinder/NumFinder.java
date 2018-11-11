package tudelft.numfinder;

public class NumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public void find(int[] nums) {
        if(nums!=null){
            for (int n : nums) {

                if (n > largest && n <= smallest) {
                    largest = n;
                } else if (n < smallest) {
                    smallest = n;
                }

            }
        }
    }

    public int getSmallest () {
        return smallest;
    }

    public int getLargest () {
        return largest;
    }
}
