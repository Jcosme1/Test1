import java.util.Scanner; //need to import this to capture any input in java
// im using this tutorial for more help https://www.youtube.com/watch?v=Wgkb0zg7WOM&t=658s
public class LoopPractice2 {
    public static void main(String[] args) {
    //now you create the object of type scanner usualy people use scanner as the name also so it can be a bit confusing
    Scanner scan = new Scanner(System.in);
     //you need to print out asking for the question
        int num = 1;
        int sum = 0;

        while(num > 0){
            System.out.print("Give me a number: ");
            num = Integer.parseInt(scan.nextLine()); // this line gets what you would type then turns it into an int
            if (num > 0 ){   // you need to check the new number you type in to see if you'll add it to the running total
             sum += num;

            }
        }
        System.out.println("Total positive sum :" + sum);


    }
}
