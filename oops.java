class yogi3   // class is  blueprint of object oriantede programing langauge
{
    String name;
    static  String college;
    int age;             // variable is a container value type 
                              // 1:-local variable:-a variable is declared inside  the methode out side class
                              //2:- instance or globle variable  a variable is out side the methode and inside  class
                              // 3:- static variablr   a variable  that is declared as static  keyword is called as static variable
    
    
   

    yogi3(String name,String college,int age) // constructor is a special type of methode 
                                               // it is used in initialize object
                                               //   three type of constructor 
                                               // 1:- parameterized constructor
                                               // 2:- NO Argument constructor
                                               // 3:- Default constructor
    {
        this.name=name;
        this.college=college;
        this.age=age;
        
    }
    public void print()    // is a no static methode 
    {
        System.out.println("study in well");
        
    }

}
public class object   // main class  second class 
{
    public static void main(String[] eags)  // main methode 
    {
        yogi3 y=new yogi3("yograj","skn sinhgad",24); //  creat object
        y.print();
        System.out.println( "name="+y.name);
        System.out.println("college="+y.college);
        System.out.println("age="+y.age);
        System.out.println("-------------");

        yogi3 r=new yogi3("amar","skn sinhgad",23);
        r.print();
        System.out.println( "name="+r.name);
        System.out.println("college="+r.college);
        System.out.println("age="+r.age);



    }
}
