package com.sushavi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Demo1 {
	public static void main(String[] args) {

		List<String> fname = Arrays.asList("Pihu", "Duggu");

		List<String> lname = Arrays.asList("Pintu", "Anshika", "Shlok");

		Optional<String> name = Stream.of(fname, lname).flatMap(l -> l.stream()).filter(a -> a.startsWith("P"))
				.findFirst();

		name.ifPresent(i -> {
			i = i.toUpperCase();
			System.out.println(i);

		});
		System.out.println(name.get());

	}
}
