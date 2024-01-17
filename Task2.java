import java.util.Scanner;

public class Task2
{
    
    public static void main(String args[])
    {
        //String name;
        //float marks,total,avg,percentage,maths,science,eng,marathi;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("*STUDENT GRADE CALCULATOR*");
        System.out.println("WELCOME!!!!!!!");
        System.out.println("Enter your name:");
        System.out.println();
        String name=sc.nextLine();
        System.out.println("Hello,"+ name +" "+ "Enter your marks below");
        System.out.println();
        System.out.println("Enter marks obtained in Maths:");
        float maths=sc.nextFloat();
        System.out.println("Enter marks obtained in Science:");
        float science=sc.nextFloat();
        System.out.println("Enter marks obtained in English:");
        float eng=sc.nextFloat();
        System.out.println("Enter marks obtained in Marathi:");
        float marathi=sc.nextFloat();
        float total = maths+science+eng+marathi;
        System.out.println("Total marks obtained: "+total);
        System.out.println();
        float average=total/4;
        System.out.println("Average of marks obtained: "+average);
        System.out.println();
        if(total<400 && total>350)
        {
            System.out.println("Congratulations, you have secured A Grade!");
        }
        else if(total<351 && total>250)
        {
            System.out.println("Congratulations, you have secured B Grade!");
        }
        else if(total<251 && total>150)
        {
            System.out.println("Congratulations, you have secured C Grade!");
        }
        else if(total<151 && total>50)
        {
            System.out.println("Good luck next time, you have secured D Grade");
        }
        else if(total<50)
        {
            System.out.println("FAIL");
        }
        else
        {
            System.out.println("Invalid input");
        }
        
        
       
        

    }
    

}