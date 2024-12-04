import java.util.*;
public class mul4{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if((a&3)==0)
            System.out.println("multiple with 4");
        else
            System.out.println(" not multiple with 4");
    }
}