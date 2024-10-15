import java.util.Scanner; //a lib for scanning user inputs

public class Main {
    public static void main(String[] args) {
        Scanner scann =  new Scanner(System.in);

        /*              scanner
            nextline() [bro\n     ]
            read the whole [] and leave nothing (cuz string)

            BUT for nextInt();
                        scanner
            nextline() [18\n     ]
            it only read till \n, therefore left \n behind

            so if we use another nextLine()/nextInt(),
            the [] will have \n and so nextLine()/nextInt() will think that
            its the end and skipp the userinput

        */

        System.out.println("What is your name?");
        String username = scann.nextLine();

        System.out.println("How old are you?");
        int userage = scann.nextInt();
        scann.nextLine();

        System.out.println("What's your favorite food?");
        String favFood = scann.nextLine();

        System.out.println("What's up, " + username + "!");
        System.out.println("You look quite young for a " + userage + " year old.");
        System.out.println("You favorite food is " + favFood + "?\nMine is too!");

        scann.close(); //should do this

    }
}