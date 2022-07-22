public class UsersArrayList implements UsersList {
	private User[] arr;
	private Integer count;

	private static Integer DEFAULT_SIZE = 10;

	public UsersArrayList() {
		arr = new User[DEFAULT_SIZE];
		count = 0;
	}

	public void add(User user) {
		if (arr.length == count) {
			User[] newArr = new User[count * 2];
			for (int i = 0; i < arr.length; ++i) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}
		arr[count] = user;
		++count;
	}

	public User getById(Integer id) {
		for (int i = 0; i < count; ++i) {
			if (id.equals(arr[i].getIdentifier())) {
				return arr[i];
			}
		}
		throw new UserNotFoundException("User not found!");
	}

	public User getByIndex(Integer id) {
		if (id < 0 || id >= count) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return arr[id];
	}

	public Integer getCount() {
		return count;
	}
}

