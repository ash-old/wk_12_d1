package management;

public class Director extends Manager{

    private double budget;

    public Director(String deptName, String name, String NI, double salary, double budget) {
        super(deptName, name, NI, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
