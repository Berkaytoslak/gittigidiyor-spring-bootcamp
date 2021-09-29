package dev.patika;

/*
     getClass VS instanceof
 */
public class TestMain {

    public static void main(String[] args) {

        TestSuper testclass = new TestSub();

        if(testclass instanceof TestSuper){
            System.out.println("testclass instanceof TestSuper");
        } else {
            System.out.println("False-01");
        }

        if(testclass.getClass() == TestSuper.class){
            System.out.println("testclass.getClass() == TestSuper.class");
        } else {
            System.out.println("False-02");
        }
    }
}

class TestSub extends TestSuper{

}

class TestSuper {

}