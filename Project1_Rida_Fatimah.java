import java.util.*; 

public class Project1_Rida_Fatimah{

   public static void main(String [] args){
   
      Scanner keyboard = new Scanner(System.in);
   
      Policy P = new Policy(); 
      
      int policyNumber = 0 ; 
      String providerName = "";
      String firstName = "";
      String lastName = "";
      int age = 0; 
      String smokingStatus = "";
      double height =0.0;
      double weight= 0.0; 
   
      System.out.print("Please enter the Policy Number:");
      policyNumber = keyboard.nextInt();
      P.setPolicyNumber(policyNumber);
      
     
      System.out.print("Please enter the Provider Name:");
      keyboard.nextLine();
      providerName = keyboard.nextLine();
      P.setProviderName(providerName);
      
      
      System.out.print("Please enter the Policyholder’s First Name: ");
      firstName = keyboard.nextLine();
      P.setFirstName(firstName);
      
      
      System.out.print("Please enter the Policyholder’s Last Name: ");
      lastName = keyboard.nextLine();
      P.setLastName(lastName);
      
   
   
      System.out.print("Please enter the Policyholder’s Age: ");
      age = keyboard.nextInt();
      P.setAge(age);
     
      
      
      System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      keyboard.nextLine();
      P.setSmokingStatus(smokingStatus);
      
      
      
      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      height = keyboard.nextDouble();
      P.setHeight(height);
      
      
      
      System.out.print("Please enter the Policyholder’s Weight (in pounds):  ");
      weight = keyboard.nextDouble();
      P.setWeight(weight);
      
      
      
      
      //Print the statements: 
      
      System.out.println("Policy Number: " +P.getPolicyNumber()); 
      System.out.println("Provider Name: " +P.getProviderName());
      System.out.println("Policyholder’s First Name: " +P.getFirstName());
      System.out.println("Policyholder’s Last Name: " +P.getLastName());
      System.out.println("Policyholder’s Age: " +P.getAge());
      System.out.println("Policyholder’s Smoking Status: " +P.getSmokingStatus());
      System.out.println("Policyholder’s Height: " +P.getHeight());
      System.out.println("Policyholder’s Weight: " +P.getWeight());
     
      System.out.println("Policyholder’s BMI: " +P.calcBMI());
      System.out.println("Policy Price: $" +P.price());
   
   }

}