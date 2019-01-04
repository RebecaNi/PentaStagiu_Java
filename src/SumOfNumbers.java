import java.util.*;

public class SumOfNumbers {
    public static void main(String[] args){
        int sum=0;
        Scanner s=new Scanner(System.in);
        //5System.out.println("imput number: "+s.nextInt());
        int n=s.nextInt();
        for(int i=0; i<=n; i++)
            sum=sum+i;
    System.out.println("Suma este: "+sum);
    }

}
