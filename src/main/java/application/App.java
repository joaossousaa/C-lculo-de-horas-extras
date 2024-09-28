package application;

import entities.Employee;
import entities.Overtime;

import java.io.*;
import java.util.ArrayList;

import static java.lang.Double.parseDouble;

public class App {

        public static void main(String[] args) {
            String filePath = "d:\\Downloads\\funcionarios_horas.csv";
            String OutputFilePath = "c:\\Users\\joaos\\Desktop\\calculo_horas_extras.csv";

            try (
                    BufferedReader br = new BufferedReader(new FileReader(filePath));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(OutputFilePath))
            ) {
                ArrayList<Employee> employees = new ArrayList<>();

                String line = br.readLine();

                while (line != null) {
                    String[] parts = line.split(",");
                    String nameEmployee = parts[0].trim();
                    double overtimeEmployee = parseDouble(parts[1].trim());

                    employees.add(new Employee(nameEmployee, new Overtime(overtimeEmployee)));
                    line = br.readLine();
                }

                bw.append("Name,Hours,Overtime value,\n");
                for (Employee employee : employees) {
                    Double overtime = employee.getOvertime().getOvertime();
                    bw.append(employee.getName()).append(",");
                    bw.append(String.valueOf(overtime)).append(",");
                    bw.append(String.valueOf(employee.getOvertime().calculationOvertime(overtime)));
                    bw.append("\n");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
}
