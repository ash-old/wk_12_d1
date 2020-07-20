package management;


import staff.Employee;

public class Manager extends Employee {

    private String deptName;


    public Manager(String deptName, String name, String NI, double salary) {
        super(name, NI, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }


}
