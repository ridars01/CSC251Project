

public class PolicyHolder{


/*Fields*/
   private String policyHoldersFirstName;
   private String policyHolderslastName;
   private int policyHoldersAge;
   private String policyHoldersSmokingStatus;
   private double policyHoldersHeight;
   private double policyHoldersWeight;
   
 /*No-arg constructor : */
 
   public PolicyHolder(String firstName , String lastName , int age , String smokingStatus , double height , double weight){
   
      policyHoldersFirstName = firstName ; 
      policyHolderslastName = lastName ; 
      policyHoldersAge = age ; 
      policyHoldersSmokingStatus = smokingStatus ; 
      policyHoldersHeight = height ; 
      policyHoldersWeight = weight ; 
   
   }
 
 /**The copy consturctor**/
 
   public PolicyHolder(PolicyHolder object2){
   
      policyHoldersFirstName = object2.policyHoldersFirstName ; 
      policyHolderslastName = object2.policyHolderslastName ; 
      policyHoldersAge = object2.policyHoldersAge ; 
      policyHoldersSmokingStatus = object2.policyHoldersSmokingStatus ; 
      policyHoldersHeight = object2.policyHoldersHeight ; 
      policyHoldersWeight = object2.policyHoldersWeight ;
   }
   
   /**Setters**/
   
   public void setPolicyHoldersFristName(String firstName){
   
      policyHoldersFirstName = firstName ;
   
   }
   
   
   public void setPolicyHoldersLastName(String lastName){
   
      policyHolderslastName = lastName ; 
   
   }
   
   public void setPolicyHoldersAge(int age){
   
      policyHoldersAge = age ; 
   
   }
   
   
   
   public void setPolicyHoldersSmokingStatus(String smokingStatus){
   
      policyHoldersSmokingStatus = smokingStatus ;
   
   }


   public void setPolicyHoldersHeight(double height){
   
      policyHoldersHeight = height ; 
   
   }
   
   public void setPolicyHoldersWeight(double weight){
   
      policyHoldersWeight = weight ; 
   
   }



      //getters 
      
   public String getPolicyHoldersFirstName(){
      
      return  policyHoldersFirstName ; 
      
   }
      
   public String getPolicyHoldersLastName(){
      
      return policyHolderslastName ; 
      
   }
      
   public int getPolicyHoldersAge(){
      
      return  policyHoldersAge ; 
      
   }
      
   public String getPolicyHoldersSmokingStatus(){
      
      return policyHoldersSmokingStatus ; 
      
   }
      
   public double getPolicyHoldersHeight(){
      
      return policyHoldersHeight ; 
      
   }
      
   public double getPolicyHoldersWeight(){
      
      return policyHoldersWeight ; 
      
   }
   
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }
   
   public String toString(){
   
      return String.format("Policy Number: "+ policyNumber + 
                        "\nProvider Name: " + providerName + 
                         policy.toString()); 
   }
   
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(age > AGE_THRESHOLD)
         price += ADDITIONAL_FEE_AGE;
         
      if(smokingStatus.equalsIgnoreCase("smoker"))
         price += ADDITIONAL_FEE_SMOKING;
      
      if(getBMI() > BMI_THRESHOLD)
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
         
      return price;
   }


      
      /*toString method*/
      
   public String toString(){
      
      return String.format(
         
         "Policyholder's First Name:"+  policyHoldersFirstName + 
         
         "\nPolicyholder's Last Name:"+ policyHolderslastName +
         
         " \nPolicyholder's Age: " +  policyHoldersAge + 
         
         " \nPolicyholder's Smoking Status (Y/N):" + policyHoldersSmokingStatus +
         
         " \nPolicyholder's Height: " + policyHoldersHeight +
         
         " \nPolicyholder's Weight: " + policyHoldersWeight +
         
         "\nPolicyholder's BMI: " + getBMI() + 
         " \nPolicy Price: $%.2f \n" , getPrice());
      
   }
      
      
   
   

}