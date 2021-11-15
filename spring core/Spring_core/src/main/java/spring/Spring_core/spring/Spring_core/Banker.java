package spring.Spring_core.spring.Spring_core;

public class Banker 
{
  String name;
  String address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public Banker() {
	super();
}
@Override
public String toString() {
	return "Banker [name=" + name + ", address=" + address + "]";
}
}
