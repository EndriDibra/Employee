// Author: Endri Dibra
// Topic: Employee's salary after tax in Greece and Italy

// importing the required libraries
import java.util.Scanner;


// starting our class
public class Employee extends Employee_Methods_1 implements Employee_Methods_2 {

    // declaring instances
    private String name;
    private String surname;
    private int id;
    private String company;
    private String residence;
    private double salary;


    // creating the constructor and initializing the instances
    public Employee(String a, String b, int c, String d, String e, double f) {

        this.name = a;
        this.surname = b;
        this.id = c;
        this.company = d;
        this.residence = e;
        this.salary = f;

    }


    public String get_Name() {

        return this.name;
    }


    public String get_Surname() {

        return this.surname;
    }


    public int get_Id() {

        return this.id;
    }


    public String get_Company() {

        return this.company;
    }


    public String get_Residence() {

        return this.residence;
    }


    public double get_Salary() {

        return this.salary;
    }


    // calculating the tax income based on the country
    public int get_tax_rate(String a, double s) {

        int tax = 0;
        
        // tax system in Greece
        if ( a.equals("Greece") ) {

            if (s >= 0 && s <= 20000) {

                tax = 22;
            }
        
            else if (s >= 20001 && s <= 30000) {

                tax = 29;
            }

            else if (s >= 30001 && s <= 40000) {

                tax = 37;
            }

            else if (s >= 40001) {

                tax = 45;
            }

        }
        
        // tax system in Italy
        else if ( a.equals("Italy") ) {

            if (s >= 0 && s <= 15000) {

                tax = 23;
            }
        
            else if (s >= 15001 && s <= 28000) {
    
                tax = 25;
            }
    
            else if (s >= 28001 && s <= 50000) {
    
                tax = 35;
            }
    
            else if (s >= 50001) {
    
                tax = 43;
            }
        }

        return tax;
    }


    // displaying salary after tax
    public void salary_after_tax() {

        System.out.println( "Your salary after tax is: " + ( get_Salary() - (get_Salary() * get_tax_rate(get_Residence(), get_Salary()) / 100) ) );
    }

    // main() started
    public static void main(String args[]) {
        
        System.out.println("Please enter your name, surname, id, company, residence [ Greece or Italy ] and salary");

        Scanner input = new Scanner(System.in);

        String name = input.next();
        String surname = input.next();
        int id = input.nextInt();
        String company = input.next();
        String residence = input.next();
        int salary = input.nextInt();

        Employee obj = new Employee(name, surname, id, company, residence, salary);
        
        // empty line
        System.out.println();

        System.out.println("# User's results #");
        
        // empty line
        System.out.println();

        System.out.println("Name: " + obj.get_Name());
        System.out.println("Surname: " + obj.get_Surname());
        System.out.println("Id: " + obj.get_Id());
        System.out.println("Company: " + obj.get_Company());
        System.out.println("Residence: " + obj.get_Residence());
        obj.salary_after_tax();

    }    
}
