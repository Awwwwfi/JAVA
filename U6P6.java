import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Unit 06 : Program 06
//Create a file called NewSalary.txt and increase each employee’s salary 
//by 10% which was stored in Employee.txt. 
//Store Name, EmpId and Salary in this file also.
public class U6P6 {
    public static void main(String[] args) {
        Employee em[] = new Employee[3];
        try{
            System.out.println("Reading From File Employee.txt");
            FileInputStream fi = new FileInputStream("Employee.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);
            System.out.printf("Name\tEmp-ID\tSalary\n");
            for(int i=0;i<3;i++){
                em[i] = (Employee) oi.readObject();
                System.out.printf("%s\t%d\t%d\n",em[i].name,em[i].empID,em[i].salary);
                em[i].salary = (int)((double)em[i].salary * 1.1);
            }
            oi.close();
            fi.close();

            System.out.println("Writing To File NewSalary.txt");
            FileOutputStream fo = new FileOutputStream("NewSalary.txt");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            System.out.printf("Name\tEmp-ID\tNEW-Salary\n");
            for(int i=0;i<3;i++){
                oo.writeObject(em[i]);
                System.out.printf("%s\t%d\t%d\n",em[i].name,em[i].empID,em[i].salary);
            }
            oo.close();
            fo.close();
        }catch(Exception e){
            e.printStackTrace();
        }        
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
