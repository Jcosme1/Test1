public class Student {
    String name;
    int age;

    Student(String name, int age){  //created a constructor since they asked for fields. Im not sure if everytime there
                                    //are fields you would just add a constructor but that seems the case
        this.name = name;
        this.age = age;
    }

  static String olderThan20(Student[] a){
        String names ="";                   //start with an empty string and using the for loop to iterate through the entire array
                                            //a friend helped because I was stuck for a while on the method being static
                                            // if it wasn't static you also get the error "java: non-static method olderThan20(Student[]) cannot be referenced from a static context"
        for (int i = 0; i < a.length; i++) {
            if (a[i].age > 20){
               names += a[i].name + " ";  //using i to check through each item in the array each time you iterate
            }
        }

        return names; //returning the concatenated version of your names variable
    }

    public static void main(String[] args) {

        Student a = new Student("Taylor", 19);  //created objects of type student then you can just print out your object with your
                                                // olderthan20 operation
        Student b = new Student("Lisa", 23);
        Student c = new Student("Sandy", 32);
        Student d = new Student("Bob", 18);
        Student[] students =new Student[]{a,b,c,d,};
        System.out.println(Student.olderThan20(students));
    }
}
