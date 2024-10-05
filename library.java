class hell {
    int bookno;
    String name;
    Float id;

    void insert(int B, String N, Float ids) {
        bookno = B;
        name = N;
        id = ids;
    }

    void checkbook(int B) {
        if (bookno == B) {
            System.out.println(bookno + " " + "avalaible");
        } else {
            System.out.println(bookno + " " + "not avaliable");
        }

    }

    void borrowbook(String N, Float ids) {
        if (bookno >= ids) {
            System.out.println(name + " " + "borrow");
        }
    }

    void display() {
        System.out.println(name + " " + bookno + " " + id);
    }
}

class library {
        public static void main(String[] args) {
            hell l1 = new hell();
            l1.insert(1, "english",2.2f);
            l1.checkbook(1);
            l1.display();
            l1.borrowbook("english",2.2f);
        }
    }

