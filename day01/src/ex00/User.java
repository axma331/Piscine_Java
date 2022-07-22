public class User {
	private static int id = 0;
	private Integer	identifier;
	private String	name;
	private Integer	balanse;

	public User(String name, Integer balanse) {
		this.name = name;
		this.balanse = balanse < 0 ? 0 : balanse;
		this.identifier = ++id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalanse(Integer balanse) {
		this.balanse = balanse;
	}

	public Integer getIdentifier() {
		return identifier;
	}

	public String getName() {
		return name;
	}

	public Integer getBalanse() {
		return balanse;
	}

	@Override
	public String toString() {
		return getName() + "`s balans is $" + getBalanse();
	}
}
