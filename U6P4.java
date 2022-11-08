import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Unit 06 : Program 04
//Create a file Employee.txt having employee details of name, empID and salary.
public class U6P4 {
    public static void main(String[] args) {
        Employee em[] = new Employee[3];
        em[0] = new Employee("Rina", 56, 18000);
        em[1] = new Employee("Manoj", 25, 28000);
        em[2] = new Employee("Suraj", 61, 15000);
        try{            
            FileOutputStream fo = new FileOutputStream("Employee.txt");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            for(int i=0;i<3;i++){
                oo.writeObject(em[i]);
            }
            oo.close();
            fo.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("File Created!!");
    }
}


class Employee implements Serializable{
    private static final long serialVersionUID = 1L;
    String name = "";
    int empID = 0;
    int salary = 0;
    Employee(String name, int empID, int salary){
        this.name = name;
        this.empID = empID;
        this.salary = salary;
    }
}
