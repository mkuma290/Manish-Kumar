package spring.Spring_core.spring.Spring_core;

public class student 
{
   int id;
  String name;
   public student(int id,String name)
   {
	   this.id=id;
	   this.name=name;
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString()
{
	return "student [id=" + id + ", name=" + name + "]";
}

public int getId()
{
	return id;
}

public void setId(int id) {
	this.id = id;
}

public student() {
	super();
	// TODO Auto-generated constructor stub
}
   
}
