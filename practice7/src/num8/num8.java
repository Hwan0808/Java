package num8;

import java.util.*;

public class num8 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String tmp;
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		Vector<String> v = new Vector<String>();
		int count;
		
		for(int i=0;i<args.length;i++) {
			
			if(m.containsKey(args[i])) {
				count = m.get(args[i]); // key °ªÀ¸·Î ÃâÇö È½¼ö Å½»ö
			}
			
			else {
				
				count=0;
			}
			
			m.put(args[i], ++count);
			v.add(args[i]);
		}
		
		System.out.println(v);
		System.out.println(m.size()+" distinct words detected");
		System.out.println(m);
		
	}

}
