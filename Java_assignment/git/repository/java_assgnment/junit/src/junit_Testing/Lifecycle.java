package junit_Testing;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
public class Lifecycle
{

    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }
     
    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }
     
    @Test
    void testCalcOne() 
    {
       // System.out.println("======TEST ONE EXECUTED=======");
        junit_Testing j = new junit_Testing();    
        int output=j.array();
        assertEquals(6,output);
    }
     
   
     
    private void assertEquals(int i, int output) {
		// TODO Auto-generated method stub
		
	}

	@AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }
     
    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
}
}