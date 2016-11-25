package idealista.course.java;

import java.util.List;

public class Ad {
	
	private final Integer id;
	private final Typology typology;
	private final Double price;
	private final Boolean active;
	private final User publisher;

	public Ad(Integer id, Typology typology, Double price, User publisher) {
		this.id = id;
		this.typology = typology;
		this.price = price;
		this.publisher = publisher;
		this.active = true;
	}

	private Ad(Ad ad, Boolean isActive) {
		this.id = ad.getId();
		this.typology = ad.getTypology();
		this.price = ad.getPrice();
		this.publisher = ad.getUser();
		this.active = isActive;
	}

	public Integer getId() {
		return id;
	}

	public Typology getTypology() {
		return typology;
	}

	public Double getPrice() {
		return price;
	}

	public Boolean isActive() {
		return active;
	}

	public User getUser() {
		return publisher;
	}

	public Ad deactivate() {
		return new Ad(this, false);
	}

	public enum Typology {
		House, Garage, Office
	}

	public static List<Ad> sampleLargeListOfAds() {
		return null;
	}
}
