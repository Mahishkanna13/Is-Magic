import java.util.Scanner;

public class IsMagic {
    public static int SumOfDigits(int Number)
    {
        int temp=Number;
        int result=0;
        while(temp>0)
        {
            result+=temp%10;
            temp=temp/10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Number= scanner.nextInt();
        while(Number>=10)
        {
            Number=SumOfDigits(Number);
        }
        if(Number==1)
        {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
