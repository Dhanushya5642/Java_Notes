import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleCharRead {
    
    public static void main(String args[])throws IOException{
        int a;
        char b;
        float c;
        Character d;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//if you are using  streams , you must close it manually or else it is running always , you cant use it on another system
        a=Integer.parseInt(br.readLine());
        b=br.readLine().charAt(0);// b=(char)br.read();
        c=Float.parseFloat(br.readLine());
        d=br.readLine().charAt(0);
        System.out.print(a+" "+b+" "+c+" "+d);
        br.close();
    }
}
