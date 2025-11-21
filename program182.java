/*
iRow : 4
iCol : 4
a b c d
1 2 3 4
a b c d
1 2 3 4

*/
import java.util.*;


class Pattern
{
    public void Display(int iRow, int iCol)
    {
         int i = 0;
         int j = 0;
         char ch = '\0';

      for(i = 1; i <= iRow; i++)
      {
        ch = 'a';
         for(j = 1, ch = 'a'; j <= iCol; j++,ch++)
         {
          if((i % 2)==0)
          {
            System.out.printf("%d\t",j);
          }           
          else
          {
             System.out.printf("%c\t",ch);
          }
         }
           System.out.println();
        
      }
    }
}

class program182
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the Number of row : ");
        iValue1 = sobj.nextInt();

         System.out.println("Enter the Number of columns : ");
        iValue2 = sobj.nextInt();


        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

    }
}