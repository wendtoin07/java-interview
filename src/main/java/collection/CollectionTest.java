package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    return input
          .stream()
          .parallel()
          .mapToDouble(v->Math.pow((v*2)+3, 5))
          .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    return input
    		.stream()
    		.parallel()
    		.map(v->capitalize(v)+capitalize(v))
    		.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
  }
  
  public static String capitalize(String str) {
	    if(str == null || str.isEmpty()) {
	        return str;
	    }
	    return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

}
