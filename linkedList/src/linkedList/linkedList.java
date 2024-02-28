package linkedList;

public class linkedList {
	Link first;
	
	public linkedList() {
		first=null;
	}
	
	public boolean isEmpty() {
		return (first == null);
		}
	public void insertFirst(String name, double Average) {
		Link newLink=new Link(name,Average);
		newLink.next=first;
		first=newLink;
	}
	public Link deleteFirst() {
		Link temp =first;
		first=first.next;
		return temp;	
		
	}
	public void displayList() {
		Link current=first;
		while(current!=null) {
			current.displaydetails();
			current=current.next;
				
		}
	}
	public Link deleteLink(String name) {
		Link current=first;
		Link previous=first;
	if(current==null) {
		return null;
	}
		while(!current.name.equals(name)) {
			previous =current;
			current=current.next;
		}
	if(current==first) {
		first=first.next;
	}
	else {
		previous.next=current.next;
	}
	return current;
		
	}
	

}
