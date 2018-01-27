
package TestPrograms1;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCollection {
	public static void main(String[] args)

	{ // a string array with duplicate values
		String data[] = { "A", "B", "C", "A", "C", "E" };
		System.out.println("The original array   :" + Arrays.toString(data));

		Collection<String> list = Arrays.asList(data);
		Set<String> set = new HashSet<String>(list);

		// Remove duplicates from the arraylist

		System.out.println("Remove duplicate from the array-result is: ");

		String[] result = new String[set.size()];

		set.toArray(result);

		for (String s : result) {
			System.out.println(s + "\t");

		}
	}
}
