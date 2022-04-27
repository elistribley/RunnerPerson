package newstuff;

public class Runner {
	
	public static void main(String[] args) {
		
		Person john = new Person("John", 20, 11.5, 159, "Fishing");
		Person kay = new Person("Kay", 15, 11, 189, "Cycling");
		Person paul = new Person("Paul", 23, 9, 167, "Running");
		Person roger = new Person("Roger", 76, 9.5, 175, "Baking");
		Person aswenie = new Person("Bilbo", 43, 13, 172, "Hockey");
		john.introduction();
		kay.introduction();
		paul.introduction();
		roger.introduction();
		aswenie.introduction();
		
		john.chatting();
		kay.chatting();
		paul.chatting();
		roger.chatting();
		aswenie.chatting();
		
		
}
		
	
}
	
	
	