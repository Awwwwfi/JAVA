//Unit 06 : Program 03
//Create a new file called StuPercentage.txt and 
//store the data of name, number and percentage of each student. 
//Get those data from Student.txt
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class U6P3 {
    public static void main(String[] args) {
        Student s[] = new Student[3];
        StudentPercentage sp[] = new StudentPercentage[3];
        try{
            FileInputStream fi = new FileInputStream("Students.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);
            System.out.printf("Name\tNumber\tPercentage\n");
            for(int i=0;i<3;i++){
                s[i] = (Student) oi.readObject();
                sp[i] = new StudentPercentage();
                sp[i].name = s[i].name;
                sp[i].number = s[i].number;
                sp[i].percentage = (s[i].markSub1+s[i].markSub2+s[i].markSub3)/3;
                System.out.printf("%s\t%d\t%f\n",sp[i].name,sp[i].number,sp[i].percentage);            
            }
            oi.close();
            fi.close();

            FileOutputStream fo = new FileOutputStream("StuPercentage.txt");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            for(int i=0;i<3;i++){
                oo.writeObject(sp[i]);
            }
            oo.close();
            fo.close();
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

class StudentPercentage implements Serializable {    
    private static final long serialVersionUID = 2L;
    String name = "";
    int number = 0;
    double percentage = 0.0;
}
