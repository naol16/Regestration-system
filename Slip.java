package student;
import java.util.ArrayList;
import java.util.List;
// slip for adding courses for the specified year and semisters 
public class Slip {
   protected int credit;
   protected String course;
   protected String instructor;

   Slip(int credit, String course, String instructor) {
      this.credit = credit;
      this.instructor = instructor;
      this.course = course;
   }
}
//slip for semister 1 year 1

 class Semister11 extends Slip{
  public  static List<Semister11> semi11 = new ArrayList();


   Semister11(String course, int credit, String instructor) {
      super(credit,course,instructor);
   }
// object adding to the arraylist of the class
   public void objectadding(Semister11 object11) {
      semi11.add(object11);
   }

  

public String getcourse() {
     return course;
   }

   public String getinstructor() {
       return this.instructor;
        }

    public int getcredit() {
       return this.credit;
        }

   public void showing() {
      for(int var2= 0; var2< semi11.size(); ++var2) {
         Semister11 obj = (Semister11)semi11.get(var2);
         String slip=("""
                             ...............................................................
                       ..... .course:-%s ......  credit:-%s ............  instructor:-%s..
                        ....................................................................                                                             
                 """);
                  System.out.println(
                String.format(slip, obj.getinstructor(), obj.getcredit(), obj.getinstructor()));
                  
         
      }

   }


}
// slip for semister two year two
class Semister12 extends Slip {
    static List<Semister12> semi12 = new ArrayList();

   public Semister12(String var1, int var2, String var3) {
      super(var2, var1, var3);
   }

   public void objectadding(Semister12 var1) {
      semi12.add(var1);
   }

   public String getcourse() {
      return this.course;
   }

   public String getinstructor() {
      return this.instructor;
   }

   public int getcredit() {
      return this.credit;
   }

      public void showing() {
      for(int var2= 0; var2< semi12.size(); ++var2) {
         Semister12 obj = (Semister12)semi12.get(var2);
         String slip=("""
                             ...............................................................
                       ..... .course:-%s ......  credit:-%s ............  instructor:-%s..
                        ....................................................................                                                             
                 """);
                  System.out.println(
                String.format(slip, obj.getinstructor(), obj.getcredit(), obj.getinstructor()));
                  
         
      }
    }
   }
   // year 2 semister 1
   class Semister21 extends Slip {
   static List<Semister21> semi21 = new ArrayList();

   Semister21(String var1, int var2, String var3) {
      super(var2, var1, var3);
   }

   public void objectadding(Semister21 var1) {
      semi21.add(var1);
   }

   public String getcourse() {
      return this.course;
   }

   public String getinstructor() {
      return this.instructor;
   }

   public int getcredit() {
      return this.credit;
   }

   public void showing() {
    
      for(int var2= 0; var2< semi21.size(); ++var2) {
         Semister21 obj = (Semister21)semi21.get(var2);
         String slip=("""
                             ...............................................................
                       ..... .course:-%s ......  credit:-%s ............  instructor:-%s..
                        ....................................................................                                                             
                 """);
                  System.out.println(
                String.format(slip, obj.getinstructor(), obj.getcredit(), obj.getinstructor()));
                  
         
      }

   }
}
//slip for year 2 semister 2
class Semister22 extends Slip {
   ArrayList<Semister22> semi22 = new ArrayList();

   Semister22(String var1, int var2, String var3) {
      super(var2, var1, var3);
   }

   public void objectadding(Semister22 var1) {
      this.semi22.add(var1);
   }

   public String getcourse() {
      return this.course;
   }

   public String getinstructor() {
      return this.instructor;
   }

   public int getcredit() {
      return this.credit;
   }

    public void showing() {
    
      for(int var2= 0; var2< semi22.size(); ++var2) {
         Semister22 obj = (Semister22)semi22.get(var2);
         String slip=("""
                             ...............................................................
                       ..... .course:-%s ......  credit:-%s ............  instructor:-%s..
                        ....................................................................                                                             
                 """);
                  System.out.println(
                String.format(slip, obj.getinstructor(), obj.getcredit(), obj.getinstructor()));   
      }


   }
}
// year 3 semister1
class Semister31 extends Slip {
   static List<Semister31> semi31 = new ArrayList();

   Semister31(String var1, int var2, String var3) {
      super(var2, var1, var3);
   }

   public void objectadding(Semister31 var1) {
      semi31.add(var1);
   }

   public String getcourse() {
      return this.course;
   }

   public String getinstructor() {
      return this.instructor;
   }

   public int getcredit() {
      return this.credit;
   }
   public void showing() {
    for(int var2= 0; var2< semi31.size(); ++var2) {
         Semister31 obj = (Semister31)semi31.get(var2);
         String slip=("""
                             ...............................................................
                       ..... .course:-%s ......  credit:-%s ............  instructor:-%s..
                        ....................................................................                                                             
                 """);
                  System.out.println(
                String.format(slip, obj.getinstructor(), obj.getcredit(), obj.getinstructor()));   
      }


    }
   }
   //year 3 semister 2
   class Semister32 extends Slip {
   static List<Semister32> semi32 = new ArrayList();

   public Semister32(String var1, int var2, String var3) {
      super(var2, var1, var3);
   }

   public void objectadding(Semister32 var1) {
      semi32.add(var1);
   }

   public String getcourse() {
      return this.course;
   }

   public String getinstructor() {
      return this.instructor;
   }

   public int getcredit() {
      return this.credit;
   }

   public void showing() {
    for(int var2= 0; var2< semi32.size(); ++var2) {
         Semister32 obj = (Semister32)semi32.get(var2);
         String slip=("""
                             ...............................................................
                       ..... .course:-%s ......  credit:-%s ............  instructor:-%s..
                        ....................................................................                                                             
                 """);
                  System.out.println(
                String.format(slip, obj.getinstructor(), obj.getcredit(), obj.getinstructor()));   
      }

   }
}

//year 4 semister1
class Semister41 extends Slip {
   static List<Semister41> semi41 = new ArrayList();

   public Semister41(String var1, int var2, String var3) {
      super(var2, var1, var3);
   }

   public void objectadding(Semister41 var1) {
      semi41.add(var1);
   }

   public String course() {
      return this.course;
   }

   public String getinstructor() {
      return this.instructor;
   }

   public int getcredit() {
      return this.credit;
   }
public void showing() {
    for(int var2= 0; var2< semi41.size(); ++var2) {
         Semister41 obj = (Semister41)semi41.get(var2);
         String slip=("""
                             ...............................................................
                       ..... .course:-%s ......  credit:-%s ............  instructor:-%s..
                        ....................................................................                                                             
                 """);
                  System.out.println(
                String.format(slip, obj.getinstructor(), obj.getcredit(), obj.getinstructor()));   
      }

   }
}
// year 4 semister2
class Semister42 extends Slip {
   static List<Semister42> semi42 = new ArrayList();

   public Semister42(String var1, String var2, int var3) {
      super(var3, var1, var2);
   }

   public void objectadding(Semister42 var1) {
      semi42.add(var1);
   }

   public String getcourse() {
      return this.course;
   }

   public static List<Semister42> getSemi42() {
      return semi42;
   }

   public String getinstructor() {
      return this.instructor;
   }

   public int getcredit() {
      return this.credit;
   }

public void showing() {
    for(int var2= 0; var2< semi42.size(); ++var2) {
         Semister42 obj = (Semister42)semi42.get(var2);
         String slip=("""
                             ...............................................................
                       ..... .course:-%s ......  credit:-%s ............  instructor:-%s..
                        ....................................................................                                                             
                 """);
                  System.out.println(
                String.format(slip, obj.getinstructor(), obj.getcredit(), obj.getinstructor()));   
      }

   }
   
}
// class for year 5 semister 1
class Semister51 extends Slip {
   static List<Semister51> semi51 = new ArrayList();

   public Semister51(String var1, int var2, String var3) {
      super(var2, var1, var3);
   }

   public void objectadding(Semister51 var1) {
      semi51.add(var1);
   }

   public String getcourse() {
      return this.course;
   }

   public String getinstructor() {
      return this.instructor;
   }

   public int getcredit() {
      return this.credit;
   }

   public void showing() {
    for(int var2= 0; var2< semi51.size(); ++var2) {
         Semister51 obj = (Semister51)semi51.get(var2);
         String slip=("""
                             ...............................................................
                       ..... .course:-%s ......  credit:-%s ............  instructor:-%s..
                        ....................................................................                                                             
                 """);
                  System.out.println(
                String.format(slip, obj.getcourse(), obj.getcredit(), obj.getinstructor()));   
      }

   }
   }
   // class for year 5 semister 2
   class Semister52 extends Slip {
   static List<Semister52> semi52 = new ArrayList();

   public Semister52(String var1, int var2, String var3) {
      super(var2, var1, var3);
   }

   public void objectadding(Semister52 var1) {
      semi52.add(var1);
   }

   public String getcourse() {
      return this.course;
   }

   public String getinstructor() {
      return this.instructor;
   }

   public int getcredit() {
      return this.credit;
   }
   public void showing() {
    for(int var2= 0; var2< semi52.size(); ++var2) {
         Semister52 obj = (Semister52)semi52.get(var2);
         String slip=("""
                             ...............................................................
                       ..... .course:-%s ......  credit:-%s ............  instructor:-%s..
                        ....................................................................                                                             
                 """);
                  System.out.println(
                String.format(slip, obj.getcourse(), obj.getcredit(), obj.getinstructor()));   
      }

   }

 
}




   









