import java.util.Scanner;

class Project_Tyler_Hudson
{

/** 
 *
 * Main method 
 *
 * @param args  the args
 */
    public static void main(String[] args) { 

        Scanner myObj = new Scanner(System.in); //used to get input for all policy constructor variables

        System.out.print("\nPlease enter the Policy Number: ");
        int policyNumberInput = Integer.parseInt(myObj.nextLine());

        System.out.print("\nPlease enter the Provider Name: ");
        String nameInput = myObj.nextLine();

        System.out.print("\nPlease enter the Policyholder's First Name: ");
        String policyholderFirstNameInput = myObj.nextLine();

        System.out.print("\nPlease enter the Policyholder's Last Name: ");
        String policyholderLastNameInput = myObj.nextLine();

        System.out.print("\nPlease enter the Policyholder's Age: ");
        int policyholderAgeInput = Integer.parseInt(myObj.nextLine());

        System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        String policySmokerStatusInput = myObj.nextLine();

        System.out.print("\nPlease enter the Policyholder's Height (in inches): ");
        double policyholderHeightInput = Double.parseDouble(myObj.nextLine());

        System.out.print("\nPlease enter the Policyholder's Weight (in pounds): ");
        double policyholderWeightInput = Double.parseDouble(myObj.nextLine());

        Policy demoPolicy = new Policy(policyNumberInput, nameInput, policyholderFirstNameInput, policyholderLastNameInput, policyholderAgeInput, policySmokerStatusInput, policyholderHeightInput, policyholderWeightInput);
    
        System.out.println("Policy Number: " + demoPolicy.getPolicyNumber());
        System.out.println("Provider Name: " + demoPolicy.getName());
        System.out.println("Policyholder's First Name: " + demoPolicy.getpolicyholderFirstName());
        System.out.println("Policyholder's Last Name: " + demoPolicy.getpolicyholderLastName());
        System.out.println("Policyholder's Age: " + demoPolicy.getPolicyholderAge());
        System.out.println("Policyholder's Smoking Status: " + demoPolicy.getPolicySmokerStatus());
        System.out.println("Policyholder's Height: " + demoPolicy.getPolicyholderHeight());
        System.out.println("Policyholder's Weight: " + demoPolicy.getPolicyholderWeight());
        System.out.println("Policyholder's BMI: " + String.format("%,.2f", demoPolicy.getBmi()));
        System.out.println("Policy Price: $" + String.format("%,.2f", demoPolicy.getInsurancePolicy()));
    }
}
