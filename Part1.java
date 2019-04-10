import java.util.Scanner;
import java.io.*;

/**
 * This program reads in several students grades from a file and computes a
 * class average.
 *
 * @author Jason Heard
 */
public class Part1
{

    public void run ()
    {
        try {
            Scanner infile = new Scanner (new File("data1.txt"));

            int numberStudents = infile.nextInt();

            double sum = 0;
            for (int count = 1; count <= numberStudents; count++)
            {
                infile.nextLine();
                String studentName = infile.nextLine();
                double grade = infile.nextDouble();

                System.out.println (studentName + "\t" + grade);
                sum = sum + grade;
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
