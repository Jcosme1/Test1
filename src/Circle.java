public class Circle {

   private int radius;

    public Circle(int radius) {

        this.radius = radius;
    }
    Double calculateArea(){
        double area =  3.14 * (this.radius * this.radius); // pie r^2 in java form and casting to make it a int

        return area;
    }
    public static void main(String[] args) {
        double a  = new Circle(12).calculateArea(); // was stuck on this problem due to forgetting circle is not
                                                    // my return type lol
        System.out.println(a);
    }
}
