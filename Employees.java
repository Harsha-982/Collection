package src.main.java.Examples.employeeExample;

import java.util.ArrayList;

public class Employees {

    private ArrayList<Employee> employeeslist =new ArrayList<Employee>();

    public ArrayList<Employee> getEmployeeslist(){
        employeeslist.add(new Employee(101,"harsha","jr.engineer",20000.00));
        employeeslist.add(new Employee(102,"usha","jr.architect",20300.00));
        return employeeslist;
    }
    public static void main(String[] args){
        Employees employees=new Employees();
        ArrayList<Employee> employeeslist=employees.getEmployeeslist();
        for(Employee employee:employeeslist){
            System.out.println(employee);
            System.out.println(employee.getId());

        }


    }
}
