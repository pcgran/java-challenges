package idealista.course.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Ad {
	
	private final User user;
	private final LocalDate date;
	private final Typology typology;
	private final Operation operation;
	private final Double price;

	public Ad(User user, LocalDate date, Typology typology, Operation operation, Double price) {
		this.user = user;
		this.date = date;
		this.typology = typology;
		this.operation = operation;
		this.price = price;
	}

	public User getUser() {
		return user;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public Typology getTypology() {
		return typology;
	}
	
	public Operation getOperation() {
		return operation;
	}

	public Double getPrice() {
		return price;
	}

	public enum Typology {
		House, Garage, Office
	}
	
	public enum Operation {
		Sale, Rent
	}

	public static List<Ad> sampleLargeListOfAds() {
		List<Ad> adList = new ArrayList<>();
		IntStream.range(0, 300)
			.parallel()
			.forEach(i -> adList.add(createRandomAd()));
		return adList;
	}

	public static Ad createRandomAd() {
		User user = User.createRandomUser();
		LocalDate date = LocalDate.now();
		Typology typology = Typology.values()[(int)(Math.random() * 3)];
		Operation operation = Operation.values()[(int)(Math.random() * 2)];
		Double price = Math.random() * 1000000;
		return new Ad(user, date, typology, operation, price);
	}
}
