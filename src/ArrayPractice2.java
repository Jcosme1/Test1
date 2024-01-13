public class ArrayPractice2 {
    public static void main(String[] args) {
        int [] test  =new int[]{7,3,3,1,9}; //created an array of random numbers
        int max = 0; // assigning a max value makes it so you can compare it to each item in the loop

        for (int i = 0; i < test.length; i++) {

            if(test[i] > max){
                max = test[i]; // the max gets updated when a value is higher

            }

        }
        System.out.println(max); // priting out said max value after the for loop is done

    }
}
