import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Write a program that takes the exam scores of Maths, Physics, Chemistry, Biology, History and
        Turkish courses from the user and calculates the average.
        */

        Scanner scanner = new Scanner(System.in);
        int Maths,Pyhsics,Chemistry,Biology,Turkish,History;

        System.out.print("Maths class grade: ");
        Maths = scanner.nextInt();
        System.out.print("Physics class grade: ");
        Pyhsics = scanner.nextInt();
        System.out.print("Chemistry class grade: ");
        Chemistry = scanner.nextInt();
        System.out.print("Biology class grade: ");
        Biology = scanner.nextInt();
        System.out.print("Turkish class grade: ");
        Turkish = scanner.nextInt();
        System.out.print("History class grade: ");
        History = scanner.nextInt();

        double average = (Maths+Pyhsics+Biology+Chemistry+Turkish+History)/6.0 ;

        String information = (average >=60) ? "passed the class" : "failed the class ";

        System.out.println("your grade average = "+average+"\n"+information);


    }
}
