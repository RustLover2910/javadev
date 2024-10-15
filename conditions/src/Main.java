import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = 19;

        if(age >= 18) {
            System.out.println("Hey, you are an adult!");
        }
        else if(age>=75){
            System.out.println("Hey, you are a fossil at this point!");
        }
        else{
            System.out.println("Hey, you are not an adult!");
        };

        String day = "Monday";
        switch(day){
            case "Monday": System.out.println("It is Monday!");
            break;
            case "Tuesday": System.out.println("It is Tuesday!");
            break;
            case "Wednesday": System.out.println("It is Wednesday!");
            break;
            case "Thursday": System.out.println("It is Thursday!");
            break;
            case "Friday": System.out.println("It is Friday!");
            break;
            case "Saturday": System.out.println("It is Saturday!");
            break;
            case "Sunday": System.out.println("It is Sunday!");
            break;
            default: System.out.println("That is not a day!");
            break;
        }

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Welcome, " + name);

        for(int i=1;i<=10;i++){
            System.out.println(i + "!");
        }

        int rows;
        int columns;
        String symbol = "";

        System.out.print("Enter # of rows: ");
        rows = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter # of columns: ");
        columns = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter symbol: ");
        symbol = scanner.next();

        for(int i=0;i<rows;i++){
            System.out.println();
            for(int j=0;j<columns;j++){
                System.out.print(symbol);
            };
        };
    }
}