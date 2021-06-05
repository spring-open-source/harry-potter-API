package com.hardik.mcgonagall.utility;

import java.util.List;
import java.util.Random;

public class SortingHatUtility {

	private static final List<String> hogwartsHouses = List.of("Gryffindor", "Ravenclaw", "Hufflepuff", "Slytherin");

	public static String choose() {
		return hogwartsHouses.get(new Random().nextInt(hogwartsHouses.size()));
	}

}
