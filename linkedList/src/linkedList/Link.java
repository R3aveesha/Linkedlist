package linkedList;

public class Link {
	public String name;
	public double Average;
	public Link next;
	
	public Link(String name,double Average) {

		this.Average=Average;
		this.name=name;
	}
	public void displaydetails() {
			System.out.println("name:"+name+" average:"+Average);
	}

	
}