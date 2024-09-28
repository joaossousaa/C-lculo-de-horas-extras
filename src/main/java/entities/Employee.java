package entities;

public class Employee {

    private String name;

    private Overtime overtime;

    public Employee() {}

    public Employee(String name, Overtime overtime) {
        this.name = name;
        this.overtime = overtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Overtime getOvertime() {
        return overtime;
    }

    public void setOvertime(Overtime overtime) {
        this.overtime = overtime;
    }
}
