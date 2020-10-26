import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class MaxMin {
	public String solution(String s) {
		    StringBuilder sb = new StringBuilder();
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        String answer = "";
        int num;

        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
        	num = Integer.parseInt(st.nextToken()); 
			    a.add(num);
		    }
        
        Collections.sort(a);
        
        sb.append(a.get(0));
        sb.append(" ");
        sb.append(a.get(a.size() - 1));
        
        answer = sb.toString();
        
        return answer;
    }
}
