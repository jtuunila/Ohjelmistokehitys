/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Käyttäjä
 */
public class Task {
    
    /*
    1 Create a Java application that prints out the text ”Hello World!”
    2 Read the System class documentation. What is the meaning of System class → what you can do with it?
    3 Print out the data returned by System class getenv() function. What is printed out?
    4 Call the getenv() function with parameter ”USERNAME” i.e. System.getenv(”USERNAME”), what it does print out?
    5 What the function getProperties() returns if you print it out?
    */
    public  void ShowTask1()
    {
       System.out.println("Hello World!");
       //System.out.println(System.getenv());
       //System.out.println(System.getenv("USERNAME"));
       //System.out.println(System.getenv("PATH"));
       //System.out.println(System.getProperties());
       System.out.println(System.getProperty("user.dir"));        
    }
    
    /*
    1 Modify the previous application so that the application asks the name of the user and prints it out.
    2 Read the documentation of Scanner class
    3 What is the difference between next() and nextLine() functions? (try also in code)
    4 Read the String class documentation
    5 Print out the length of the name also
    6 Print out the third letter of the name
    7 Replace all the 'a' characters in name with character 'b'
    */
    public  void ShowTask2()
    {
       System.out.println("Tell me your name");
       Scanner myScanner = new Scanner(System.in);
       String Name = myScanner.nextLine();

      
       System.out.println("\nName lenght: "+Name.length());
       System.out.println("\nThird letter of the name("+Name+") is: "+Name.charAt(2));  
       System.out.println("\nA's are replaced with B's: "+Name.replace("a", "b")); 
    } 
     
    /*
    3.Create a BMI calculator application. The application first asks the user weight (in kg). 
    The weight can be given as floating point number i.e. 80.5. Program checks that given value is not an negative number...
    When correct weight is given the application ask the height of the person in meters i.e. 1.85. Again program checks that 
    the given value is a positive number.
    After the weight and and height  has been given, the application calculates the BMI using the next formula weight/height * height. The results is printed to user using next categorias
    A BMI of less than 18 means you are under weight. 
    A BMI of less than 18.5 indicates you are thin for your height. 
    A BMI between 18.6 and 24.9 indicates you are at a healthy weight. 
    A BMI between 25 and 29.9 suggests you are overweight for your height. 
    A BMI of 30 or greater indicates obesity. If you are obese, consider consulting a doctor or losing weight. 
    */
    public  void ShowTask3()
    {
      System.out.println("This is BMI calculator.");
      Scanner myScanner = new Scanner(System.in);
      float weight = 0;
      float height = 0;
      do
      {
       System.out.println("Tell me your weight in kilograms.(e.g. 82,6)");  
       weight = myScanner.nextFloat();
      }
      while (weight < 0);
      //System.out.println("Weight ok");
      
      do
      {
       System.out.println("Tell me your height in meters. (e.g. 1,79)");  
       height = myScanner.nextFloat();
      }
      while (height < 0);
      //System.out.println("Height ok");
      
      
      
      float BMI = weight/(height*height);
      //float BMI = 36.4f;
      String BmiCondition;
      if(BMI < 18)
      {
          BmiCondition = "You are underweight.";
      }
      else if ( BMI > 18 && BMI < 18.5f)
      {
          
          BmiCondition = "You are a bit thin.";
      }
      else if ( BMI > 18.6f && BMI < 24.9f)
      {
          
          BmiCondition = "You have healthy weight for your size.";
      }
      else if ( BMI > 25f && BMI < 29.9f)
      {
          
           BmiCondition = "You are a bit overweight.";
      }
      else
      {
           BmiCondition = "You are overweight for your size. Talk with your doctor.";
      }
      
      System.out.println("Your BMI is "+Float.toString(BMI)+ ". "+BmiCondition);  
      
    } 
    
    /*
    4.Create a Number Guess Game application. The application randoms a value between 1-100 (See Java Random class or Math class for randoming numbers). 
    Then the application asks the user to guess the number. If user guess is too big, the application prints out ”The number you guessed is too big”. 
    If the number is smaller then application prints out ”The number is too small”. If the user guess the correct number the application prints out 
    i.e. ”You guessed correctly. The number was 42. You used 7 turns to get correct number!”
    You need to use recursion in your application (while or do while) to make the ”game event loop” .
    Extra: Make a menu where user can select a degree of difficulty. i.e
    1. Random between 1-100
    2. Random between 1-500
    */
    public  void ShowTask4()
    {
        
        System.out.println("This is the ultimate guessing game!\nYou need to guess randomized number between 0 and number given by you\nSet difficulity by setting biggest possible number.(e.g. 2400).");
        Scanner myScanner = new Scanner(System.in);
        int maxValue = myScanner.nextInt();
        Random randomizer = new Random();
        
        // Correct answer 
        int RandomAnswer = randomizer.nextInt(maxValue);
         System.out.println("The secret number is randomized between 0 and "+maxValue+"\nLet's find out what it is");
        //System.out.println(RandomAnswer);
        int answer;
        int answerCount = 0;
        do
        {
            answerCount = answerCount +1;
          System.out.println("Guess the number:"); 
          answer = myScanner.nextInt();
          
          if(answer < RandomAnswer)
          {
             System.out.println("Good, but the secret number is bigger!"); 
          }
          else if (RandomAnswer < answer)
          {
             System.out.println("Not bad, but the secret number is smaller!");  
          }
        }while(RandomAnswer != answer);  
        System.out.println("Great!!! You got it. Only " + answerCount+ " try.");   
    }
    
    /*
    Create a next array in your application
    String[] strArray = new String [6];
    strArray[0] = ”Hello”;
    strArray[1] = ”there”;
    strArray[2] = ”you”;
    strArray[3] = ”stranger.”;
    strArray[4] = ”Good”;
    strArray[4] = ”Bye”;
      Create a foor loop and print out the content of array
    */
    public  void ShowTask5()
    {   
    String[] strArray = new String [6];
    strArray[0] = "Hello";
    strArray[1] = "there";
    strArray[2] = "you";
    strArray[3] = "stranger.";
    strArray[4] = "Good";
    strArray[4] = "Bye";
    
    System.out.println("Lets print the array"); 
    for(int i=0; i<strArray.length; i++)
    {
       System.out.println(strArray[i]); 
    }
    }
    
    /*
     6. Create an application that has an int array with size of 10. The application then asks 10 integer numbers from 
    the user and calculates the average of given values. Application prints out the calculated average and highest and 
    the smmallest number in the array. Extra: Make the application also print out only the odd numbers.
    */
    public  void ShowTask6()
    {   
    int NumberArray[] = new int[10];
    int SumOfNumbers = 0;
    int HighestNumber =0;
    int LowestNumber = 0;
    System.out.println("Tell me ten numbers. I will store those and calculate the average and tell you the highest and lowest value"); 
    Scanner numberScanner = new Scanner(System.in);
    for(int i=0; i<NumberArray.length; i++)
    {
        
       System.out.println("Tell me a number");
       NumberArray[i] = numberScanner.nextInt();
       
       if(i == 0)
       {
          HighestNumber =  NumberArray[i];
          LowestNumber = NumberArray[i];
       }
       
       if (NumberArray[i] < LowestNumber)
       {
           LowestNumber = NumberArray[i];
       }
       
       if (NumberArray[i] > HighestNumber)
       {
           HighestNumber = NumberArray[i];
       } 
       
       
       SumOfNumbers = SumOfNumbers +NumberArray[i];
    }
    
    System.out.println("Sum of numbers: "+SumOfNumbers);
    System.out.println("Lowest given number: "+LowestNumber);
    System.out.println("Highest given number: "+HighestNumber);
    
    
    System.out.println("Lets print the given numbers");
    for(int i=0; i<NumberArray.length; i++)
    {
       System.out.println("Array["+i+"]: " +NumberArray[i]);
       
    }
    System.out.println("Lets print odd numbers");
    for(int i=0; i<NumberArray.length; i++)
    {
        if (NumberArray[i]%2 != 0)
        { 
        System.out.println(NumberArray[i]);
        }
    }
    }    
    
    /*
      7. Create next two-dimensional array in your application:
    int[ ][ ] aryNumbers = new int[6][5];
    aryNumbers[0][0] = 10;
    aryNumbers[0][1] = 12;
    aryNumbers[0][2] = 43;
    aryNumbers[0][3] = 11;
    aryNumbers[0][4] = 22; 
    aryNumbers[1][0] = 20;
    aryNumbers[1][1] = 45;
    aryNumbers[1][2] = 56;
    aryNumbers[1][3] = 1;
    aryNumbers[1][4] = 33; 
    Make the application  print out all the values from array above.
    */
    public  void ShowTask7()
    {
        int[ ][ ] arrayNumbers = new int[2][5];
        arrayNumbers[0][0] = 10;
        arrayNumbers[0][1] = 12;
        arrayNumbers[0][2] = 43;
        arrayNumbers[0][3] = 11;
        arrayNumbers[0][4] = 22; 
        arrayNumbers[1][0] = 20;
        arrayNumbers[1][1] = 45;
        arrayNumbers[1][2] = 56;
        arrayNumbers[1][3] = 1;
        arrayNumbers[1][4] = 33;  

        for ( int i=0; i<arrayNumbers.length; i++ ) 
        {
            for (int j=0; j<arrayNumbers[i].length; j++) 
                { 
                    System.out.print(" " + arrayNumbers[i][j]);
                }
            System.out.println("");
        }
    }
    
    /*
    8.Create a simple class with name Circle.
    Define next private fields for it
    penWidth which type is int and boundaries are 0-10 default value is 0
    penColor which type is String and values can red, blue, black, and green. Default value is none
    radius which type is float and it boundaries are 0-n default value is 0
    fillColor which type is String and values can red, blue, black, and green. Default value is none
    Define getter and setter functions for class
    Define a default (non argument) constructor for class Circle
    Overload the constructor so that it takeas all the same argumenst as there are fields in the class.
    Create an object from class Circle. Set all the possible fields to object. Print out the values from object.
    */
    public  void ShowTask8()
    {
    CircleTask8 defaultCircle = new CircleTask8();
    CircleTask8 myCircle = new CircleTask8(1, CircleTask8.EColor.BLACK, 2.0f, CircleTask8.EColor.GREEN);
    }
    
        
}

class CircleTask8
{
    public enum EColor
    {
    NONE, RED, BLACK, BLUE, GREEN 
    }    
    
    
  private int penWidth;         // 0-10
  private String penColor;      // default NONE
  private float radius;         // 0-n
  private String fillColor;     // default NONE

  // Default constructor
  public void Circle()
  {
      
  }
  
  public void Circle(int penWidth, String penColor, float radius, String fillColor)
  {
      setPenWidth(penWidth);
      setPenColor(penColor);
      setRadius(radius);
      setFillColor(fillColor);
  }
  
    public int getPenWidth()
    {
        return penWidth;
    }

    public void setPenWidth(int penWidth)
    {
        if (penWidth < 0 || penWidth > 10)
        {
        this.penWidth = 0;   
        }
        else
        {
        this.penWidth = penWidth;    
        }
        
    }

    public String getPenColor()
    {
        return penColor;
    }

    public void setPenColor(String penColor)
    {
        
        this.penColor = penColor;
    }

    public float getRadius()
    {
        return radius;
    }

    public void setRadius(float radius)
    {
        if (radius > 0)
        {
        this.radius = radius;
        }
    }

    public String getFillColor()
    {
        return fillColor;
    }

    public void setFillColor(String fillColor)
    {
        this.fillColor = fillColor;
    }
  
}
