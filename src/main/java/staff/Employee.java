package staff;

public abstract class Employee {

    private String name;
    private String NI;
    private double salary;

    public Employee(String name, String NI, double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(Double percentageRaise){
        if(percentageRaise > 0){
        }
        Double amountToRaise = percentageRaise * salary;
        salary = salary + amountToRaise;
    }

    public double payBonus(){
        double bonus = 0.01 * salary;
        return salary + bonus;
    }

    public void setName(String name) {
        if(this.name == ""){
            return;
        }else {
            this.name = name;
        }
    }
}
