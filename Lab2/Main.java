import java.util.Scanner;
public class Main {
    public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      Employee []arr=new Employee[5];
      int eid;
      String ename;
      Role erole;
      Double esalary;
      for(int i=1;i<=5;i++){
        eid=sc.nextInt();
        ename=sc.nextLine();
        erole=sc.nextLine();
        esalary=sc.nextDouble();
        arr[i]=new Employee(eid,ename,erole,esalary);
      }
      for(int i=1;i<=5;i++){
        System.out.println("Employee "+i+" Details:");
        System.out.println("Employee Name"+arr[i].EmployeeName);
        System.out.println("Employee ID"+arr[i].EmployeeId);
        System.out.println("Employee Role"+arr[i].EmployeeRole);
        System.out.println("Employee Salary:"+arr[i].EmployeeSalary);
      }
    }
}
