import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class FloatIO {
    public static void main(String args[])throws IOException{
          float a;
          Float b;
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          a=Float.parseFloat(br.readLine());
          b=Float.parseFloat(br.readLine());
          System.out.printf("%.2f",a);
          
    }
}
