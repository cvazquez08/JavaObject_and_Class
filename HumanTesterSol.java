/* Author: Dr. Walker
   Version 2
   The Human Tester class contains all of the instance variables and methods for a human
  */

import java.util.ArrayList; // import the ArrayList class
  
public class HumanTesterSol
{

   public static void main(String [] args)
   {
      //Variable declarations
      String pronoun = "";
      double change = 0;
      
      //Friend objects
     // Human friend1 = new Human("Charles", "Pollock", "male", "blonde", "brown", "5 feet 6 inches",  25, 230.50);
      //Human friend2 = new Human("Ava", "Pasnon", "female", "black", "brown", "5 feet 4 inches", 23, 325.98);
      //Human friend3 = new Human("Sam", "Jones", "male", "brown", "green", "6 feet 3 inches", 20, 125.32);
      
      //Friend ArrayList
      ArrayList<HumanSol> friends = new ArrayList<HumanSol>();
           friends.add(new HumanSol("Charles", "Pollock", "male", "blonde", "brown", "5 feet 6 inches",  25, 230.50));
           friends.add(new HumanSol("Ava", "Pasnon", "female", "black", "brown", "5 feet 4 inches", 23, 325.98));
           friends.add(new HumanSol("Sam", "Jones", "male", "brown", "green", "6 feet 3 inches", 20, 125.32));

      
      //updated output code
      
      for(HumanSol friend: friends)
      {
      
         if(friend.getGender().equalsIgnoreCase("male"))
         {
            pronoun = "He";
         }
         else
         {
            pronoun = "She";
         }
         
               
         System.out.println("My friend is named: " + friend.getFullName() + ". " + pronoun +" is " + friend.getAge() 
                           + " years old with " + friend.getHair() + " hair and " + friend.getEye() + " eyes. " + pronoun
                           + " is " + friend.getHeight() + " tall."); 
      }
      //Print out friend information
      
      /*Frined 1
      if(friend1.getGender().equalsIgnoreCase("male"))
      {
         pronoun = "He";
      }
      else
      {
         pronoun = "She";
      }
      
            
      System.out.println("My friend is named: " + friend1.getFullName() + ". " + pronoun +" is " + friend1.getAge() 
                        + " years old with " + friend1.getHair() + " hair and " + friend1.getEye() + " eyes. " + pronoun
                        + " is " + friend1.getHeight() + " tall."); 
                        
      //Friend 2
       if(friend2.getGender().equalsIgnoreCase("male"))
      {
         pronoun = "He";
      }
      else
      {
         pronoun = "She";
      }

      System.out.println("My friend is named: " + friend2.getFullName() + ". " + pronoun +" is " + friend2.getAge() 
                        + " years old with " + friend2.getHair() + " hair and " + friend2.getEye() + " eyes. " + pronoun
                        + " is " + friend2.getHeight() + " tall."); 
                        
     
      //Friend 3
       if(friend3.getGender().equalsIgnoreCase("male"))
      {
         pronoun = "He";
      }
      else
      {
         pronoun = "She";
      }

      System.out.println("My friend is named: " + friend3.getFullName() + ". " + pronoun +" is " + friend3.getAge() 
                        + " years old with " + friend3.getHair() + " hair and " + friend3.getEye() + " eyes. " + pronoun
                        + " is " + friend3.getHeight() + " tall."); 
                        
      System.out.println();
      */

      //Updating ag
      if(friends.get(0).getGender().equalsIgnoreCase("male"))
      {
         pronoun = "He";
      }
      else
      {
         pronoun = "She";
      }
      
      friends.get(0).haveBirthday();
      
      System.out.println(friends.get(0).getFirstName() + " just celebrated a birthday! " + pronoun + " is now " + friends.get(0).getAge()
                         + " years old.");
      
      System.out.println();
      
      //Getting a raise
      if(friends.get(1).getGender().equalsIgnoreCase("male"))      {
         pronoun = "He";
      }
      else
      {
         pronoun = "She";
      }
      
      change = 50.25;
      
      friends.get(1).payChange(change);
      
      System.out.println(friends.get(1).getFirstName() + " received a raise in pay! " + pronoun + " was making " 
                         + (friends.get(1).getPay() - change) + " per week. "
                         + pronoun + " is now making "
                         + friends.get(1).getPay() + " per week.");
      
      System.out.println();
      
      //Reduction in pay
      if(friends.get(2).getGender().equalsIgnoreCase("male"))
      {
         pronoun = "He";
      }
      else
      {
         pronoun = "She";
      }
      
      change = -25.66;
      
      friends.get(2).payChange(change);
      
      System.out.println(friends.get(2).getFirstName() + " is working fewer hours per week. " + pronoun + " was making "
                         + (friends.get(2).getPay() - change) + " per week. " + pronoun + " is now making "
                         + friends.get(2).getPay() + " per week.");
                                    
   }

}