package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

            double totalMarks = 0, markNumb, counter = 0, average;
            String mark;
            System.out.print("Insert a mark: ");
             mark = scan.nextLine();   // we read the mark as string to check the word "end"

            while (!mark.equals("end"))  // if the mark isn't an "end" then we pass it to double to work with it
            {
                markNumb = Double.parseDouble(mark);
                counter++;   //counter of numbers
                totalMarks += markNumb;  // sum of all the notes
                System.out.print("Insert a mark: ");
                mark = scan.next();
            }


            //Once we type "end", we calculate and show the media
              average = totalMarks / counter;  //calculate the average media=sumanotas/totalnotas
                System.out.println("The average is" +average+".");

    }
}

