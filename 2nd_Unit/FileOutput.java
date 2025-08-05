import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileOutput {
    public static void main(String[] args)throws IOException{
        try{
            FileWriter fw=new FileWriter("Input.txt",true);//open file ,add data ,close file
            //append = false means it will flush out all the content in the file and add the content you;re giving now 
            //append = true means it will append all the contents you're giving with the previous content having
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            pw.println(s);
            // pw.println("Writing to file ");
            // pw.println("II CSE A-File Writer");
            pw.close();
            bw.close();
            fw.close();// you must close the files , then only it starts to write in the file 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
