package ClassesAndObject;

public class CreatingObjec {
    public static void main(String[] args) {
    }
    public void test() {
        System.out.println("Hi");
    }
}
class B {
    public static void main(String args[ ]) {
        CreatingObjec  obj = new CreatingObjec();
        obj.test();
    }

}