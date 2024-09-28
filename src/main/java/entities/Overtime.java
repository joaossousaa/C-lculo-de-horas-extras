package entities;

public class Overtime {

    private Double overtime;

    public Overtime() {}

    public Overtime(Double overtime) {
        this.overtime = overtime;
    }

    public Double getOvertime() {
        return overtime;
    }

    public void setOvertime(Double overtime) {
        this.overtime = overtime;
    }

    public Double calculationOvertime(Double hours) {
        double valuePerHour = 1412.0 / 220.0;
        double valueOvertime = valuePerHour * 1.5;

        return valueOvertime * hours;
    }
}
