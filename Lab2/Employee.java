
public class Employee {
Integer EmployeeId;
String EmployeeName;
Role EmployeeRole;
Double EmployeeSalary;
Employee(int eid,String ename,Role erole,double esalary){
    this.EmployeeId=eid;
    this.EmployeeName=ename;
    this.EmployeeRole=erole;
    this.EmployeeSalary=esalary;
}    
public void printEmpDetails(){
    System.out.println("Employee Name:"+this.EmployeeName);
    System.out.println("Employee Role:"+this.EmployeeRole);
    System.out.println("Employee ID:"+this.EmployeeId);
    System.out.println("Employee Salary:"+this.EmployeeSalary);
}
}
