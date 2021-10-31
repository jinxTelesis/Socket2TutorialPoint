public class Bike1 {
    Bike1(){System.out.println("Bike is created"); }

    public static void main(String args[]){
        Bike1 b = new Bike1(); //default constructor

        Student5 s1 = new Student5();
        Student5 s2 = new Student5();
    }

    static class Student5 {
        int id;
        String name;

        void display() {
            System.out.print(id + " " + name);
        }
    }
}
