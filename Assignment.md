class Student()
{
  private String name;
  private int age;
  private String email;
  private String address;
 
 Student()
 {
   age=22;
   name="Anusha";
   email="anush@gmail.com";
   address="xyxabc";
 }
//getters
public String getName()
{ 
return name;
}
public int getAge()
{
return age;
}
public String getEmail()
{
return email;
}
public String getAddress()
{
return address;
}
//setters
public void setName()
{
name="Anusha";
}
public void setAge()
{
age=22;
}
public void setEmail()
{
email="anush@gmail.com;
}
public void setAddress()
{
address="xyxabc";
}
}
class Teacher
{
  private String name;
  private int age;
  private String email;
  private String address;
  
  Teacher()
  {
   name= "xyz";
   age= 45;
   email="xyz@gmail.com"
   address="abcdabcd"
   }
   public String getName()
   {
   return name;
   }
   public int getAge()
   {
   return age;
   }
   public String getEmail()
   {
   return email;
   }
   public String getAddress()
   {
   return address;
   }
   public void setName()
   {
   name="xyz";
   }
   public void setAge()
   {
   age= 45;
   }
   public void setEmail()
   {
   email="xyz@gmail.com";
   }
   public void setAddress()
   {
   address="abcdabcd";
   }
   class Batch
   {
    private String name;
    private int size;
    private Student[] Student;
    private Teacher Teacher;
    
    Batch()
    {
    name="abcd";
    size=10;
    Students={10, 20, 30};
    Teacher="xyz";
    }
    public String getName()
    {
    return name;
    }
    public int getSize()
    {
    return size;
    }
    public Student[] getStudent()
    {
     for(int i=0; i<Students.length-1; i++)
     return Student[i];
     }
    public Teacher getTeacher()
    {
    return Teacher;
    }
    public void setName()
    {
    name="abcd";
    }
    public void setSize()
    {
    size= 10;
    }
    public void setStudents()
    {
    Students={10,20,30};
    }
    public void setTeacher()
    {
     Teacher="xyz";
     }
 }
 public class EncapsulationDemo
 {
 public static void main(String[] args)
   {
   Student S=new Student();
   Teacher T=new Teacher();
   Batch B=new Batch();
   System.out.println("Student age:"+ S.getAge()+ "Student Name:"+ S.getName()+"Student email:"+S.getEmail()+ "Student address:"+S.getAddress());
   System.out.println("Teacher age:"+ T.getAge()+ "Teacher Name:"+ T.getName()+"Teacher email:"+T.getEmail()+ "Teacher address:"+S.getAddress());
   System.out.println("Batch size:"+ B.getSize()+ "Batch Name:"+ B.getName()+"Students :"+B.getStudents()+ "Teacher:"+B.getTeacher());
  
   }
 
