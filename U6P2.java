//Unit 06 : Program 02
//Read the contents of file Student.txt and 
//display it in a tabular form in the console window.
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class U6P2 {
    public static void main(String[] args) {
        Student s[] = new Student[3];
        try{
            FileInputStream fi = new FileInputStream("Students.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);
            System.out.printf("Name\tNumber\tMaths\tScience\tEnglish\n");
            for(int i=0;i<3;i++){
                s[i] = (Student) oi.readObject();
                System.out.printf("%s\t%d\t%d\t%d\t%d\t\n",s[i].name,s[i].number,s[i].markSub1,s[i].markSub2,s[i].markSub3);            
            }
            oi.close();
            fi.close();
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}

class Student implements Serializable{
    private static final long serialVersionUID = 1L;
    String name = "";
    int number = 0;
    int markSub1 = 0;
    int markSub2 = 0;
    int markSub3 = 0;    
}