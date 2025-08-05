import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String args[])throws IOException{
         int n;
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         Student s[];
         int rollno,score1,score2,score3,score;
         String name;
         for(int i=0;i<n;i++){
            rollno=sc.nextInt();
            name=sc.nextLine();
            score1=sc.nextInt();
            score2=sc.nextInt();
            score3=sc.nextInt();
            score=(score1+score2+score3)/3;
            s[i].setRollno(rollno);
            s[i].setName(name);
            s[i].setScore(score);
         }
         int arr[];
         int hash[]={0};
         int max=0;
         for(int i=0;i<n;i++){
            if(s[i].score>max&&hash[i]==0){
                max=s[i].score;
                arr[i]=max;
                hash[i]=1;
            }
         }
    }
}
