import java.util.*;
public class main{
    public static void main(String[]args){
    int n=5;
    int sum=0;
    int odd=0;
    for(int i=1;i<=5;i++){
    if (i%2==0) 
    {
     sum+=i;
    }else{
        odd+=i;
        }
    }
        System.out.println("sum of even numbers:"+sum);
        System.out.println("sum of odd numbers:"+odd);
}
}
