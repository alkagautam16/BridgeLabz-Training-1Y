class Student{
    int id;
    int age;
    String name;
    void printdetails(){
       String college = "GLA university";
       System.out.println("Id is :"+id);
       System.out.println("age is :"+age);
       System.out.println("name is :"+name);
    
    }
    public static void main (String[] args){
        Student s1 =new Student();
        s1.id=101;
        s1.age=20;
        s1.name="alka";
        s1.printdetails();
 }
}