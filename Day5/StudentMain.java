import java.io.IOException;
import java.util.Scanner;

public class StudentMain {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int size=Integer.parseInt(sc.nextLine());
        Student [] arr=new Student[size];
        Integer id;
        String name;
        Student s;
        for(int i=0;i<size;i++){
            System.out.println("Enter the student "+(i+1)+"data: " );
            System.out.println(("id: "));
            id=Integer.parseInt(sc.nextLine());
            System.out.println("Name: ");
            name=sc.nextLine();
            s=new Student(id,name);
            arr[i]=s;
        }
        int i=1;
        for (Student s1:arr){
            System.out.println("Student "+i++ +" Details:");
            System.out.println("ID:"+s1.id);
            System.out.println("Name:"+s1.name);
            System.out.println("Reference: "+s1);
            System.out.println();
        }
    }
}
