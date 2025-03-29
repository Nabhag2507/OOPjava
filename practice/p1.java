// Create a class named 'Member' having the following members:
// Data members
// 1 - Name
// 2 - Age
// 3 - Phone number
// 4 - Address
// 5 - Salary
// It also has a method named 'printSalary' which prints the salary of the members.
// Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee'
// and 'Manager' classes have data members 'specialization' and 'department'
// respectively. Now, assign name, age, phone number, address and salary to an
// employee and a manager by making an object of both of these classes and print
// the same


class members{
    String name;
    int age;
    long phoneNumber;
    String address;
    double salary;
    public void printSalary(){
        System.out.print(salary);
    }
}
class manager extends members{
    public manager(){
        this.name="abc";
        this.age=26;
        this.phoneNumber=1234567890L;
        this.address="xdgcfhjbk";
        this.salary=500000;
    }
}
class employee extends members {
    public employee(){
        this.name="sdc";
        this.age=32;
        this.phoneNumber=1234567890L;
        this.address="xdgcfhjbk";
        this.salary=100000;
    }
}

public class p1{
    public static void main(String[] args) {
        manager m =new manager();
        m.printSalary();
    }
}