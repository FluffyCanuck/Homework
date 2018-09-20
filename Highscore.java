/*Matthew Osborne 
 * ISC4U
 * September 18 2018
 * 
 * Brief Description:
 * a program that prompts the user for their name, age, and address, and then outputs this information using one or two 
 * nicely formatted sentences.
 * */

import java.io.*;
class Highscore
{
 public static void main(String[] args)
 {
   InputStreamReader inStream = new InputStreamReader(System.in);
   BufferedReader bufRead = new BufferedReader(inStream);
   
   int[] integers = new int[100];
   String [] names = new String [100];
   int rando = 0;
   String game = " ";
   int cells = 0;
   
   try
    {
      FileReader fr = new FileReader("dataFile.txt");
      BufferedReader br = new BufferedReader(fr);
      System.out.print("Please enter the name of the game: ");
      game = bufRead.readLine();
      rando = (int)((1000000000*Math.random())-1);
      System.out.print("Your score is " + rando);
      do
      {
        if(intergers[cells] < rando)
        {
          intergers[cells] = 
      
        
      
      
      pw.close(); // close file for writing
   }
   
