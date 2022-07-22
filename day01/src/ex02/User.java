public class User {
	private Integer	identifier;
	private String	name;
	private Integer	balanse;

	public User(String name, Integer balanse) {
		this.name = name;
		this.balanse = balanse < 0 ? 0 : balanse;
		this.identifier = UserIdsGenerator.getInstance().generateIs();
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
		return "id:" + getIdentifier() + " " + getName() + " balans is $" + getBalanse();
	}
}
