import org.testng.annotations.*;

public class Part1Testing {
    //test annotation
    @Test
    void test1(){
        System.out.println("Test1 is passed" );

    }
    @BeforeSuite
    void test2(){
        System.out.println("Test2 is passed");


    }
    @AfterSuite
    void test3(){
        System.out.println("Test3 is passed");
    }
    @BeforeTest
    void test4(){
        System.out.println("Test 4 is passed");

    }
    @AfterTest
    void test5(){
        System.out.println("Test5 is passed");

    }
    @BeforeClass
    void test6(){
        System.out.println("Test6 is passed");
    }

}
