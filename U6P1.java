import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

//Unit 06 : Program 01
//Create a file named Students.txt having the data of 3 students 
//of their name, number and marks of 3 subjects. Get those data from user.
public class U6P1 {
    public static void main(String[] args) {
        Student s[] = new Student[3];
        for(int i=0;i<3;i++){
            s[i] = new Student();
            // s[i].getData();
        }
        try{
            FileOutputStream fo = new FileOutputStream("Students.txt");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            for(int i=0;i<3;i++){
                oo.writeObject(s[i]);
            }
            oo.close();
            fo.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("File Created!!");
    }
}

class Student implements Serializable{
    private static final long serialVersionUID = 1L;
    String name = "";
    int number = 0;
    int markSub1 = 0;
    int markSub2 = 0;
    int markSub3 = 0;
    Student(){        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        name = input.next();
        System.out.print("Enter Student Number : ");
        number = input.nextInt();
        System.out.print("Enter Maths Marks : ");
        markSub1 = input.nextInt();
        System.out.print("Enter Science Marks : ");
        markSub2 = input.nextInt();
        System.out.print("Enter English Marks : ");
        markSub3 = input.nextInt();
    }

    @Override
    public String toString() {
        return "Name:" + name + "\nNumber: " + number + "\nMarks(Maths): " + markSub1+ "\nMarks(Science): " + markSub2+ "\nMarks(English): " + markSub3;
    }

}