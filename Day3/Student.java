public class Student{
    Integer id;
    String name;
    static String clg;//static becoz this clg is same for all students in a clg , I dont want to waste the memory ->this can be shared by all 
//Default constructor
    public Student(){

    } 
//Parameterized constructor
    public Student(Integer id,String name){
       this.id=id;
       this.name=name;
       //this.clg=clg;->not needed 
    }
    public void display(){
        System.out.println("Id: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Clg: "+clg);//Shared memory->memory will not be created again and again for same clg 

    }
}