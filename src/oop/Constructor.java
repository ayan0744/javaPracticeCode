package oop;

public class Constructor{
    public static void main(String[] args){

        // constructor = A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values

        Student student1 = new Student("Spongebob",20,3.5);
        Student student2 = new Student("Jack",24,3.2);

//        System.out.println(student1.name);
//        System.out.println(student1.age);
//        System.out.println(student1.gpa);
//        System.out.println(student1.isEnrolled);
//
//        System.out.println(student2.name);
//        System.out.println(student2.age);
//        System.out.println(student2.gpa);
//        System.out.println(student2.isEnrolled);

        student1.study();
        student2.study();


    }
}
