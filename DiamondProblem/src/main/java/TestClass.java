public class TestClass implements Interface1, Interface2{


    @Override
    public void testMethod() {
        Interface1.super.testMethod();
    }
}
