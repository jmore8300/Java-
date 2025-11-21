/*
input : 8
output  :  1 A 3 B 4 C 7 D

*/
import java.util.*;


class Pattern
{
    public void Display(int iNo)
    {
         int iCnt  = 0;
        
        char ch = 'z';

        for(iCnt = 1; iCnt <= iNo; iCnt++,ch--)
        {
            System.out.printf("%c\t",ch);
           
        }
         System.out.println();
    }
}

class program178
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the frequency : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);

    }
}