class Student {
    int id;
    String name;
}

class TestStudent1{
    public static void main(String arg[]){
        Student s1= new Student();
        System.out.print(s1.id);
        System.out.print(s1.name);


        Student s2 = new Student();
        s1.id = 101;
        s1.name = "Sonoo";


        s2.id = 102;
        s2.name = "Amit";


    }
}
