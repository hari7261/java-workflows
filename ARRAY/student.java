class std1 {
    int rollno;
    String name;
    String Dept;

    void insert(int R, String N, String D) {
        rollno = R;
        name = N;
        Dept = D;
    }

    void showstudent() {
        System.out.println(rollno + " " + name + " " + Dept);
    }
}

    class student {
        public static void main(String[] args) {
            std1 s1 = new std1();
            std1 s2 = new std1();

            s1.insert(01, "hariom", "CSE");
            s2.insert(02, "devanand", "CSE");

            s1.showstudent();
            s2.showstudent();

        }

    }

