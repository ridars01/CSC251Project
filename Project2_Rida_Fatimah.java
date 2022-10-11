import java.util.*; 
import java.io.*;

public class Project2_Rida_Fatimah
{//open the class container

   public static void main(String [] args)
   {//open the main method
   
      try{
      /*Create an instance of the file class*/
         File file = new File("PolicyInformation.txt");
         
      /*Pass a refrence to the File object as an argument*/
         Scanner inputFile = new Scanner(file);
      
      //declare the variables
         String policyNumber;
         String providerName;
         String firstName;
         String lastName;
         int age;
         String smokingStatus;
         double height = 0.0;
         double weight = 0.0;
      
      //Create an array list to store the objects.
      
         ArrayList<Policy> policy = new ArrayList<Policy>();
      
      /*Use a while loop to read the file*/
      
         while(inputFile.hasNext()){//open loop
         
            policyNumber = inputFile.nextLine();
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName= inputFile.nextLine();
            age= inputFile.nextInt();
            smokingStatus = inputFile.nextLine();
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();
         
            if(inputFile.hasNext()){
               inputFile.nextLine();
               inputFile.nextLine();
            }
         
         /*Create Policy objects*/
         
            Policy p = new Policy(policyNumber ,providerName , firstName , lastName , age,smokingStatus,height,weight );
         
         /*Add policy objects to the Array*/
            policy.add(p);
         
         
         }//close loop
      
         inputFile.close();//Close File
      
      //use a for loop to display the output
         for(int i = 0 ; i <policy.size(); i++){
         
            System.out.println("Policy Number: " + policy.get(i).getPolicyNumber());
            System.out.println("Provider Name: " + policy.get(i).getProviderName());
            System.out.println("Policyholder's First Name: " + policy.get(i).getFirstName());
            System.out.println("Policyholder's Last Name: " + policy.get(i).getLastName());
            System.out.println("Policyholder's Age: " + policy.get(i).getAge());
            System.out.println("Policyholder's Smoking Status: " + policy.get(i).getSmokingStatus());
            System.out.println("Policyholder's Height: " + policy.get(i).getHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policy.get(i).getWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f\n", policy.get(i).getBMI());
            System.out.printf("Policy Price: $%.2f\n", policy.get(i).getPrice());
         
            policiesWithSmoker+= policy.get(i).getSmokingStatus();
            policiesWithNonSmoker+=policy.get(i).getSmokingStatus();
         
         }
      
         System.out.println("The number of policies with a smoker is: "+policiesWithSmoker);
         System.out.println("The number of policies with a non-smoker is: "+policiesWithNonSmoker);
      
      }//Close try block
      
      
      catch(IOException ex)
      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
   
   
   }//close main
}//close container