import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //robux = 80
        //v-bucks = 125
        //rings = 2412
        //minecoins = 173
        //shark card = 33500
        Scanner input  = new Scanner(System.in);
        while (true){
            System.out.println("Choose your conversion:\n[1] USD to VG money\n[2] VG money to USD\nEnter choice here: ");
            String conInput = input.nextLine();
            if (conInput.toLowerCase().equals("usd to vg money")||conInput.equals("1")){
                System.out.println("Enter a certain amount of dollars: ");
                double usd = input.nextDouble();input.nextLine(); // Scanner.nextDouble method does not read the newline character in your input created by hitting
                // "Enter," and so the call to Scanner.nextLine returns after reading that newline
                System.out.println("\nChoose a currency to convert to:\n[1] Robux\n[2] V-bucks\n[3] Sonic rings\n[4] Minecoins\n[5] Shark card (GTA)\nEnter choice here: ");
                String vgmChoice = input.nextLine();
                if (vgmChoice.toLowerCase().equals("robux")||vgmChoice.equals("1")){
                    int robux = (int) ((usd * 80) + .5);
                    System.out.println("Total amount of Robux: " + robux + " robux");
                }
                else if (vgmChoice.toLowerCase().equals("v-bucks")||vgmChoice.equals("v bucks")||vgmChoice.equals("2")){
                    int vBucks = (int) ((usd * 125) + .5);
                    System.out.println("Total amount of V-bucks: " + vBucks + " v-bucks");
                }
                else if (vgmChoice.toLowerCase().equals("sonic rings")||vgmChoice.toLowerCase().equals("rings")||vgmChoice.equals("3")){
                    int rings = (int) ((usd * 2412) + .5);
                    System.out.println("Total amount of rings: " + rings + " rings");
                }
                else if (vgmChoice.equals("minecoins")||vgmChoice.equals("4")){
                    int minecoins = (int) ((usd * 173) + .5);
                    System.out.println("Total amount of minecoins: " + minecoins + " minecoins");
                }
                else if(vgmChoice.equals("shark card")||vgmChoice.equals("5")){
                    double sharkCard = usd * 33500;
                    System.out.println("Total amount of money in a shark card: $" + sharkCard + " (shark card)");
                }
                else{
                    System.out.println("Try again you goofball :P (press Enter to continue)");
                    input.nextLine();
                }
            }
            else if (conInput.toLowerCase().equals("vg money to usd")||conInput.equals("2")){
                System.out.println("\nChoose a currency to get converted:\n[1] Robux\n[2] V-bucks\n[3] Sonic rings\n[4] Minecoins\n[5] Shark card (GTA)\nEnter choice here: ");
                String vgmChoice2 = input.nextLine();
                System.out.println("Enter a certain amount of dollars: ");
                double usd = input.nextDouble();input.nextLine();
                if (vgmChoice2.toLowerCase().equals("robux")||vgmChoice2.equals("1")){
                    double robux2 = usd / 80;
                    System.out.println("Total amount of dollars: $" + robux2);
                }
                else if (vgmChoice2.toLowerCase().equals("v-bucks")||vgmChoice2.equals("v bucks")||vgmChoice2.equals("2")){
                    double vBucks2 = usd / 125;
                    System.out.println("Total amount of dollars: $" + vBucks2);
                }
                else if (vgmChoice2.toLowerCase().equals("sonic rings")||vgmChoice2.toLowerCase().equals("rings")||vgmChoice2.equals("3")){
                    double rings2 = usd / 2412;
                    System.out.println("Total amount of dollars: $" + rings2);
                }
                else if (vgmChoice2.equals("minecoins")||vgmChoice2.equals("4")){
                    double minecoins2 = usd / 173;
                    System.out.println("Total amount of dollars: $" + minecoins2);
                }
                else if(vgmChoice2.equals("shark card")||vgmChoice2.equals("5")){
                    double sharkCard2 = usd / 33500;
                    System.out.println("Total amount of dollars: $" + sharkCard2);
                }
                else{
                    System.out.println("Try again you goofball :P (press Enter to continue)");
                    input.nextLine();
                }
            }
            System.out.println("\nWould you like to go again?\n[1] Yes\n[2] No\nEnter choice here");
            String yesNo = input.nextLine();
            if (yesNo.toLowerCase().equals("yes")||yesNo.toLowerCase().equals("1")){
                continue;
            }
            else if (yesNo.toLowerCase().equals("no")||yesNo.toLowerCase().equals("2")){
                System.out.println("\nThanks for playing :)");
                break;
            }
        }
    }
}