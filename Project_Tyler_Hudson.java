import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

class Project_Tyler_Hudson
{

/** 
 *
 * Main method 
 *
 * @param args  the args
 */
    public static void main(String[] args) { 
        
        File policyInformation = new File("PolicyInformation.txt");
        Scanner myReader = new Scanner(policyInformation);
        int nonSmokers = 0;
        int smokers = 0;

        while (myReader.hasNextLine()) {
            int policyNumberInput = Integer.parseInt(myReader.nextLine());
            String nameInput = myReader.nextLine();
            String policyholderFirstNameInput = myReader.nextLine();
            String policyholderLastNameInput = myReader.nextLine();
            int policyholderAgeInput = Integer.parseInt(myReader.nextLine());
            String policySmokerStatusInput = myReader.nextLine();
            if (policySmokerStatusInput == "smoker")
            {
                smokers += 1;
            }
            else
            {
                 nonSmokers += 1;
            }
            double policyholderHeightInput = Double.parseDouble(myReader.nextLine());
            double policyholderWeightInput = Double.parseDouble(myReader.nextLine());
            myReader.nextLine();

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
            System.out.println();
        }
        System.out.println();
        System.out.println("The number of policies with a smoker is: " + smokers);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokers);   
    }
}
