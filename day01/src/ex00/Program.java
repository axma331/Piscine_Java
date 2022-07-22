public class Program {
	public static void main(String[] args) {

		User Mike = new User("Mike", 2000);
		User Sam = new User("Sam", 100);
		User Nik = new User("Nik", -1000);
		System.out.println(Mike);
		System.out.println(Sam);
		System.out.println(Nik);

		Transaction T1 = new Transaction(Mike, Sam, Transaction.Type.DEBIT, 100);
		System.out.println(T1);
		Transaction T2 = new Transaction(Mike, Sam, Transaction.Type.CREDIT, -500);
		System.out.println(T2);
		Transaction T3 = new Transaction(Nik, Sam, Transaction.Type.DEBIT, 300);
		System.out.println(T3);
		System.out.println(Mike);
		System.out.println(Sam);
		System.out.println(Nik);
	}
}