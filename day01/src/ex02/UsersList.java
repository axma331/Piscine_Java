public interface UsersList {
	void add(User user);
	User getById(Integer id);
	User getByIndex(Integer idx);
	Integer getCount();
}
