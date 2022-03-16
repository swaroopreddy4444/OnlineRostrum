package OnlineRostrum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countwords {

	public static void main(String[] args) {

		String s = "I am very very very good good boy in the class";
		String[] List = s.split(" ");
		Map<String, Integer> wc = new HashMap<String, Integer>();
		System.out.println(Arrays.toString(List));
		System.out.println("Total word count:" + List.length);

		for (int i = 0; i < List.length; i++) {
			int count = 0;
			for (int j = 0; j < List.length; j++) {
				
				if (List[i].equalsIgnoreCase(List[j]))
					count++;

			}
			wc.put(List[i], count);
		}
		System.out.println("Unique word count:" + wc.size());
		for (Map.Entry<String, Integer> x : wc.entrySet())
			System.out.println(x.getKey() + "\t : " + x.getValue());

	}

}
