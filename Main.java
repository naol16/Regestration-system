
      package student;

      import java.util.Scanner;


      import java.util.ArrayList;
      import java.util.InputMismatchException;
      import java.util.List;



      public class Main {
      static ArrayList<Integer> ListOfYearAndSemister=new ArrayList<>();
      static ArrayList<Integer>arrayOfYear=new ArrayList<>(List.of(11,12,21,22,31,32,41,42,51,52));
          public static void main(String[] args) throws Exception {
          int check=2;
          while (true) {
            Scanner new1= new Scanner(System.in);
          System.out.println("""
            .............................................................................................
                                                  REGESTRATION SYSTEM FOR HARAMYA  UNIVERSTIY  SOFTWARE ENGINEERING  STUDENTS 
              
              """);
          
            System.out.println("""
                .........................................................................................................
                                    IN THIS PROGRAM THE ADMIN, FIRST THE ADMIN  MUST ADD COURSES FOR THE SPECIFIED SEMISTERS  FOR REGSTRATION
                                          THEN STUDENTS ARE GOING TO REGESTER
                ...........................................................................................................
                """);
            System.out.println("""
                ......................................................................................................
                                            DEAR ADMIN ENTER THE YEAR AND THE SEMISTER   FOR ADDING COURSES
                                            ADDING YEAR OF COURSES
                                            USE 1-FOR YEAR 1
                                                2- FOR YEAR 2
                                                3- FOR YEAR 3
                                                4- FOR YEAR 4
                                                5- FOR YEAR 5
                                            ADDING OF SEMISTER 
                                              USE 1-FOR SEMISTER 1
                                                  2- FOR SEMISTER 2
                """);
            // intput of year and semister from user
            System.out.print(
              """
                ........................................................................................
                                      ENTER THE YEAR OF THE SEASON YOU WANT ADD COURSE
                  """);
            String year=new1.next();
            System.out.println();
            System.out.print("""
              ..................................................................
                                                ENTER THE SEMISTER OF THE SEASON YOU WANT TO ADD COURSE
                """);
            String semister=new1.next();
            String yearAndSemister=year+semister;
            //ysa refers year and semister integer
            int ysa=Integer.parseInt(yearAndSemister);
            //checking if it they write for the slip semister and year
            if(arrayOfYear.contains(ysa)){
              try{
                checker(ysa);
              }
              catch(InputMismatchException ex){
                
                  System.out.println("invalid input");
                  
              }
            }
          
            else{
              while(check!=0){
              System.out.println("""
                  .............................................................................................................
                                          YEAR AND SEMISTER INPUTS ARE INVALID   PLEASE ADD AGAIN PLEASE
                  ............................ ...................................................................................
                  """);
              System.out.println("""
                ......................................................................................................
                                            ENTER THE YEAR
              ...............................................................................                              
                  """);
            String year1=new1.next();
            System.out.println("""
                                ..........................................................................................................
                                ENTER THE SEMISTER
                """);
            String semister1=new1.next();
            String yearAndSemister2=year1+semister1;
            //year and semister 2
            int yas2=Integer.parseInt(yearAndSemister2);
            //checking if it the write semister and year
            if(arrayOfYear.contains(yas2)){
              courseAdding(yas2);
              check=0;
            }
            
            }}
          }
          


            }



      

      static void checker(int  year)throws InputMismatchException{     
        int num1=0;
        int choice=9;
        
          Scanner new1= new Scanner(System.in);
        courseAdding(year);
        ListOfYearAndSemister.add(year);
            while(true){
            System.out.println("""
              ......................................................................................
                                      1, ADMIN USAGE
                                      2, STUDENT REGESTRATION 
                                      3, FOR EXIT
            ...........................................................................................
                  
                  """);
          
               choice=new1.nextInt();
  
            if(choice==2){
            System.out.println("""
              ...................................................................
                                  DEAR STUDENT ENTER  YOUR YEAR 
              ....................................................................                    
                                  """);
            String studentYear=new1.next();
            System.out.println("""
              ...............................................................................
                                  PLEASE, ENTER SMEISTER OF THE SEASON
              ...............................................................................
                """);
            String semister=new1.next();
            String studentYearAndSemister=studentYear+semister;
            int yas3=Integer.parseInt(studentYearAndSemister);
            if( ListOfYearAndSemister.contains(yas3)){
              System.out.println("""
                                          ENTER YOUR NAME
                                    
                  """);
              String name=new1.next();
              System.out.println("""
                ..........................................................
                                    ENTER YOUR ID
                ...................................................................
                  """);
              String Id=new1.next();
            
            Student new2= new Student(name, yas3,Id);
            new2.regestration(new2);
            new2.display();
            // showing the slip for the specifed year and semister
            if(yas3==11){
              Semister11 object1=new Semister11("demo", 0,"demo");
              object1.showing();

            }
            else if(yas3==12){
                Semister12 object1= new Semister12("demo", 0, "demo");
                object1.showing();
              
              
              }
            else if(yas3==21){
      Semister21 object1 =new Semister21("demo",0,"demo");
      object1.showing();
            

            }
      else if(yas3==22){
        
        Semister22 object1 =new Semister22("demo",0,"demo");
      object1.showing();
            

      }
      else if(yas3==31){
        Semister31 object1 =new Semister31("demo",0,"demo");
      object1.showing();
            

      }
      else if(yas3==32){
        
        Semister32 object1 =new Semister32("demo",0,"demo");
      object1.showing();
              }
      else if(yas3==41){
        
        Semister41 object1 =new Semister41("demo",0,"demo");
      object1.showing();
            }
      else if(yas3==42){
        
        Semister42 object1 =new Semister42("demo","demo",0);
      object1.showing();
              }
            else if(yas3==51){
        
        Semister51 object1 =new Semister51("demo",0,"demo");
      object1.showing();
              }
            else if(yas3==52){
        
        Semister52 object1 =new Semister52("demo",0,"demo");
      object1.showing();


      }
      }
      else{
        System.out.println("""
          YOUR SLIP IS NOT READY REGSTER FOR ANOTHER TIME """);
        
      }
              }
      else if (choice==1){
        System.out.println("""
          ......................................................................................
                          1, ADDING COURSE FOR OTHER SEMISTER
                          2, SHOWING REGESTERD STUDENTS
                          3,DELTEING STUDENT
                          4,REGESTERING THE STUDENT
                          5,EXIT
      ..........................................................................................................

            """);
            
        int adminchoice=new1.nextInt();
        if(adminchoice==1){
            System.out.println("""
              .........................................................................
                                      ENTER YEAR OF SEASON
                """);
            String year2=new1.next();
            System.out.println("""
                ...............................................................................
                                            ENTER SEMISTER OF THE SEASON 
                ................................. .........................................................
                """);
            String semister2=new1.next();
            String yearAndSemister2=year2+semister2;
            int year4=Integer.parseInt(yearAndSemister2);

            courseAdding(year4);
            ListOfYearAndSemister.add(year4);
        }
        else if (adminchoice==2){
          Student object1=new  Student("demo",0,"de");
          if (object1.getRegestered().size()==0){
            System.out.println("no student regesterd yet");
          }
          object1.showingStudent();
        }
        else if (adminchoice==3){
          System.out.println("""
                      ...................................................................
                            ENTER THE ID USER WANT TO DELETE
                      ....................................................................
                
                """);
          String deleteStudent=new1.next();
          Student object1=new Student(deleteStudent, year, deleteStudent);
          object1.removing(deleteStudent);
        }
      else if (adminchoice==4){
        System.out.println("""
                      ..........................................................
                      enter the name of the user you want to add
            ...............................................................................................
            """);
        String nameNew= new1.next();
        System.out.println("enter the year of the student");
        String newyear=new1.next();
        System.out.println("enter the id of the student");
        String id=new1.next();
        Student object1= new Student("te", 87, "0");
        object1.regestration(object1);

      }
      else if (adminchoice==5){
      num1=5;
      }}
      else if (choice==3){
        num1=5;

      }

                         
                  
           
    }
  }





      static  void  courseAdding(int  year1){
              Scanner scanner = new Scanner(System.in);

      System.out.println("""
        .........................................................................................................
                                ENTER THE NUMBER COURSE YOU WANT TO ADD FOR THIS SEMISTER
            
            """);
      int numOfCourse=scanner.nextInt();
            int count=0;
            while(count<numOfCourse){
              System.out.println("""
                ..........................................................................
                                      ENTER THE COURSE YOU WANT TO ADD
            """ );
              String course=scanner.next();
              System.out.println("""
                ..............................................................
                                      ENTER THE NAME OF THE INSTRUCTOR""");
              String  instructorname=scanner.next();
              System.out.println("""
                ........................................................................................................
                                        ENTER THE CREDIT HOUR FOR THE COURSE
                ................................................................................................................
                  """);
              int credit=scanner.nextInt();
              // the following code are object adding of codes into the arraylist
              if(year1==11){
              Semister11 object1= new Semister11(course,credit,instructorname);
              object1.objectadding(object1);
              object1.showing();
            }
            else if(year1==12){
                Semister12 object1= new Semister12(course,credit,instructorname);
              object1.objectadding(object1);
              
              }
            else if(year1==21){
      Semister21 object1= new Semister21(course,credit,instructorname);
              object1.objectadding(object1);

            }
      else if(year1==22){
        Semister22 object1= new Semister22(course,credit,instructorname);
              object1.objectadding(object1);

      }
      else if(year1==31){
              Semister31 object1= new Semister31(course,credit,instructorname);
              object1.objectadding(object1);

      }
      else if(year1==32){
        Semister32 object1= new Semister32(course,credit,instructorname);
              object1.objectadding(object1);}
      else if(year1==41){
        Semister41 object1= new Semister41(course,credit,instructorname);
              object1.objectadding(object1);}
      else if(year1==42){
        Semister42 object1= new Semister42(course,instructorname,credit);
              object1.objectadding(object1);}
            else if(year1==51){
        Semister51 object1= new Semister51(course,credit,instructorname);
                object1.objectadding(object1);}
            else if(year1==52){
        Semister52 object1=new Semister52(course,credit,instructorname);
        object1.objectadding(object1);

      }
      count+=1;}

      }
    
    }
                  
          

              
              
        
          
            
            
            


        
        


