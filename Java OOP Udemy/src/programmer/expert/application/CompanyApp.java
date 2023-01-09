package programmer.expert.application;

import programmer.expert.data.*;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Programmer Expert");

        Company.Employee employee = company.new Employee();
        employee.setName("Suwolo");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }

}
