package linkedList;

public class mainApp {

	public static void main(String[] args) {
		Link nipuna = new Link("nipuna", 53.5);
		Link aravinda = new Link("aravinda",78.0);
		Link prashani = new Link("prashani", 69.5);
		
		
		nipuna.next=aravinda;
		aravinda.next=prashani;
		prashani.next=null;
		
		
		nipuna.displaydetails();
		aravinda.displaydetails();
		prashani.displaydetails();
		
		linkedList studentList = new linkedList();
		studentList.insertFirst("nipuna", 53.5);
		studentList.insertFirst("aravinda",78.0);
		studentList.insertFirst("prashani", 69.5);
		
		studentList.displayList();
		studentList.deleteLink("aravinda");
		
		System.out.println("....deleted.....");
		studentList.displayList();

		
	}

}
