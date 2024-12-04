import java.util.*;
public class powerornot{
    public static void main(String args[])
    {
        int n=12;
        if((n&(n-1))==0)
            System.out.println("power of 2");
        else
            System.out.println("not a power of 2");
    }
}