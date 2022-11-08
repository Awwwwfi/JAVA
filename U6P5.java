import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

//Unit 06 : Program 05
//Read the file Employee.txt and get the data on console window.
public class U6P5 {
    public static void main(String[] args) {
        Employee em[] = new Employee[3];
        try{
            FileInputStream fi = new FileInputStream("Employee.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);
            System.out.printf("Name\tEmp-ID\tSalary\n");
            for(int i=0;i<3;i++){
                em[i] = (Employee) oi.readObject();
                System.out.printf("%s\t%d\t%d\n",em[i].name,em[i].empID,em[i].salary);            
            }
            oi.close();
            fi.close();
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
