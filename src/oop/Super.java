package oop;

public class Super {
    public static void main(String[] args){

        // super = Refer to the parents class (subclass <- superclass)
        //         Used in constructor and method overriding
        //         Call the parent constructor to initialize attributes

        Person person = new Person("Tom","Riddle");

        person.showName();

        newStudent student = new newStudent("Harry","Potter",3.23);

        student.showName();
        student.showGPA();

        Employee employee = new Employee("Tony","Stark",1000);

        employee.showName();
        employee.showSalary();
    }
}
