import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        int menu1 = 0;
        int menu2 = 0;
        int menu3 = 0;
        int menu4 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("กินอยากไรดีครับ");
        System.out.println("1.ไก่ย่าง\n2.น้ำเปล่า\n3.หมูทอด\n4.เป็ดย่าง\n5.เก็บเงิน");
        for(int menunumber = scanner.nextInt(); menunumber !=5;)
        {
            System.out.println("1.ไก่ย่าง\n2.น้ำเปล่า\n3.หมูทอด\n4.เป็ดย่าง\n5.เก็บเงิน");
            if(menunumber == 1)
            {
                menu1 = menu1+1;
            }
            else if(menunumber == 2)
            {
                menu2 = menu2+1;
            }
            else if(menunumber == 3)
            {
                menu3 = menu3+1;
            }
            else if(menunumber == 4)
            {
                menu4 = menu4+1;
            }
            System.out.println("1.ไก่ย่าง\n2.น้ำเปล่า\n3.หมูทอด\n4.เป็ดย่าง\n5.เก็บเงิน");
            menunumber = scanner.nextInt();
        }
        System.out.println("ไก่ย่าง"+menu1+"\n"+"น้ำเปล่า"+menu2+"\n"+"หมูทอด"+menu3+"\n"+"เป็ดย่าง"+menu4+"\n");
    }
}//1

