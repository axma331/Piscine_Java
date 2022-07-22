public class Program {
	public static void main(String[] args) {
		User user1 = new User("Mike", 1000);
		User user2 = new User("Sam", 100);
		User user3 = new User("Nik", -10000);

		UsersList list = new UsersArrayList();
		list.add(user1);
		list.add(user2);
		list.add(user3);

		System.out.println(list.getByIndex(0) + " == " + user1);
		System.out.println(list.getByIndex(user2.getIdentifier()) + " == " + user2);
		System.out.println("count = " + list.getCount());

		User user4 = new User("Anna", -100);
		System.out.println(list.getById(3));
		try {
		System.out.println(list.getByIndex(user4.getIdentifier())); }
		catch (IndexOutOfBoundsException e) {
			System.err.println("Invalid index");
		}
	}
}