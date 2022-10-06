public class Policy {

//Declaring fields 
   private int policyNumber; 
   private String providerName;
   private String firstName;
   private String lastName;
   private int age; 
   private String smokingStatus;
   private double height;
   private double weight; 

/*No-arg Constructor*/

   public Policy(){
   
      policyNumber = 0; 
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0; 
      smokingStatus = "";
      height = 0.0;
      weight = 0.0; 
   
   }

/*Constructor that accepts argument for each field*/
   public Policy(int policyNum , String provName , String firstName , String lastName , int age , String smokingStat , double height , double weight){
   
      policyNumber = policyNum; 
      providerName = provName;
      firstName = firstName;
      lastName = lastName;
      age = age; 
      smokingStatus = smokingStat;
      height = height;
      weight = weight; 
   }

               /*Setters*/
   public void setPolicyNumber(int policyNum){
      policyNumber = policyNum;
   
   }

   public void setProviderNamer(String provName){
      providerName = provName;
   
   }

   public void setFirstName(String firstName){
      firstName = firstName;
   
   }

   public void setLastName(String lastName){
      lastName = lastName;
   
   }

   public void setAge(int age){
      age = age; 
   
   }

   public void setSmokingStatus(String smokingStat){
      smokingStatus = smokingStat;
   
   }

   public void setHeight(double height){
      height = height;
   
   }

   public void setWeight(double weight){
      weight = weight; 
   
   }


            /*Getters*/
            
   public int getPolicyNumber(){
   
      return policyNumber;
   }

   public String getProviderNamer(){
   
      return providerName;
   }

   public String getFirstName(){
   
      return firstName;
   }

   public String getLastName(){
   
      return lastName;
   }

   public int getAge(){
      return age; 
   
   }
   public String getSmokingStatus(){
   
      return smokingStatus;
   }

   public double getHeight(){
      return height;
   }

   public double getWeight(){
      return weight;
   }

   public double calcBMI(){
      double BMI = 0.0; 
   
      BMI = ((weight * 703) / (Math.pow(height,2)));
      return BMI;
   }

   public double price(){
   
      double addFee = 0.0;
      int baseFee = 600;
   
      if(age > 50){
         addFee = 75; 
      }
   
      if(smokingStatus == "smoker"){
         addFee = 100;
      }
      if(calcBMI() > 35){
      
         addFee = ((calcBMI() - 35) *20);
      }
      return addFee;
   }


}