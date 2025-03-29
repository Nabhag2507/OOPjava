class members{
    String name;
    int age;
    int phoneNo;
    String address;
    double salary;

    public members(String name,int age ,int phoneNo, String address, double salary){
        this.name=name;
        this.age=age;
        this.phoneNo=phoneNo;
        this.address=address;
        this.salary=salary;
    }
    public void printSalary(String salary){
        System.out.println("salary is "+salary);
    }
}

class Employee extends members{
    String specialization;
    public Employee(String name,int age ,int phoneNo, String address, double salary,String specialization){
        super( name, age , phoneNo,  address, salary);
    }
}

class manager extends members{
    String department;
    public manager(String name,int age ,int phoneNo, String address, double salary,String department){
        super( name, age , phoneNo,  address, salary);
    }
}

public class lab7B3 {
    public static void main(String[] args) {

    }
}
