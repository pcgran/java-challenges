package idealista.course.java;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Map;

public class SessionOne {
	
	public static List<String> getSpanishPhoneFromAds() {
		return Ad.sampleLargeListOfAds().stream()
			.map(ad -> ad.getUser().getPhone())
			.filter(phone -> phone.startsWith("34"))
			.collect(toList());
	}

	public static Map<User, Ad> cheapestAdByUser() {
		return null;
	}

	public static String aTextWithNumberOfAdsByUser() {
		return null; // El usuario {nombre} tiene {numero} anuncios \n
	}
}
