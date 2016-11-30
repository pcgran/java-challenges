package idealista.course.java;


import static java.util.stream.Collectors.toList;

import java.util.List;

import idealista.course.java.Ad.Operation;
import idealista.course.java.Ad.Typology;

public class SessionTwo {
	
	public static double sumAllAdsPrice() {
		return Ad.sampleLargeListOfAds()
				.stream()
				.mapToDouble(Ad::getPrice)
				.sum();
	}

	public static List<User> getAllDifferentUsersNamedJuan() {
		return Ad.sampleLargeListOfAds()
				.stream()
				.map(ad -> ad.getUser())
				.filter(user -> "Juan".equals(user.getName()))
				.collect(toList());
	}

	public static Ad getOldestAd() {
		return null;
	}

	public List<String> getPhonesForHousesOnSale() {
		return Ad.sampleLargeListOfAds()
				.stream()
				.filter(ad -> Typology.House.equals(ad.getTypology()))
				.filter(ad -> Operation.Sale.equals(ad.getOperation()))
				.map(ad -> ad.getUser().getPhone())
				.distinct()
				.collect(toList());
	}

	public List<Ad> getTwoAdsWithTheSamePrice() {
		return null;
	}
}
