package student;
import java.util.List;
import java.util.ArrayList;
// it is the class of student.
public class Student{
    
    // this list will store objects of student
     static  List<Student>Regestered=new ArrayList<>();
     private String name;
     private int yearAndSemister;
     private  String id;
   // constructer for student class   
      public Student(String name, int yearAndSemister, String id){
             this.name=name;
             this.yearAndSemister=yearAndSemister;
             this.id=id;
}
    // method for getting name,id,year
      public String getName() {
      return name;
    }
     public static List<Student> getRegestered() {
        return Regestered;
      }
    public int getYear() {
          return yearAndSemister;}
     public String getId() {
      return id;
  }

   // method to  add object into  a list 
      public void regestration(Student object){
      Regestered.add(object);
    }
  // this method used  for  dispalying  student information after regestration
     public void  display(){
          System.out.println("collect your  slip");
          
          
            String slip=("""
                                ...............................................................
                          name:-%s ......  yearandsemister:-%s ............  id:-%s..
                           ....................................................................                                                             
                    """);
                     System.out.println(
                   String.format(slip, name, yearAndSemister,id));   
                   
                          
         }
        
   // this method used to show all the students
   public void showingStudent(){
          for(int i=0;i<Regestered.size();i++){
              Student stud= Regestered.get(i);
              System.out.print(" "+ "name:"+" "+ stud.name);
              System.out.print( " "+"year:"+" "+stud.yearAndSemister);
              System.out.println();
    
    String slip=("""
                                ...............................................................
                          name:-%s ......  year:-%s ............  id:-%s..
                           ....................................................................                                                             
                    """);
                           System.out.println(
                   String.format(slip, name, yearAndSemister,id));   
                                     

                  
                  
                  }
}
// this method used for removing student from the list using id
public void removing(String id){
    for(int i=0;i<Regestered.size();i++){
        Student object1= Regestered.get(i);

        if (object1.getId().equals(id)){
            Regestered.remove(i);
            System.out.println("you deleted success fully");
        }
    }
}
}
