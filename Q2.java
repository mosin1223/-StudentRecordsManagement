import java.util.*;
class Student{
    private String name ;
    private int age;
     String id ;
    Student(String name,String id , int age){
        this.name=name ;
        this.id=id;
        this.age=age;
    }

    void Display(){
        System.out.println(name +" , "+id +" , "+age);
    }
}
public class Q2 {
    static Student[] S1 = new Student[3];
    public static void main(String args[]){
        Scanner write = new Scanner(System.in);
        String name,id;
        int age;

        for (int i=0; i<3; i++){
            System.out.println("Student : "+(i+1));

            System.out.print("Enter student name : ");
            name= write.nextLine();

            System.out.print("Enter the student id : ");
            id = write.nextLine();

            System.out.print("Enter the student age  : ");
            age = write.nextInt();
            write.nextLine();
            S1[i] = new Student(name , id ,age);
        }
        for(int j=0;j<3;j++){
            S1[j].Display();
        }
        System.out.print("Enter the student id to search ");
        String find = write.nextLine();

        Student finding = findingStudent(find);

        if(finding !=null){
            System.out.println("Student found ");
            finding.Display();
        }
        else{
            System.out.println("not found ");
        }
    }
    public static Student findingStudent(String id ){
        for(Student student : S1){
            if(student != null && student.id.equalsIgnoreCase(id)){
                return student ;

            }
        }
        return null;

    }


}
