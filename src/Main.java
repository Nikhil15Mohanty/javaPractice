
abstract class Employee{
    private String name;
    private int id;

    public Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public abstract double calculateSalary();

    public String toString(){
        return "Employee[name= "+name+" id="+id+" salary= "+calculateSalary()+"]";
    }
}

class FullTimeEmployee extends Employee{

    private double monthlySalary;

    public FullTimeEmployee(String name,int id,double monthlySalary){
        super(name,id);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary(){
        return monthlySalary;
    }

}

class PartTimeEmployee extends Employee{

    private int hourWorked;

    private double hourlyRate;

    public PartTimeEmployee(String name, int id,int hourWorked,double hourlyRate){
        super(name,id);
        this.hourWorked = hourWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(){
        return hourWorked * hourlyRate;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Main class");
    }
}