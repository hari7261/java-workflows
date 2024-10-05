package OOPS;

class MethodOverloading {
    int add(int a, int b) {
        return a + b;
    }

    // int add(int a, int b, int c) {
    //     return a + b + c;
    // }

    int sub(int a, int b, int c, int d) {
        return a - b + c + d;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.add(10, 20));
        // System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.sub(10, 20, 30, 40));
    }
}