package java_assgnment;
import java.util.HashSet;
public class hashset {

	public static void main(String[] args) {
		
    Employee obj=new Employee();
    obj.displayDetails();
}
}
	class Employee
	{
			void displayDetails()
			{
				HashSet h=new HashSet();
				h.add(1);
				h.add("manish");
				h.add(20000);
				h.add("CSE");
			System.out.print(h);

			}
	
}
