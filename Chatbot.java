import java.util.Scanner;

public class Main
 {
 public static int[] Hisaab =  new int[20];

  public static void main(String[] args)
   {
    ChatBot.sayHello();
    Scanner keyboard = new Scanner(System.in); 
    String userName = "";               
    userName = keyboard.nextLine();  
    System.out.println(" ");
    System.out.println(userName + ", nice to meet you!");
    System.out.println(" ");
    System.out.println("WELCOME to Chat Bot!");
    System.out.println(" ");
    System.out.println("For FAQ's = PRESS 1");
    System.out.println(" ");
    System.out.println("General = PRESS 2");
    System.out.println(" ");

  Scanner ab = new Scanner(System.in);
  int g = ab.nextInt();
  switch(g)
    {
    case 1:
      faq();
      break;
    case 2:
      general();
      break;
    }
  }
     public static void question()
      {
          int i = 0 ;
         
          Scanner abb = new Scanner(System.in);
          System.out.println(" ");
          System.out.println("What brought you here today?");
          System.out.println(" ");
          System.out.println("Why, anything else?");
          System.out.println(" ");
          System.out.println("1=YES");
          System.out.println("0=NO");
          System.out.println(" ");
          Hisaab[i] = abb.nextInt();
          i++;

          int sum = Total[0];
        for(i=1;i<10;i++)
          {
          
            sum =  Total[i] + sum;

          }
          sum = sum * 10;
          System.out.println(" ");
          System.out.println("Thank you "+sum+" % ");

      }
 }
