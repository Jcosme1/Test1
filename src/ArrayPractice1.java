public class ArrayPractice1 {
    public static void main(String[] args) {
        int[] inttest = new int[]{5,10,15,20,25};
        int sum = 0;
        for (int i = 0; i <inttest.length ; i++) { // i goes through the array
                                                    // and also gives index that you want to add each iteration
            sum += inttest[i];
        }
        System.out.println(sum);
    }
}
