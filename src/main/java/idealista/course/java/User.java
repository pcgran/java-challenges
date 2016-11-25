package idealista.course.java;

public class User {
	
	private final static String[] names = {"Jon", "Arya", "Ned", "Jaime", "Cersei", 
			"Joffrey", "Sansa", "Dany", "Tyrion", "Ramsay", "Catelyn", "Theon"};
	private final static String[] prefixes = {"33", "34", "35", "36"};
	
	private final Integer id;
	private final String name;
	private final String phone;
	
	public User(Integer id, String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
	
	public static User createRandomUser() {
		Integer id = (int) (Math.random() * 100000);
		String name = names[(int) (Math.random() * (names.length))];
		String phone = prefixes[(int) (Math.random() * (prefixes.length))] + "910000000";
		return new User(id,name,phone);
	}
}
