// remember no gambling !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

import java.util.Scanner;
import java.util.Random;

public class The_Arcade_with_games_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        // rand for g_1
        int rand_p = rand.nextInt(5) + 1;
        int rand_1 = rand.nextInt(9) + 1;
        int rand_2 = rand.nextInt(9) + 1;

        int ak;
        int coins = 0;

        int pkj_1 = 20;
        int pkj_2 = 45;
        int pkj_3 = 70;
        int pkj_4 = 100;
        int pkj_5 = 200;

        int taka = 0;
        int points_g_1 = 0;
        int change = 0;

        String pkj;
        String will;
        String does;

        int turns_g_1 = 0 , g_1 = 0;

        System.out.println("Do you want to play?");
        System.out.println("yes / on");
        does = scan.nextLine();
        
        // wanna play
        if (does.equalsIgnoreCase("yes")) {
            System.out.println();
            System.out.println("Choose your package : ");
            System.out.println("1) Package 1: 20 coins for 500tk.");
            System.out.println("2) Package 2: 45 coins for 1000tk.");
            System.out.println("3) Package 3: 70 coins for 1500tk.");
            System.out.println("4) Package 4: 100 coins for 2000tk.");
            System.out.println("What is your choice : p1 // p2 // p3 // p4 // or You can't decide.");
            pkj = scan.nextLine();

            System.out.println();
            
            // show me the money
            while (true) {
                if (pkj.equals("p1")) {
                    System.out.println("Ok 500 tk please.");
                    ak = scan.nextInt();
                    if (ak >= 500) {
                        change = ak - 500;
                        coins += pkj_1;
                        System.out.println("Your change is : " + change);
                        break;
                    } else {
                        System.out.println("Pay completely.");
                        break;
                    }
                } else if (pkj.equals("p2")) {
                    System.out.println("Ok 1000 tk please.");
                    ak = scan.nextInt();
                    if (ak >= 1000) {
                        change = ak - 1000;
                        coins += pkj_2;
                        System.out.println("Your change is : " + change);
                        break;
                    } else {
                        System.out.println("Pay completely.");
                        break;
                    }
                } else if (pkj.equals("p3")) {
                    System.out.println("Ok 1500 tk please.");
                    ak = scan.nextInt();
                    if (ak >= 1500) {
                        change = ak - 1500;
                        coins += pkj_3;
                        System.out.println("Your change is : " + change);
                        break;
                    } else {
                        System.out.println("Pay completely.");
                        break;
                    }
                } else if (pkj.equals("p4")) {
                    System.out.println("Ok 2000 tk please.");
                    ak = scan.nextInt();
                    if (ak >= 2000) {
                        change = ak - 2000;
                        coins += pkj_4;
                        System.out.println("Your change is : " + change);
                        break;
                    } else {
                        System.out.println("Pay completely.");
                        break;
                    }
                } else if (pkj.equalsIgnoreCase("yes")) {
                    System.out.println("Congrats you landed on the secret bonus package.");
                    System.out.println("For just 2500 tk you can get 200 coins!!");
                    System.out.println("Ok 2500 tk please.");
                    ak = scan.nextInt();
                    if (ak >= 2500) {
                        change = ak - 2500;
                        coins += pkj_5;
                        System.out.println("Your change is : " + change);
                        break;
                    } else {
                        System.out.println("Pay completely.");
                        break;
                    }
                } else {
                    System.out.println("Thanks for visiting.");
                    break;
                }
               
            }
                
        }

        scan.nextLine();  // Consume the leftover newline character

        // pick your game
        System.out.println();
        System.out.println("All right, what game do you want to play?");
        System.out.println();
        System.out.println("The available games are : ");
        System.out.println("1) Guessing game (numbers) (15c)");
        System.out.println("2) Guessing game (colors) (15c)");
        System.out.println("3) Guessing game (luck) (15c)");
        System.out.println("4) Board game 1p (luck) (15c)");
        System.out.println("5) Board game 2p (luck) (15c)");
        System.out.println();
        System.out.println("Pick your choice : ");
        System.out.println("g1 // g2 // g3 // g4 // g5");
        will = scan.nextLine();

        System.out.println();
        
        // game 1
        if (will.equals("g1")) {
            
            // your turns
            System.out.println("How many turns ? (10 / 15 / 20) : ");
            turns_g_1 = scan.nextInt();

            System.out.println();

            if (turns_g_1 == 10) {
                g_1 = 10;
            }
            else if (turns_g_1 == 15) {
                g_1 = 15;
                System.out.println("More turns = more fun !");
            }
            else if (turns_g_1 == 20) {
                g_1 = 20;
                System.out.println("Hard core mode here we go !");
            }else{g_1 = 10;}

            System.out.println();
            System.out.println("Remember if uou get more then 5 points you can get up to 100 taka back !!!!");
            System.out.println("All right here we go !?");
            System.out.println();
            coins -= 15;

            // the game starts
            for (int i = 0; i < g_1; i++) {
                if (rand_p == 1) {

                    // +
                    double as = rand_1 + rand_2;
                    System.out.println();
                    System.out.println("What is : " + rand_1 + " + " + rand_2 + " = ");
                    double as_1 = scan.nextDouble();
                    if (as == as_1) {
                        System.out.println();
                        System.out.println("Congrats, you guessed right.");
                        System.out.println("You get 5 coins.");
                        points_g_1 ++;
                        System.out.println("Your current points : " + points_g_1);
                        coins += 5;
                    } else {
                        System.out.println("Sorry, you've guessed wrong.");
                    }
                } else if (rand_p == 2) {

                    // -
                    double as = rand_1 - rand_2;
                    System.out.println();
                    System.out.println("What is : " + rand_1 + " - " + rand_2 + " = ");
                    double as_1 = scan.nextDouble();
                    if (as == as_1) {
                        System.out.println();
                        System.out.println("Congrats, you guessed right.");
                        System.out.println("You get 5 coins.");
                        points_g_1 ++;
                        System.out.println("Your current points : " + points_g_1);
                        coins += 5;
                    } else {
                        System.out.println("Sorry, you've guessed wrong.");
                    }
                } else if (rand_p == 3) {

                    // *
                    double as = rand_1 * rand_2;
                    System.out.println();
                    System.out.println("What is : " + rand_1 + " * " + rand_2 + " = ");
                    double as_1 = scan.nextDouble();
                    if (as == as_1) {
                        System.out.println();
                        System.out.println("Congrats, you guessed right.");
                        System.out.println("You get 5 coins.");
                        points_g_1 ++;
                        System.out.println("Your current points : " + points_g_1);
                        coins += 5;
                    } else {
                        System.out.println("Sorry, you've guessed wrong.");
                    }
                }else if (rand_p == 4) {

                    //  %
                    double as = rand_1 % rand_2;
                    System.out.println();
                    System.out.println("What is : " + rand_1 + " % " + rand_2 + " = ");
                    double as_1 = scan.nextDouble();
                    if (as == as_1) {
                        System.out.println();
                        System.out.println("Congrats, you guessed right.");
                        System.out.println("You get 5 coins.");
                        points_g_1 ++;
                        System.out.println("Your current points : " + points_g_1);
                        coins += 5;
                    } else {
                        System.out.println("Sorry, you've guessed wrong.");
                    }
                } else if (rand_p == 5) {

                    //  /
                    if (rand_2 != 0 && rand_1 != 0) {
                        double as;
                        if (rand_1 > rand_2) {
                            as = rand_1 / rand_2;
                            System.out.println();
                            System.out.println("What is : " + rand_1 + " / " + rand_2 + " = ");
                        } else {
                            as = rand_2 / rand_1;
                            System.out.println();
                            System.out.println("What is : " + rand_2 + " / " + rand_1 + " = ");
                        }
                        double as_1 = scan.nextDouble();
                        if (as == as_1) {
                            System.out.println();
                            System.out.println("Congrats, you guessed right.");
                            System.out.println("You get 5 coins.");
                            points_g_1 ++;
                        System.out.println("Your current points : " + points_g_1);
                            coins += 5;
                        } else {
                            System.out.println("Sorry, you've guessed wrong.");
                        }
                    }
                }

                rand_p = rand.nextInt(4) + 1;
                rand_1 = rand.nextInt(9) + 1;
                rand_2 = rand.nextInt(9) + 1;
            }

            // after turns
            System.out.println();
            System.out.println("Your turns are over.");
            System.out.println("You answered right : " + points_g_1);
            System.out.println("You answered wrong : " + points_g_1);
            System.out.println("Your earnings are : " + coins + " coins");
            
            if (points_g_1 >= 5) {
                taka += (coins - 30);
                System.out.println("you win taka : " + (taka * points_g_1));
                System.out.println("Thanks for playing.");
            }else{System.out.println("Thanks for playing.");}

        } else {
            System.out.println("Thanks for coming.");
        }
        // end of g 1


        scan.close();
    }
}
