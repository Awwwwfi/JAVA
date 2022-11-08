//Unit 04 : Program 02
//Create a class Person that have properties like name and age, 
//create its constructor to initialize those. 
//Create one subclass of Person as Student having a member courseName also create a constructor. 
//Now create another subclass of Person as Employee and create a member called salary, 
//also initialize each member with a constructor. 
//Now you should create a showDetails() method in each class to display details. 
//Create objects of different classes and initialize them and 
//call showDetails() method from each object and show the output.
public class U4P2 {
    public static void main(String[] args) {
        Student stdObj = new Student("Ramesh", 18, "Computer Engg");
        Employee empObj = new Employee("Vishwas", 25, 30000);
        stdObj.showDetails();
        empObj.showDetails();
    }    
}

class Person {
    String strName="";
    int age;
}

class Student extends Person {
    String courseName="";
    Student(String inName, int inAge, String inCourseName){       
        strName = inName;
        age = inAge;
        courseName = inCourseName;
    }    
    public void showDetails(){
        System.out.println("Student Name : "+strName);
        System.out.println("Student Age : "+age);
        System.out.println("Student Course : "+courseName);
    }
}

class Employee extends Person {
    int salary;
    Employee(String inName, int inAge, int inSalary){   
        strName = inName;
        age = inAge;    
        salary = inSalary;
    }  
    public void showDetails(){
        System.out.println("Employee Name : "+strName);
        System.out.println("Employee Age : "+age);
        System.out.println("Employee Salary : "+salary);
    }  
}
