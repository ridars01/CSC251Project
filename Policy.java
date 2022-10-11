public class Policy {


   //fields
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   //constructors
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   /**
     Constructor that accepts argument for each field
     @param pNumber The policy number
     @param pName The provider name
     @param fName The First name of the individual 
     @param lName The Last name of the individual
     @param a The age of the individual
     @param sStatus The Smoking status of the individual
     @param h The height of the individual
     @param w The weight of the individual
  */

   public Policy(String pNumber, String pName, String fName, String lName,int a, String sStatus, double h, double w)
   {
      policyNumber = pNumber;
      providerName = pName;
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
   }
   
   //setters//

/**
     The setPolicyNumber method sets the policy number
     @param pNumber.
  */
   public void setPolicyNumber(String pNumber)
   {
      policyNumber = pNumber;
   }
   
   /**
     The setProviderName method sets the provider name
     @param pName.
  */

   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
   /**
     The setFirstName method sets the first name
     @param fName.
  */
   
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   
   /**
     The setLastName method sets the last name
     @param lName.
  */
   
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   
   /**
     The setLastName method sets the age
     @param a.
  */
   public void setAge(int a)
   {
      age = a;
   }
   
    /**
     The setSmokingStatus method sets the smoking status
     @param sStatus.
  */
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   
   /**
     The setHeight method sets the height
     @param h.
  */
   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
     The setWeight method sets the weight
     @param w.
  */
   public void setWeight(double w)
   {
      weight = w;
   }

   
   //getters//
   
    /**
     The getPolicyNumber method returns the policy number 
     @return The policy number.
  */

   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
     The getProviderName method returns the provider name 
     @return The provider name.
  */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
     The getFirstName method returns the fisrt name 
     @return The first name.
  */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
     The getLastName method returns the last name 
     @return The last name.
  */
   
   public String getLastName()
   {
      return lastName;
   }
   
   /**
     The getAge method returns the age 
     @return The age.
  */
   public int getAge()
   {
      return age;
   }
   
    /**
     The getSmokingStatus method returns the smoking status 
     @return The smoking status.
  */
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
    /**
     The getHeight method returns the height 
     @return The height.
  */
   
   public double getHeight()
   {
      return height;
   }
   
   /**
     The getWeight method returns the weight 
     @return The weight.
  */
   public double getWeight()
   {
      return weight;
   }
   
      
   //Calculates the Policyholder's BMI
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }
   
   //Calculates the Policy's price
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(age > AGE_THRESHOLD) //over 50 years
         price += ADDITIONAL_FEE_AGE; //75
         
      if(smokingStatus.equalsIgnoreCase("smoker")) 
         price += ADDITIONAL_FEE_SMOKING; //100
            
      //call the getBMI method
      if(getBMI() > BMI_THRESHOLD) //BMI over 35
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI); //additional BMI fee - 20
         
      return price;
   }

}