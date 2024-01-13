public class MethodPractice {

    int calculateSquare(int n){
        return n * n;   //there is probably a square method in java but just doing this seems simpler
    }
    String printName(String name){
        return "Hello " +name;
    }

    public static void main(String[] args) {
        MethodPractice test = new MethodPractice();
        System.out.println(test.printName("Julian"));
    }


}
