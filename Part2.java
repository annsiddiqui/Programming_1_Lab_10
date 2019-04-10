import java.util.Scanner;
import java.io.*;

/**
 * This program reads in several students grades from a file and computes a
 * class average.
 *
 * @author Jason Heard
 * @author Qurrat-al-Ain Siddiqui
 */
public class Part2
{

    public void run ()
    {
        try {
            Scanner infile = new Scanner (new File("data2.txt"));
            Scanner keyboard = new Scanner (System.in);
            
            System.out.println("What is the file name?");
            String fileName = keyboard.nextLine();
            
            
            int numberStudents = 0;

            double sum = 0;
            while (numberStudents == -1)
            {
                infile.nextLine();
                String studentName = infile.nextLine();
                double grade = infile.nextDouble();

                System.out.println (studentName + "\t" + grade);
                sum = sum + grade;
                numberStudents++;
            }

            double classAverage = 0;
            if (numberStudents > 0) {
                classAverage = sum / numberStudents;
            }

            System.out.println ("The class average is:  " + classAverage);

            infile.close();
        } catch (FileNotFoundException ex) {
            System.out.println ("ERROR: the file could not be found!");
        }
    }

}
