public class Policy
{
    int policyNumber;
    String name;
    String policyholderFirstName;
    String policyholderLastName;
    int policyholderAge;
    String policySmokerStatus; //"smoker" or "non-smoker"
    double policyholderHeight; //in inches
    double policyholderWeight; //in pounds

/** 
 *
 * No arg constructor. 
 *
 */
    public Policy() 
    {

        this.policyNumber = 0;
        this.name = "empty";
        this.policyholderFirstName = "blankFirstName";
        this.policyholderLastName = "blankLastName";
        this.policyholderAge = 0;
        this.policySmokerStatus = "non-smoker";
        this.policyholderHeight = 0;
        this.policyholderWeight = 0;
    }

/** 
 *
 * 8 arg constructor. 
 *
 * @param policyNumberInput  the policy number input
 * @param nameInput  the name input
 * @param policyholderFirstNameInput  the policyholder first name input
 * @param policyholderLastNameInput  the policyholder last name input
 * @param policyholderAgeInput  the policyholder age input
 * @param policySmokerStatusInput  the policy smoker status input
 * @param policyholderHeightInput  the policyholder height input
 * @param policyholderWeightInput  the policyholder weight input
 */
    public Policy(int policyNumberInput, String nameInput, String policyholderFirstNameInput, String policyholderLastNameInput, int policyholderAgeInput, String policySmokerStatusInput, double policyholderHeightInput, double policyholderWeightInput) 
    {

        this.policyNumber = policyNumberInput;
        this.name = nameInput;
        this.policyholderFirstName = policyholderFirstNameInput;
        this.policyholderLastName = policyholderLastNameInput;
        this.policyholderAge = policyholderAgeInput;
        this.policySmokerStatus = policySmokerStatusInput;
        this.policyholderHeight = policyholderHeightInput;
        this.policyholderWeight = policyholderWeightInput;
    }



/** 
 *
 * Sets the policy number
 *
 * @param policyNumberInput  the policy number input
 */
    public void setPolicyNumber(int policyNumberInput) 
    {

        this.policyNumber = policyNumberInput;
    }



/** 
 *
 * Gets the policy number
 *
 * @return the policy number
 */
    public int getPolicyNumber() 
    {

        return this.policyNumber;
    }



/** 
 *
 * Sets the name
 *
 * @param nameInput  the name input
 */
    public void setName(String nameInput) 
    {

        this.name = nameInput;
    }



/** 
 *
 * Gets the name
 *
 * @return the name
 */
    public String getName() 
    {

        return this.name;
    }



/** 
 *
 * Setpolicyholder first name
 *
 * @param policyholderFirstNameInput  the policyholder first name input
 */
    public void setpolicyholderFirstName(String policyholderFirstNameInput) 
    {

        this.policyholderFirstName = policyholderFirstNameInput;
    }



/** 
 *
 * Getpolicyholder first name
 *
 * @return the policyholder first name
 */
    public String getpolicyholderFirstName() 
    {

        return this.policyholderFirstName;
    }



/** 
 *
 * Setpolicyholder last name
 *
 * @param policyholderLastNameInput  the policyholder last name input
 */
    public void setpolicyholderLastName(String policyholderLastNameInput) 
    {

        this.policyholderLastName = policyholderLastNameInput;
    }



/** 
 *
 * Getpolicyholder last name
 *
 * @return the policyholder last name
 */
    public String getpolicyholderLastName() 
    {

        return this.policyholderLastName;
    }



/** 
 *
 * Sets the policyholder age
 *
 * @param policyholderAgeInput  the policyholder age input
 */
    public void setPolicyholderAge(int policyholderAgeInput) 
    {

        this.policyholderAge = policyholderAgeInput;
    }



/** 
 *
 * Gets the policyholder age
 *
 * @return the policyholder age
 */
    public int getPolicyholderAge() 
    {

        return this.policyholderAge;
    }



/** 
 *
 * Sets the policy smoker status
 *
 * @param policySmokerStatusInput  the policy smoker status input
 */
    public void setPolicySmokerStatus(String policySmokerStatusInput) 
    {

        this.policySmokerStatus = policySmokerStatusInput;
    }



/** 
 *
 * Gets the policy smoker status
 *
 * @return the policy smoker status
 */
    public String getPolicySmokerStatus() 
    {

        return this.policySmokerStatus;
    }



/** 
 *
 * Sets the policyholder height
 *
 * @param policyholderHeightInput  the policyholder height input
 */
    public void setPolicyholderHeight(int policyholderHeightInput) 
    {

        this.policyholderHeight = policyholderHeightInput;
    }



/** 
 *
 * Gets the policyholder height
 *
 * @return the policyholder height
 */
    public double getPolicyholderHeight() 
    {

        return this.policyholderHeight;
    }



/** 
 *
 * Sets the policyholder weight
 *
 * @param policyholderWeightInput  the policyholder weight input
 */
    public void setPolicyholderWeight(int policyholderWeightInput) 
    {

        this.policyholderWeight = policyholderWeightInput;
    }



/** 
 *
 * Gets the policyholder weight
 *
 * @return the policyholder weight
 */
    public double getPolicyholderWeight() 
    {

        return this.policyholderWeight;
    }




/** 
 *
 * Gets the bmi
 *
 * @return the bmi
 */
    public double getBmi() 
    {

        return (policyholderWeight * 703 ) / (policyholderHeight * policyholderHeight);
    }
    


/** 
 *
 * Gets the insurance policy
 *
 * @return the insurance policy
 */
    public double getInsurancePolicy() 
    {

        double price = 600;
        
        if (policyholderAge > 50)
        {
            price += 75;
        }

        if (policySmokerStatus == "smoker")
        {
            price += 100;
        }

        double bmi = getBmi();

        if (bmi > 35)
        {
            price += ((bmi - 35) * 20);
        }

        return price;
    }
} 
