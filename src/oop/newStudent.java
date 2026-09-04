package oop;

public class newStudent extends Person{

    double gpa;


    newStudent(String first, String last,double gpa){
        super(first,last); // oop.Person(first,last)
        this.gpa = gpa;
    }
    void showGPA(){
        System.out.println(this.first + "'s gpa is: "+ this.gpa);
    }
}
