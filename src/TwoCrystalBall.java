public class TwoCrystalBall {


    // You have to Crystal balls. Determine the lowest height at which a crystal ball will break.
    // Runtime: Big-O(sqrt(n)
    public static void main(String[] args) {
       boolean[] heights = {
               false, false, false, false, false, false, false, false, false, true, true, true, true, true, true
       };

        System.out.println(twoCrystalBall(heights));
    }

    // Return the array of the first true value, where balls will start breaking
    public static int twoCrystalBall(boolean[] array) {

        int jumpValue = (int) Math.floor(Math.sqrt(array.length));
        int i = 0;

        for (; i < array.length; i += jumpValue) {
            if (array[i]) {
                break;
            }
        }

        i -= jumpValue;

        int range = i + jumpValue;
        for (; i <= range; i++) {
            if (array[i]) {
                return i;
            }
        }

        return -1;

    }

}