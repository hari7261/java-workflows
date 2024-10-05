package OOPS;

public class inheritance1 {
    int id;
    String name;
    int rollno;
}

class students extends inheritance1 {
    public static void main(String[] args) {
        inheritance1 s1 = new inheritance1();
        System.out.println("id:" + s1.id);
        System.out.println("name:" + s1.name);
        System.out.println("roll no:" + s1.rollno);
    }
}