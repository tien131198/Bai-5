
import java.sql.SQLOutput;
import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 11:48 AM
    
    ProjectName: Bai5
*/public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        while(true){
            System.out.println("Application Manager Candidate");
            System.out.println("Enter 1: To Insert person for rent");
            System.out.println("Enter 2: To remove person by passport");
            System.out.println("Enter 3: To Calculator price by passport");
            System.out.println("Enter 4: To show information");
            System.out.println("Enter 5: To Exit");
            String line =scanner.nextLine();
            switch(line){
                case "1": {
                    Person person = new Person();
                    Person person1 = person.insert();
                    hotel.addPerson(person1);
                    System.out.println("Done insert");
                    break;
                }
                case "2":{
                    System.out.println("Enter passport");
                    String passport = scanner.nextLine();
                    System.out.println(hotel.deletePerson(passport));
                    break;
                }
                case "3":{
                    System.out.println("Enter passport");
                    String passport = scanner.nextLine();
                    System.out.println("Price : " + hotel.calculator(passport));
                    break;
                }
                case "4":{
                    hotel.show();
                    break;
                }
                case "5":{
                    System.out.println("Exit ");
                    System.exit(0);
                }
                default:
                    break;
            }
        }
    }
}
