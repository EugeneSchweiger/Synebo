import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;


    public class saleforce1 {
        public static void main(String[] args) throws IOException {

            System.out.println("Here is program to find all square roots beenween two numbers" + "\n" + "Type them!");
            System.out.println("Type 1'st number and press Enter:");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Type 2'nd number and press Enter:");
            int b = Integer.parseInt(bufferedReader.readLine());
            //Here is place for checking for wrong input format from keyboard.It must be only numbers,but can be symbols.
            //however there is nothing about checking wrong input format in task.
            StringBuilder sol=solution(a,b);
            System.out.println(sol);
        }

        public static StringBuilder solution(int a, int b) {
            int count;
            int bottom;
            int top;
            a=Math.abs(a);
            b=Math.abs(b);  //Need it? Or just .concat with "i" as complex number for negative sqrt in their case?
            if (a<=b) {
                count = (int) ((Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a))) + 1);
                bottom=(int)Math.ceil(Math.sqrt(a));
                top=(int)Math.ceil(Math.sqrt(b));
            }else{
                count = (int) ((Math.floor(Math.sqrt(a)) - Math.ceil(Math.sqrt(b))) + 1);
                bottom=(int)Math.ceil(Math.sqrt(b));
                top=(int)Math.ceil(Math.sqrt(a));
            }

            StringBuilder result = new StringBuilder();
            Formatter fmt = new Formatter(result);
            if (a<=b) {
                fmt.format("There are %d roots.Bottom root is %d and top root is %d",count,bottom,top );}
            else{
                fmt.format("There are %d roots.Bottom root is %d and top root is %d",count,top,bottom );
            }
            return result;

        }
    }


