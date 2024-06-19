import java.sql.SQLOutput;

public interface Interface1 {
    default void testMethod() {
        System.out.println("This is printing from Interface1.");
    }
}
