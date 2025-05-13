

class course{
    String coursename;
    int marks;
    course(String coursename,int marks){
        this.coursename=coursename;
        this.marks=marks;
    }
    String getcoursename(){
        return coursename;
    }
    int getmarks(){
        return marks;
    }
}
class student{
    String name;
    String prg;
    int sem;
    course course1;
    course course2;
    student(String name,String prg,int sem){
        this.name=name;
        this.prg=prg;
        this.sem=sem;
    }
    void registercourse(course c1,course c2){
        this.course1=c1;
        this.course2=c2;
    }
    void display(){
        System.out.println("student name:"+name);
        System.out.println("program:"+prg);
        System.out.println("semester:"+sem);
        System.out.println("registered course:"+course1.getcoursename()+","+course2.getcoursename());
    }
    void displaylowmarks(){
        if(course1.getmarks()<40){
            System.out.println(course1.getcoursename()+"-marks"+course1.getmarks());
        }
        if(course2.getmarks()<40){
            System.out.println(course2.getcoursename()+"-marks"+course2.getmarks());
        }
    }
}
public class demo{
    public static void main(String[] args) {
        course c1= new course("maths", 25);
        course c2=new course("science", 50);
        student s1=new student("Aman", "bca", 4);
        s1.registercourse(c1, c2);
        s1.display();
        System.out.println("subject with marks less than 40");
        s1.displaylowmarks();
    }
}
