
public class Node {
	
	//Student
	public String name;
	public int age;
	public int id;
	
	public Node next; //Pointer
	
	public Node() {}
	
	public Node(String name, int age, int id)
	{
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public String toString()
	{
		return "Name: " + this.name + "\tAge: " + this.age + "\tID: " + this.id + "\n";
	}
}
