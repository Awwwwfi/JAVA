//Unit 04 : Program 04
//Create Interface Student with data enrno and name, 
//extend 2 sub interfaces called Exam containing data member CPI and 
//another Sports containg data members event and marks, 
//now derive interfaces Student and Sports into another class StudentPerformance 
//containing display() method to display all the info of student. 
//(If not possible then justify the reason!)
public class U4P4 {
    public static void main(String[] args) {
        StudentPerformance myObj = new StudentPerformance();
        myObj.display();
    }
}

interface Student{
    int enrno=2001350012;
    String name="Ramesh";    
}

interface Exam extends Student{
    double CPI=8.8;    
}

interface Sports extends Student{
    String event="Running";
    int marks=9;    
}

class StudentPerformance implements Exam, Sports {
    public void display(){
        System.out.println("Enrollment No. : "+enrno);
        System.out.println("Name : "+name);
        System.out.println("CPI : "+CPI);
        System.out.println("Event : "+event);
        System.out.println("Marks : "+marks);
    }    
}
