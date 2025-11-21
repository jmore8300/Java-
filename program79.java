import java.util.*;

class Number
{
    public boolean CheckPerfect DisplayFactors(int iNo)
    {
        int i = 0;
        int isum = 0;

        for(i = 1; i <= (iNo / 2); i++)
        {
            if ((iNo % i) ==0 )
            {
                System.out.println(i);
            }
        }
    }
}
class program79

{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();
       bRet = nobj.CheckPerfect(iValue);

       if(bRet == true )
       {
        system.out.println(iValue+" is Perfect number");
       }
       else
       {
         system.out.println(iValue+" is not Perfect number");
       }

// Important 
        sobj = null;
        nobj = null;

        System.gc();

    }
}