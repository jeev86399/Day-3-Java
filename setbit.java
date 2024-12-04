import java.util.*;
public class setbit{
    public static void main(String args[])
    {
        int a=5;
        int pos=1;
        if((a&(1<<pos))!=0){
            System.out.println("set bit");
        }else{
            System.out.println("not a set bit");
        }
    }
}