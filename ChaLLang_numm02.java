package chAllAnge_nUmbEr02;

import java.util.Scanner;
public class ChaLLang_numm02 {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);

        int age;
        String mayorName;

        System.out.println("\n\n\t\t ======  BenZic   ======");

        System.out.println("\n\t --------  Vote Now   -------- \n");

        System.out.print("Enter your age: ");
            age = s.nextInt();

        if (age >= 1 && age < 18 ){
            System.out.print("\n\t ---Sorry you not allow a vote of election\n\t   - Because this is 18+ only in voting.\n\n");
        }
        
        if(age >= 18){

            s.nextLine();

            System.out.println("\n\t\t|#VOTE Now!!!|");
            System.out.println(" | ako si dogie 3    ||||     BenZic      |\n\n");

            System.out.print("\nenter your nam: ");
            mayorName = s.nextLine();

                if(mayorName.equalsIgnoreCase("ako si dogie 3")){

                    System.out.printf("\n\n   --- you vote is sucssesfuly for voting to[ %s ] !!!\n",mayorName);
                    System.out.print("\n\n\tThank You for voting in my  --- Voting System. V1 ---\n\n");

                }else if(mayorName.equalsIgnoreCase("BenZic")){

                    System.out.printf("\n\n   --- you vote is sucssesfuly for voting to[ %s ] !!!\n",mayorName);
                    System.out.print("\n\n\tThank You for voting in my  --- Voting System. V1 ---\n\n");

                } else{
                    System.out.print("\n\nError please repeat\n");
                }
        
            }

            
        




    }
}






