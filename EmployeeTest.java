import java.io.*;

public class EmployeeTest{
    public static void main(String []args){
        Employee empOne = new Employee("RUN00B1");
        Employee empTwo = new Employee("RUN00B2");

        empOne.empAge(26);
        empOne.empDesignation("High class Programmer");
        empOne.empSalary(10000);
        empOne.printEmployeee();

        empTwo.empAge(21);
        empTwo.empDesignation("Primary class Programmer");
        empTwo.empSalary(5000);
        empTwo.printEmployeee();
    }
}