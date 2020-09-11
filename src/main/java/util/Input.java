package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input (){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
//        System.out.print("Enter your string: ");
        String response = scanner.nextLine();
        return response;
    }

    public boolean yesNo(){
        String s = this.scanner.nextLine();
        return "y".equalsIgnoreCase(s) || "yes".equalsIgnoreCase(s);
    }

// The getInt(int min, int max) method should keep prompting the user
// for input until they give an integer within the min and max

    public int getInt(int min, int max){
        System.out.print("Enter an int between " + min + " and " + max +" : ");
//        int ans = scanner.nextInt();
        int parsed;
        int ans = Integer.valueOf(this.getString());
        try{
            parsed = Integer.parseInt(ans);
        } catch ( Exception e){

        }
        if(ans >= min && ans <= max){
            System.out.println("Your int is within the range");
            return ans;
        } else {
            return getInt(min, max);
        }

    }

    public int getInt(){
        System.out.print("Enter an int: ");
        int gotInt = Integer.valueOf(this.getString());
        return gotInt;
    }

// The getDouble(double min, double max) method should keep prompting the user
// for input until they give an double within the min and max

    public double getDouble(double min, double max){
        System.out.print("Enter a double between the min and max: ");
        double ans = Double.valueOf(this.getString());
        if(ans >= min && ans <= max){
            System.out.println("Your double is within the range");
            return ans;
        } else {
            return getDouble(min, max);
        }
//        try {
//            // something that
//            // might go wrong
//        } catch (NumberFormatException e) {
//            System.out.println("You did not enter an integer");
//        }
    }

    public double getDouble(){
        System.out.print("Enter the radius of your circle in inches to the nearest hundredth : ");
        double dub = Double.valueOf(this.getString());
        return dub;
    }

}